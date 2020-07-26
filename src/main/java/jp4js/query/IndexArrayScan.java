package jp4js.query;

import jp4js.utils.iter.Iter;

import static jp4js.storage.node.LabelArray.ArraySelections;

import jp4js.query.PlanOperator;
import jp4js.storage.IndexContext;
import jp4js.storage.node.LabelNode;
import jp4js.utils.Utils;


public class IndexArrayScan implements PlanOperator<LabelNode> {

    private ArraySelections selections;
    private IndexContext indexContext;

    public IndexArrayScan(IndexContext indexContext,
                          ArraySelections selections) {

        Utils.isTrue(indexContext != null && selections != null, "Index Context must not be null "
            +"and Selections must not be null");
        this.indexContext = indexContext;
        this.selections = selections;
    }

    @Override
    public Iter<LabelNode> iterator() {
        return this.indexContext.openArray(selections);
    }
}
