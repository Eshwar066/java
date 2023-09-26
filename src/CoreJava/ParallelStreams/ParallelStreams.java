package CoreJava.ParallelStreams;

import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        long start=0;
        long end=0;
        long startP=0;
        long endP=0;


        start=System.currentTimeMillis();
        IntStream.range(1,1000).forEach(System.out::println);
        end=System.currentTimeMillis();

        System.out.println("sequential Stream "+ (end-start));

        System.out.println("========================================================================");

        start=System.currentTimeMillis();
        IntStream.range(1,10000).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();

        System.out.println("parallel Stream "+ (endP-startP));
        System.out.println("sequential Stream "+ (end-start));

        //  Getting an random number
        System.out.println(new Random().nextInt(1000*100));
    }
}
