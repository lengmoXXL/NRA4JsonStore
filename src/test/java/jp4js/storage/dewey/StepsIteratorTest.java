package jp4js.storage.dewey;

import jp4js.algebra.DType;
import jp4js.algebra.Scalar;
import jp4js.algebra.op.structure.StructureRelation;
import jp4js.algebra.op.structure.StructureSteps;
import jp4js.utils.iter.CompareIter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StepsIteratorTest {
    @Test
    public void basic01_() {
        ArrayList<IndexNode> data = new ArrayList<>() {{
            add(new IndexNode(new LinkedList<>(Arrays.asList(0, 0)), Scalar.createDInt(1)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(0, 1)), Scalar.createDInt(2)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 0)), Scalar.createDInt(3)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 1)), Scalar.createDInt(4)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 2)), Scalar.createDInt(5)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 3)), Scalar.createDInt(6)));
        }};

        StructureSteps steps = new StructureSteps();
        steps.addStep(StructureRelation.PC, "*");
        steps.addStep(1, 2);

        StepsIterator iter = new StepsIterator(steps, data);

        CompareIter.assertEqual(
            iter,
            new LinkedList<DType.Instance>(
                Arrays.asList(
                    Scalar.createDInt(2),
                    Scalar.createDInt(4)
                )
            ),
            (IndexNode node, DType.Instance ins) -> {
                return node.value.equals(ins);
            }
        );
    }

    @Test
    public void basic02_() {
        ArrayList<IndexNode> data = new ArrayList<>() {{
            add(new IndexNode(new LinkedList<>(Arrays.asList(0, 0)), Scalar.createDInt(1)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(0, 1)), Scalar.createDInt(2)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 0)), Scalar.createDInt(3)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 1)), Scalar.createDInt(4)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 2)), Scalar.createDInt(5)));
            add(new IndexNode(new LinkedList<>(Arrays.asList(1, 3)), Scalar.createDInt(6)));
        }};

        StructureSteps steps = new StructureSteps();
        steps.addStep(1, 2);
        steps.addStep(StructureRelation.PC, "*");

        StepsIterator iter = new StepsIterator(steps, data);

        CompareIter.assertEqual(
            iter,
            new LinkedList<DType.Instance>(
                Arrays.asList(
                    Scalar.createDInt(3),
                    Scalar.createDInt(4),
                    Scalar.createDInt(5),
                    Scalar.createDInt(6)
                )
            ),
            (IndexNode node, DType.Instance ins) -> {
                return node.value.equals(ins);
            }
        );

    }
}
