package Oops.Polymorphism;
class Animal{
    void sound(){
        System.out.println("Animal class");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meom");;
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("bow");
    }
}

public class Poly{
    public static void main(String[] args) {
         Animal a1=new Cat();
         a1.sound();
         Animal a2=new Dog();
         a2.sound();

    }
}