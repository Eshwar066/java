package Problems;/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Striver_placement_series {
    public static void main(String[] args) {
        int[][]intervals={{1,2},{2,3},{3,4},{1,3}};
        Arrays.sort(intervals,(a,b)->a[1]-b[0]);
        int count=0;
        int i=1;
        while(i<intervals.length){
            if(intervals[i][0]<intervals[i-1][1]){
                count++;
                i=i+1;
            }
            else{
                continue;
            }
            i++;
        }
        System.out.println(count);
    }
}*/

/*class Striver_placement_series{
    public static void main(String[] args) {
        int[] prices = {3,3};
        int mini=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ansMin=0,ansMax=0,ansMin1=0;
        int ans=0;
        int ind=0;
        for(int i =0;i<prices.length;i++){
            ansMin=Math.min(prices[i],mini);
            if(i==prices.length-1){
                break;}
            mini=ansMin;
//            ansMin1=ansMin;
        }
        for(int i =0;i<prices.length;i++){
            if(prices[i]==mini && i!=prices.length-1){
                ind=i+1;

            } else if(prices[i]==mini && i==prices.length){
                ind=0;

            }
        }
        for(int j=ind;j<prices.length;j++){
            ansMax=Math.max(prices[j],max);
            max=ansMax;
        }
        ans=max-mini;
        if(ans<0){
            System.out.println(0);
        }
        System.out.println(ans);
    }
}*/

/*class Striver_placement_series{
    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="ABAB";
        gcdOfStrings(str1,str2);
    }

    public static void gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if(str1.equals(str2)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }

        return "";
      }
}*/

/*import java.util.ArrayList;                                         //print all array subsequence

class Striver_placement_series{
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=3;
        ArrayList<Integer> ds=new ArrayList<>();
        printF(0,arr,ds,n);
    }
    private static void printF(int ind, int[] arr, ArrayList<Integer> ds, int n) {
        if(ind==n) {
            for (int x : ds) {
                System.out.print(x);
            }
            if (ds.size() == 0)
                System.out.print("{}");
            System.out.println();
            return;
        }
        ds.add(arr[ind]);
        printF(ind+1,arr,ds,n);
        ds.remove(ds.size()-1);
        printF(ind+1,arr,ds,n);
    }
}*/


/*import java.util.ArrayList;                                 //string subsequence
class Striver_placement_series{
    public static void main(String[] args) {
        String s="abcd";
        char[] c=s.toCharArray();
        print_string_subseq(new ArrayList<>(),0,c,s.length());
    }
    public static void print_string_subseq(ArrayList<Character> al,int ind,char[] c,int n)
    {
        if(ind>=n)
        {
            if(al.size()==0)
                System.out.print("{}");

            for(char t:al)
            {
                System.out.print(t);
            }
            System.out.println();
            return;

        }
        print_string_subseq(al,ind+1,c,n);
        al.add(c[ind]);
        print_string_subseq(al,ind+1,c,n);
        al.remove(al.size()-1);
    }
}*/

/*import java.util.ArrayList;

class Striver_placement_series{
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int sum=2;
        int n=3;
        ArrayList<Integer>  ds = new ArrayList<>();
        sprint(0,ds,0,sum,arr,n);
    }
    private static void sprint(int i, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if(i==n){
            if(s==sum){
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[i]);
        s+=arr[i];
        sprint(i+1,ds,s,sum,arr,n);
        ds.remove(ds.size()-1);
        s-=arr[i];
        sprint(i+1,ds,s,sum,arr,n);
    }
}*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Striver_placement_series {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n]; // initialize result array with zeros

        // First pass: calculate sum of absolute differences for left side of each element
        long totalSum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i], 1);
            }
            totalSum += i; // sum of indices
            arr[i] += totalSum - (count.get(nums[i]) - 1) * i; // add to result array
        }

        // Second pass: calculate sum of absolute differences for right side of each element
        totalSum = 0;
        count = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i], 1);
            }
            totalSum += n - 1 - i; // sum of indices from right side
            arr[i] += totalSum - (count.get(nums[i]) - 1) * (n - 1 - i); // add to result array
        }

        return arr;
    }

    public static void main(String[] args) {
        Striver_placement_series solution = new Striver_placement_series();
        int[] nums = {1, 3, 1, 1, 2};
        long[] arr = solution.distance(nums);
        System.out.println(Arrays.toString(arr));
    }
}
