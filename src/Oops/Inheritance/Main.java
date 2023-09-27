package Oops.Inheritance;




class A extends Object{
    void show(){
        System.out.println("Hello Eshwar");

    }
}

class B extends A {

    void show(){

        System.out.println("Eshwar sai");
    }
}
public class Main {
    public static void main(String[] args) {
        B obj=new B();

        obj.show();
    }
}

