package Oops.Abstraction;

import Oops.Abstraction.Parent;

public class Son extends Parent {

    //overriding normal methods
//    @Override
//    void normal() {
//        super.normal();
//    }

    //constructor for variables in parent class
    public Son(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("i like to be coder");
    }



    @Override
    void patner(String name, int age) {
        System.out.println("i love "+ name +",her age is"+ age);
    }
}
