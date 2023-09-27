package CoreJava.Has_A_relations.OneToOne_ConstructorInjection;

public class Account {

    private Integer accNum;
    private String accName;
    private String accHolder;

    public Account(Integer accNum, String accName, String accHolder) {
        this.accNum = accNum;
        this.accName = accName;
        this.accHolder = accHolder;
    }

    public Integer getAccNum() {
        return accNum;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccHolder() {
        return accHolder;
    }
}
