package jp4js.query.path;

public class Path {
    private RootNode root;
    public Path(RootNode root) {
        this.root = root;
    }

    public RootNode root() {
        return this.root;
    }

    @Override
    public String toString() {
        return "Path(" + root.toString() + ")";
    }
}