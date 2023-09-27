package CoreJava.Map_Reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,5,4,66);
//        int num=list.stream().reduce(0,(sum,curr)->sum+curr);
//        System.out.println(num);

        System.out.println(list.stream().max(Comparator.naturalOrder()));
    }
}
