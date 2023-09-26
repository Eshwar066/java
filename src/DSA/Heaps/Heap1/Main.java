package DSA.Heaps.Heap1;

import DSA.Heaps.Heap1.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    throws Exception{
        Heap<Integer> heap=new Heap<>();



        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);




        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

//        ArrayList list=heap.heapSort();       // O(n log n)
//        System.out.println(list);

    }
}
