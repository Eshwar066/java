package CoreJava.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {
    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();
//        list.add(new Employee(176, "Eshwar","IT", 900000L ));
//        list.add(new Employee(17, "Teja","CS", 330000L ));
//        list.add(new Employee(16, "ravi","Mech", 924000L ));
//        list.add(new Employee(162, "kavya","Civil", 3000000L ));
//        list.add(new Employee(136, "Manish","BBA", 100L ));
//        return list;

        for(int i=0;i<100000;i++){
            list.add(new Employee(i,"Eshwar","It",Long.valueOf(new Random().nextInt(1000*100))));
        }
        return list;

    }

    {

    }
}
