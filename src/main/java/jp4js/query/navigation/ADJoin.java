package jp4js.query.navigation;

import jp4js.utils.iter.Iter;
import jp4js.query.PlanOperator;

public class ADJoin implements PlanOperator<Item> {
    private PlanOperator<Item> ancestorPlanOp;
    private PlanOperator<Item> decedentPlanOp;

    public ADJoin(PlanOperator<Item> ancestorPlanOp, PlanOperator<Item> decedentPlanOp) {
        this.ancestorPlanOp = ancestorPlanOp;
        this.decedentPlanOp = decedentPlanOp;
    }

    @Override
    public Iter<Item> iterator() {
        return new ADJoinIter(this.ancestorPlanOp.iterator(), this.decedentPlanOp.iterator());
    }

    static class ADJoinIter extends PCJoin.PCJoinIter {

        public ADJoinIter(Iter<Item> pIter, Iter<Item> cIter) {
            super(pIter, cIter);
        }

        protected void readBuffer() {
            if (this.buffer.size() > 0) return;

            while (this.pIter.hasNext() && this.buffer.size() == 0) {
                while (cIter.hasNext() && cIter.read().getData().getLastVisit() < pIter.read().getData().getFirstVisit())
                    cIter.next();
                while (cIter.hasNext() && cIter.read().getData().getFirstVisit() < pIter.read().getData().getFirstVisit())
                    cIter.next();
                while (cIter.hasNext() && cIter.read().getData().getLastVisit() < pIter.read().getData().getLastVisit()) {
                    this.buffer.add(merge(pIter.read(), cIter.read()));
                    cIter.next();
                }
                this.pIter.next();
            }
        }
    }
}