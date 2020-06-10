package jp4js.query.path;

import java.util.List;

public class PropertyNode extends PathNode {
    private List<String> properties;

    public PropertyNode(List<String> properties) {
        this.properties = properties;
    }

    public List<String> properties() {
        return this.properties;
    }

    @Override
    public String toString() {
        String ret = "";
        for (String property: this.properties) {
            if (ret.length() != 0) ret += ", ";
            ret += property;
        }
        ret += super.toString();
        return ret;
    }
}