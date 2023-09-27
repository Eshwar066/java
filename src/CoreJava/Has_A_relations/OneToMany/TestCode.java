package CoreJava.Has_A_relations.OneToMany;

public class TestCode {
    public static void main(String[] args) {
        Employee emp1=new Employee(2,"ravi");
        Employee emp2=new Employee(4,"sai");
        Employee emp3=new Employee(34,"kavya");

        Employee[] employees=new Employee[3];
        employees[0]=emp1;
        employees[1]=emp2;
        employees[2]=emp3;

       Department dept= new Department("icici","Bangalore",employees);
       dept.display();
    }
}
