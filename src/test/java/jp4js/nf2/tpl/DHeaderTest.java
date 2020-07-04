package jp4js.nf2.tpl;

import jp4js.nf2.Scalar;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;

public class DHeaderTest {

    @Test
    public void testBasicUsageCreation01() {
        DHeader rel = new DHeaderBuilder()
            .put("field1")
            .put("field2")
            .put("field3")
            .enter("field4")
                .put("field1")
                .put("field2")
            .exit()
            .build();
        System.out.println(rel.toString());
        assertThat(rel.toString()).isEqualTo(
            "[field1, field2, field3, field4[field1, field2]]"
        );
    }

    @Test
    public void testBasicUsageBuildInstance01() {
        DRepeatableBody ins = new DRepeatableBody(
            new LinkedList<>() {{
                add(
                    new DSingularBody(
                        new DBody[] {
                            new DSingularBody(Scalar.createDInt(20)),
                            new DSingularBody(Scalar.createDString("Alice"))
                        }
                    )
                );
                add(
                    new DSingularBody(
                        new DBody[] {
                            new DSingularBody(Scalar.createDInt(10)),
                            new DSingularBody(Scalar.createDString("Alice"))
                        }
                    )
                );
            }}
        );
        System.out.println(ins.toString());
        assertThat(ins.toString()).isEqualTo(
            "[(20, \"Alice\"), (10, \"Alice\")]"
        );
    }

    @Test
    public void testBasicUsageBuildInstance02() {
        DRepeatableBody instance = new DRepeatableBody(
            new LinkedList<>() {{
                add(
                    new DSingularBody(
                        new DBody[] {
                            new DSingularBody(Scalar.createDInt(23)),
                            new DRepeatableBody(
                                new LinkedList<>() {{
                                    add(new DSingularBody(
                                        new DBody[]{
                                            new DSingularBody(Scalar.createDString("English")),
                                            new DSingularBody(Scalar.createDInt(100))
                                        }
                                    ));
                                    add(new DSingularBody(
                                        new DBody[]{
                                            new DSingularBody(Scalar.createDString("Chinese")),
                                            new DSingularBody(Scalar.createDInt(10))
                                        }
                                    ));
                                }}
                            ),
                            new DSingularBody(Scalar.createDString("L"))
                        }
                    )
                );
            }}
        );
        System.out.println(instance.toString());
        assertThat(instance.toString()).isEqualTo(
            "[(23, [(\"English\", 100), (\"Chinese\", 10)], \"L\")]"
        );
    }
}