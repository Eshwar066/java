package Oops.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(23);
        son.career();
        son.patner("Kavya",22);
        //normal method, we can call it either by overriding in child class or directly here
        son.normal();

        Parent daughter=new Daughter(23);
        daughter.career();
        daughter.patner("Eshwar",22);
        daughter.normal();

        //static method from abstract class
        Parent.hello();
    }
}
