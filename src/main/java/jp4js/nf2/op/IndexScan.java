package jp4js.nf2.op;

import jp4js.nf2.op.structure.StructureSteps; 
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import jp4js.storage.IndexContext;
import jp4js.storage.node.RepeatableNode;
import jp4js.storage.node.SingularNode;
import jp4js.storage.node.IndexNode;
import jp4js.utils.iter.Iter;


public class IndexScan {
    public static List<IndexNode> children(IndexContext indexContext, List<IndexNode> sortedNodes) {
        LinkedList<IndexNode> ret = new LinkedList<>();
            Iter<IndexNode> iter = indexContext.new AllIterator();
            for (IndexNode node: sortedNodes) {
                iter.seek(node.first_visit);
                while (iter.valid()) {
                    IndexNode inode = iter.read();
                    iter.next();
                    if (inode.first_visit > node.last_visit) {
                        break;
                    } else {
                        if (node.first_visit <= inode.first_visit && inode.last_visit <= node.last_visit) {
                            if (node.level + 1 == inode.level) {
                                ret.add(inode);
                            }
                        }
                    }
                }
            }
        return ret;
    }

    public static List<IndexNode> children(IndexContext indexContext, List<IndexNode> sortedNodes, StructureSteps.PropertyStep step) {
        return new LinkedList<>() {{
            Iter<SingularNode> iter = indexContext.new SingularIterator(step.fieldname);
            for (IndexNode node: sortedNodes) {
                iter.seek(node.first_visit);
                while (iter.valid()) {
                    IndexNode inode = iter.read();
                    iter.next();
                    if (inode.first_visit > node.last_visit) {
                        break;
                    } else {
                        if (node.first_visit <= inode.first_visit && inode.last_visit <= node.last_visit) {
                            if (node.level + 1 == inode.level) {
                                add(inode);
                            }
                        }
                    }
                }
            }
        }};
    }

    public static List<IndexNode> children(IndexContext indexContext, List<IndexNode> sortedNodes, StructureSteps.IndexStep step) {
        ArrayList<Iter<RepeatableNode>> iters = new ArrayList<>();
        return new LinkedList<>() {{
            for (IndexNode node: sortedNodes) {
                while (node.level+1 >= iters.size()) iters.add(null);
                if (iters.get(node.level+1) == null) {
                    iters.set(node.level+1, indexContext.new RepeatableIterator(node.level+1));
                }
                Iter<RepeatableNode> iter = iters.get(node.level+1);
                iter.seek(node.first_visit);
                while (iter.valid()) {
                    RepeatableNode inode = iter.read();
                    iter.next();
                    if (inode.first_visit > node.last_visit) {
                        break;
                    } else {
                        if (node.first_visit <= inode.first_visit && inode.last_visit <= node.last_visit) {
                            if (step.from <= inode.index && inode.index < step.to) {
                                add(inode);
                            }
                        }
                    }
                }
            }
        }};
    }

    public static List<IndexNode> descendents(IndexContext indexContext, List<IndexNode> sortedNodes, StructureSteps.PropertyStep step) {
        return new LinkedList<>() {{
            Iter<SingularNode> iter = indexContext.new SingularIterator(step.fieldname);
            for (IndexNode node: sortedNodes) {
                iter.seek(node.first_visit);
                while (iter.valid()) {
                    IndexNode inode = iter.read();
                    iter.next();
                    if (inode.first_visit > node.last_visit) {
                        break;
                    } else {
                        if (node.first_visit <= inode.first_visit && inode.last_visit<= node.last_visit) {
                            add(inode);
                        }
                    }
                }
            }
        }};
    }
}