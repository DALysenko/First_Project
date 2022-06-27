package roads.model;

import javax.swing.text.html.HTML;
import java.util.List;

public class OSM {
    private String bounds;
    private List<Node> node;
    private List<Way> way;
    private List<Relation> relation;

    public OSM(String bounds, List<Node> node, List<Way> way, List<Relation> relation) {
        this.bounds = bounds;
        this.node = node;
        this.way = way;
        this.relation = relation;
    }

    public String getBounds() {
        return bounds;
    }


    public List<Node> getNode() {
        return node;
    }

    public List<Way> getWay() {
        return way;
    }

    public List<Relation> getRelation() {
        return relation;
    }


    @Override
    public String toString() {
        return "OSM{" +
                "bounds='" + bounds + '\'' +
                ", node=" + node +
                ", way=" + way +
                ", relation=" + relation +
                '}';
    }
}
