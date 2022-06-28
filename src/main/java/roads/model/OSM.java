package roads.model;

import java.util.List;

public class OSM {
    private String bounds;
    private List<Node> node;
    private List<Way> way;
    private List<Relation> relation;


    public OSM() {
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

    public void setBounds(String bounds) {
        this.bounds = bounds;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }

    public void setWay(List<Way> way) {
        this.way = way;
    }

    public void setRelation(List<Relation> relation) {
        this.relation = relation;
    }
}
