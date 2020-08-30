package jp4js.storage.node;

import jp4js.utils.iter.Iter;

import java.util.LinkedList;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SingleNodeIteratorTest {
    @Test
    public void testSingleNodeIteratorSanity() {
        LinkedList<LabelNode> l = new LinkedList<LabelNode>() {{
            add(NodeFactory.create(0, 0, 10, 1, null));
            add(NodeFactory.create(0, 1, 5, 2, null));
        }};

        Iter<LabelNode> iter = new SingleNodeIterator(l);
        assertThat(iter.read()).isEqualToIgnoringNullFields(NodeFactory.create(0, 0, 10, 1, null));
        iter.next();
        assertThat(iter.read()).isEqualToIgnoringNullFields(NodeFactory.create(0, 1, 5, 2, null));
        iter.next();
        assertThat(iter.hasNext()).isEqualTo(false);
    }
}
