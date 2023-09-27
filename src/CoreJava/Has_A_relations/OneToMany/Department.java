package CoreJava.Has_A_relations.OneToMany;

public class Department {
    private String deptname;
    private String deptLoc;

    private Employee[] employees;

    public Department(String deptname, String deptLoc, Employee[] employees) {
        this.deptname = deptname;
        this.deptLoc = deptLoc;
        this.employees = employees;
    }

    public void display(){
        System.out.println("*************Department details*********");
        System.out.println("deptname:"+deptname);
        System.out.println("sdeptLoc:"+deptLoc);

        System.out.println("***************Employee details************");
        for(Employee emp:employees){
            System.out.println("empid:"+emp.getEmpId());
            System.out.println("empName:"+emp.getEmpName());
        }
    }
}
