package CoreJava.Has_A_relations.ManyToOne;

public class Student {

    private Integer SId;
    private String SName;

    private Branch branch;

    public Student(Integer SId, String SName, Branch branch) {
        this.SId = SId;
        this.SName = SName;
        this.branch = branch;
    }

    public void display(){
        System.out.println("***************************Student Details******************");
        System.out.println("SId:"+SId);
        System.out.println("SName:"+SName);

        System.out.println("*****************************Branch Details***************");
        System.out.println("branchName:"+branch.getBName());
        System.out.println("brachlocation:"+branch.getBLocation());

    }

}
