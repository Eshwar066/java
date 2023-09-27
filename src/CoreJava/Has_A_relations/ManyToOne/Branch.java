package CoreJava.Has_A_relations.ManyToOne;

public class Branch {

    private String BName;
    private String BLocation;

    public Branch(String BName, String BLocation) {
        this.BName = BName;
        this.BLocation = BLocation;
    }

    public String getBName() {
        return BName;
    }

    public String getBLocation() {
        return BLocation;
    }
}
