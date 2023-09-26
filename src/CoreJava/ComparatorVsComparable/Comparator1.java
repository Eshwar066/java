package CoreJava.ComparatorVsComparable;

import java.util.*;

/*public class Comparator1 {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                   return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums=new ArrayList<>();
        nums.add(29);
        nums.add(11);
        nums.add(34);
        nums.add(88);

        Collections.sort(nums,com);
        System.out.println(nums);

    }
}*/


//Comparator is an Interface where we can use our own logic for sorting.
public class Comparator1 {
    public static void main(String[] args) {
        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    return -1;
                else
                    return 1;
            }
        };
        List<String> nums=new ArrayList<>();
        nums.add("Eshwar");
        nums.add("polimera");
        nums.add("sai");
        nums.add("ravi");

        Collections.sort(nums,com);
        System.out.println(nums);

    }
}
