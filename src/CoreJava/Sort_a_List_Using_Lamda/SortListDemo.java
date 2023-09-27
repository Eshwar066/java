package CoreJava.Sort_a_List_Using_Lamda;

import CoreJava.StreamAPI.DataBase;
import CoreJava.StreamAPI.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Employee> employees= DataBase.getEmployee();

//        Collections.sort(employees,new MyComparator());  //creatimng new class
        Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()-o2.getSalary())); //lamda
//        System.out.println(employees);

//        employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println); //comparing objects

//        employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);  //Using Comparator

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);  //Using Comparator

    }
}

//class MyComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int)(o1.getSalary()-o2.getSalary());
//
//    }
//}
