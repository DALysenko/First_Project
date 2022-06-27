package roads.model;

public class Way {
    private int nd;
    private String tag;

    public Way(int nd, String tag) {
        this.nd = nd;
        this.tag = tag;
    }

    public int getNd() {
        return nd;
    }


    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "Way{" +
                "nd=" + nd +
                ", tag='" + tag + '\'' +
                '}';
    }
}
