package CoreJava.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student( int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString () {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Student that) {
        if(this.age>that.age)
                    return 1;
                else
                    return -1;
            }
    }

public class Comparable1 {
    public static void main(String[] args) {
//        Comparator<Student> com=new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.age>o2.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        List<Student> list=new ArrayList<>();
        list.add(new Student(21,"Eshwar"));
        list.add(new Student(20,"sai"));
        list.add(new Student(30,"ram"));
        list.add(new Student(26,"teja"));
        list.add(new Student(34,"murali"));

        Collections.sort(list);
        for(Student s:list){
            System.out.println(s);
        }

    }
}
