package roads.model;

import org.w3c.dom.NodeList;

public class Node {
    private String tag;

    public Node(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
    @Override
    public String toString() {
        return "Node{" +
                "tag='" + tag + '\'' +
                '}';
    }


}
