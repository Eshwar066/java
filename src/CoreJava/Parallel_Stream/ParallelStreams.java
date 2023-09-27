package CoreJava.Parallel_Stream;

import CoreJava.StreamAPI.DataBase;
import CoreJava.StreamAPI.Employee;

import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {

//        Long start=0L;
//        Long end=0L;
//
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100000).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("NormalStream :"+  (end-start));
//
//        System.out.println("=============================================================");
//        Long startP=0L;
//        Long endP=0L;
//        startP=System.currentTimeMillis();
//        IntStream.range(1,100000).parallel().forEach(System.out::println);
//        endP =System.currentTimeMillis();
//
//        System.out.println("NormalStream :"+  (end-start));
//        System.out.println("ParallelStream :"+  (endP-startP));

//        Long start=0L;
//        Long end=0L;
//
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,10000000).forEach((x)-> System.out.println("Thread"+ Thread.currentThread().getName()+":"+x));
//        end=System.currentTimeMillis();
//        System.out.println("NormalStream :"+  (end-start));
//
//        System.out.println("=============================================================");
//        Long startP=0L;
//        Long endP=0L;
//        startP=System.currentTimeMillis();
//        IntStream.range(1,10000000).parallel().forEach((x)-> System.out.println("Thread"+ Thread.currentThread().getName()+":"+x));
//        endP =System.currentTimeMillis();
//
//        System.out.println("NormalStream :"+  (end-start));
//        System.out.println("ParallelStream :"+  (endP-startP));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<Employee> employees= DataBase.getEmployee();

        Long start=0L;
        Long end=0L;

        start=System.currentTimeMillis();
        double salary=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        System.out.println(salary);
        end=System.currentTimeMillis();
        System.out.println("NormalStream :"+  (end-start));


        Long startP=0L;
        Long endP=0L;
        startP=System.currentTimeMillis();
        double salary1=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
//        System.out.println(employees.stream().collect(Collectors.toSet()));
        System.out.println(salary1);
        endP =System.currentTimeMillis();

        System.out.println("NormalStream :"+  (end-start));
        System.out.println("ParallelStream :"+  (endP-startP));
    }
}
