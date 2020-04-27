package jp4js.query;

import jp4js.parser.*;
import jp4js.query.RecordSet.Record;
import jp4js.query.scan.JsonPathScan;
import jp4js.query.join.Concat;
import jp4js.query.join.MergeJoinD;
import jp4js.query.join.MergeJoinS;
import jp4js.utils.Configuration;
import jp4js.index.IndexContext;
import jp4js.index.Indexer;
import jp4js.index.node.LabelNode;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

import java.util.Iterator;

public class JsonPath {
    static public Iterator<Record> evaluateByScan(String path, Object json, Configuration configuration) {
        CharStream s = CharStreams.fromString(path);
        JsonPathLexer lexer = new JsonPathLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonPathParser parser = new JsonPathParser(tokens);
        JsonPathScan visitor = new JsonPathScan(json, configuration);
        visitor.visit(parser.jsonBasicPathExpr());
        return visitor.results();
    }

    static public Iterator<Record> evaluateByMergeJoinD(String path, Object json, Configuration configuration) {
        CharStream s = CharStreams.fromString(path);
        JsonPathLexer lexer = new JsonPathLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonPathParser parser = new JsonPathParser(tokens);
        IndexContext indexContext = Indexer.index(json, configuration);

        MergeJoinD listener = new MergeJoinD(indexContext);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.jsonBasicPathExpr());

        PlanOperator<LabelNode> op = new Concat(listener.operators());
        return new NodeWrapper(op.iterator(), new RecordSet(configuration));
    }

    static public Iterator<Record> evaluateByMergeJoinS(String path, Object json, Configuration configuration) {
        CharStream s = CharStreams.fromString(path);
        JsonPathLexer lexer = new JsonPathLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonPathParser parser = new JsonPathParser(tokens);
        IndexContext indexContext = Indexer.index(json, configuration);

        MergeJoinS listener = new MergeJoinS(indexContext);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.jsonBasicPathExpr());

        PlanOperator<LabelNode> op = listener.operator();
        return new NodeWrapper(op.iterator(), new RecordSet(configuration));
    }
}