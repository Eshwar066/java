package Problems;/*class pen {
    String color;
    String type;

    public void write(){
        System.out.println("writting something");
        }

    public void color(){
        System.out.println(this.color);
    }
}


public class oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color = "blue";
        pen1.type = "gel";

       // pen1.write();
       // pen1.color();

        pen pen2=new pen();
        pen2.color = "red";
        pen2.type = "ball-pen";

        pen1.color();
        pen2.color();

    }
}*/

/*
/////////////////////// Polymorphism ///////////////////////////
//function overloading :- compile time error
class Student{
    String name;
    int age;

    public void printInfo(String name){   //In a single class, creating many functions with same 'name', and there shld be some diff factor.
        System.out.println(name);          //diff factor can be void, or datatypes like string,float,int etc
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}


public class oops{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Eshwar";
        s1.age = 24;

        s1.printInfo(s1.age);
    }
}*/


//////////////////////////////  Inheritance ///////////
//function overriding:- Run time error
class Shape{
    String color;
}

class Triangle extends Shape{
    String weight;

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.weight);
    }
}

class oops{
    public static void main(String[] args) {
            Triangle s1= new Triangle();
            s1.color="red";
            s1.weight="20Kgs";

            s1.printInfo();


     }
}
