package Sort_a_employeeMap_Using_Lamda;

import CoreJava.StreamAPI.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Eshwar",454);
        map.put("teja",44);
        map.put("Sai",45);
        map.put("ravi",4254);
        map.put("rakesh",4544);

//        List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {             //Using Comparator
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });


//        for(Entry<String, Integer> entry:entries){
//            System.out.println(entry.getKey()+": "+entry.getValue());
//        }

//        Collections.sort(entries,  (o1, o2) ->o1.getKey().compareTo(o2.getKey()));           //Using lamda function
//        System.out.println(entries);

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  //using Comparator


        ///////////////////////****************************///////////////////////////////////
        /////Map Sort////////////////

//        Map<Employee,Integer> employeeMap=new TreeMap<>(new Comparator<Employee>() {          //using Comparator
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int)(o1.getSalary()- o2.getSalary());
//            }
//        });
//        employeeMap.put(new Employee(176, "Eshwar","IT", 900000L ),60);
//        employeeMap.put(new Employee(17, "Teja","CS", 330000L ),90);
//        employeeMap.put(new Employee(16, "ravi","Mech", 924000L ),50);
//        employeeMap.put(new Employee(162, "kavya","Civil", 3000000L ),45);
//        employeeMap.put(new Employee(136, "Manish","BBA", 100L ),652);
//
//
//        System.out.println(employeeMap);
//////////////////////////////////////////////////////////
//        Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()- o2.getSalary()));   //using lamda function
//
//        employeeMap.put(new Employee(176, "Eshwar","IT", 900000L ),60);
//        employeeMap.put(new Employee(17, "Teja","CS", 330000L ),90);
//        employeeMap.put(new Employee(16, "ravi","Mech", 924000L ),50);
//        employeeMap.put(new Employee(162, "kavya","Civil", 3000000L ),45);
//        employeeMap.put(new Employee(136, "Manish","BBA", 100L ),652);
//
//        System.out.println(employeeMap);

        ///////////////////////////////////////////////////
        Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()- o2.getSalary()));   //using Streams

        employeeMap.put(new Employee(176, "Eshwar","IT", 900000L ),60);
        employeeMap.put(new Employee(17, "Teja","CS", 330000L ),90);
        employeeMap.put(new Employee(16, "ravi","Mech", 924000L ),50);
        employeeMap.put(new Employee(162, "kavya","Civil", 3000000L ),45);
        employeeMap.put(new Employee(136, "Manish","BBA", 100L ),652);

        employeeMap.entrySet().stream().forEach(System.out::println);





        ///map() vs flatmap()





    }
}
