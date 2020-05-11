package jp4js.query.baseline;

import jp4js.parser.JsonPathBaseVisitor;
import jp4js.parser.JsonPathParser;
import jp4js.index.node.LabelArray.*;
import jp4js.utils.query.ArraySelectionsVisitor;
import jp4js.utils.Configuration;
import jp4js.utils.filter.Filter;
import jp4js.query.PlanOperator;
import jp4js.query.RecordSet.Record;
import java.util.LinkedList;

public abstract class AbstractNaive extends JsonPathBaseVisitor<Void> {
    protected Configuration configuration;
    protected PlanOperator<Record> planOp;
    public AbstractNaive(Configuration configuration) {
        this.planOp = null;
        this.configuration = configuration;
    }

    @Override
	public Void visitJsonObjectWildcardStep(JsonPathParser.JsonObjectWildcardStepContext ctx) { 
        this.planOp = NaivePlanOp.createWildcardPlanOperator(this.planOp, configuration);
        return visitChildren(ctx);
    }

    @Override
	public Void visitJsonObjectFieldNameStep(JsonPathParser.JsonObjectFieldNameStepContext ctx) { 
        this.planOp = NaivePlanOp.createPropertyPlanOperator(
            planOp, 
            new LinkedList<>(){{
                add(ctx.jsonFieldName().IDENTIFIER().getText());
            }}, 
            configuration
        );
        return visitChildren(ctx);
    }

    @Override 
    public Void visitJsonDescendentStep(JsonPathParser.JsonDescendentStepContext ctx) { 
        this.planOp = NaivePlanOp.createScanPlanOperator(
            this.planOp, 
            new LinkedList<>(){{
                add(ctx.jsonFieldName().IDENTIFIER().getText());
            }}, 
            configuration
        );
        this.planOp = NaivePlanOp.createUniqueFilterPlanOperator(
            this.planOp,
            configuration);
        return visitChildren(ctx);
    }

    @Override
    public Void visitJsonArrayWildcardStep(JsonPathParser.JsonArrayWildcardStepContext ctx) {
        this.planOp = NaivePlanOp.createWildcardPlanOperator(
            planOp, 
            configuration
        );
        return visitChildren(ctx);
    }

    @Override
    public Void visitJsonArraySelectionsStep(JsonPathParser.JsonArraySelectionsStepContext ctx) {
        ArraySelectionsVisitor visitor = new ArraySelectionsVisitor();
        ArraySelections selections = visitor.visit(ctx);
        this.planOp = NaivePlanOp.createArraySelectionsPlanOperator(
            this.planOp, 
            selections, 
            configuration);
        return visitChildren(ctx);
    }

    @Override 
    public Void visitJsonFilterExpr(JsonPathParser.JsonFilterExprContext ctx) {
        FilterVisitor<Record> visitor = new FilterVisitor<Record>(configuration);
        Filter<Record> filter = visitor.visit(ctx.jsonCond());
        this.planOp = NaivePlanOp.createFilterPlanOperator(
            planOp, 
            filter, 
            configuration);
        return null;
    }
}