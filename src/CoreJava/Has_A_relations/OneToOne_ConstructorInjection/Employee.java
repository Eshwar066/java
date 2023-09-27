package CoreJava.Has_A_relations.OneToOne_ConstructorInjection;

public class Employee {
    private String name;
    private Integer age;
    private String address;

    //Constructor Injection
    private Account account;

    public Employee(String name, Integer age, String address, Account account) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.account = account;
    }

    public void display(){
        System.out.println("****************EMPOLYEE DETAILS***********");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("address:"+address);
        System.out.println("************Account Details*********");
        System.out.println("accNum:"+account.getAccNum());
        System.out.println(("accName:"+account.getAccName()));
        System.out.println("accHolder:"+account.getAccHolder());
    }
}
