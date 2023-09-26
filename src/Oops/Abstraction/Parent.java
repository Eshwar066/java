package Oops.Abstraction;

//Oops.Abstraction:-
//        • Parent class gives only the method but not the body to child class where it overrides those methods.
//        Code;-
//        Abstract void career(String name);
//
//        • If one method in a class is abstract then the class should also be abstract.
//        • We can have variables in Abstract class. Eg:- int age
//        • We cant create an object of abstract class, but child classes can be made; and Parent class name reference can be given to child class
//	     • Eg:- Parent parent=new Daughter();
//            •    eg:- Parent parent=new Parent(); this is not possible..
//            • Abstract constructors are not allowed.. Eg abstract Parent(); --> not possible
//         • As static methods are not overridden so abstract static methods cannot be created, but static methods can be created in abstract classes.
//         • Static variables can also be written in abstract class. And final variables can also written
//         • Abstract classes can contain normal method. And they can be overridden in child class or called directly in main class.
//
//      final:-
//         •  we cant have final abstract class.
//
//        Abstract class cannot support multiple Inheritance.


public abstract class Parent {

    int age;
    //constructor for variables
    public Parent(int age) {
        this.age = age;
    }

    //static method in abstract class can be created
    static void hello(){
        System.out.println("hello eshwar");
    }

    //normal methods
    void normal(){
        System.out.println("normal method");
    }

    abstract void career();
    abstract void patner(String name,int age);
}

