package Oops.Abstraction;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i like to be a Doctor");
    }

    @Override
    void patner(String name, int age) {
        System.out.println("i love "+ name +",his age is"+ age);
    }
}
