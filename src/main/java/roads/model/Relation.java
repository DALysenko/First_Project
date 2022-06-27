package roads.model;

public class Relation {
    private String member;
    private String tag;

    public Relation(String member, String tag) {
        this.member = member;
        this.tag = tag;
    }

    public String getMember() {
        return member;
    }

    public String getTag() {
        return tag;
    }


    @Override
    public String toString() {
        return "Relation{" +
                "member='" + member + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
