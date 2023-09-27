package CoreJava.Has_A_relations.OneToOne_ConstructorInjection;

public class Test {
    public static void main(String[] args) {

        Account account=new Account(12345,"savings","Eshwar");

        Employee employee=new Employee("Eshwar",22,"Bangalore",account);

        employee.display();
    }
}
