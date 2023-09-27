package Problems;/*public class FAANG {                                 //majority element
    public static void main(String[] args){
        int nums[]={3,3,4};
        int e1=0,c=0;
        for(int n:nums){
            if(c==0){
                e1=n;
                c++;
            } else if(n==e1){
                c++;
            }else{
                c--;
            }
        }
        //verification
        c=0;
        for(int n:nums){
            if(n==e1){
                c++;
            }
        }
        int ans=0;
        if(c>nums.length/2){
            ans=e1;
        }
        System.out.println(ans);
    }
}*/

/*import java.util.ArrayList;                    //Majority elements(output as 2 nums)

class FAANG{
    public static void main(String[] args) {
        int[] nums={2,2,3,1,3,2,1,1};
        int e1=0, e2=0,c1=0,c2=0;
        for(int n:nums) {
        if(n==e1){
            c1++;
        } else if (n==e2) {
            c2++;
        } else if (c1==0) {
            e1=n;
            c1=1;
        } else if (c2==0) {
            e2=n;
            c2=1;
        }else{
            c1--;
            c2--;
        }
        }
//    verification
        c1=0;
        c2=0;
        for(int n:nums){
            if(e1==n){
                c1++;
            } else if (e2==n) {
                c2++;
            }

        }

        ArrayList<Integer>List=new ArrayList<>();
        if(c1>nums.length/3){
            List.add(e1);
        }
        if(c2> nums.length/3){
            List.add(e2);
        }
        for(int i:List){
            System.out.print(i+",");
        }

    }
}*/

/*class FAANG{                                       //container containing most water
    public static void main(String[] args) {
    int[] height={1,8,6,5,4,8,3,7};
    int ans=0,l=0,r=height.length-1;
    while(l<r){
        ans=Math.max(ans,Math.min(height[l],height[r])*(r-l));

        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
    }
        System.out.println(ans);
    }
}*/


/*                                                        //Distribute Candies
import java.util.HashSet;

import java.util.Set;

class FAANG{
    public static void main(String[] args) {
        int[] candies = {1, 2, 2, 3, 1,1};
        int n=candies.length/2;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<candies.length;i++){
            set.add(candies[i]);
        }
        int setSize=set.size();
        if(setSize<n){
            System.out.println(setSize);
        }
        if(setSize>=n){
            System.out.println(n);
        }
    }
}
*/

/*import java.util.HashSet;                                       //Happy Numbers
import java.util.Set;

class FAANG {
    public static void main(String[] args) {
        int n = 19;
        Set<Integer> set = new HashSet<>();
        System.out.println(check(set,n));
    }

    private static boolean check(Set<Integer> set, int n) {
        if(n==1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        n=update(n);
        return check(set,n);

    }

    private static int update(int n) {
        int updatedN=0;

        while(n>0){
            int digit=n%10;
            updatedN=updatedN+digit*digit;
            n=n/10;
        }
        return updatedN;

    }
}*/

/*class FAANG{                                                   //move zeros
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int j=0;

        for (int i=0; i<arr.length; i++) {

            if(arr[i]!=0){
             swap(arr,i,j);
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    private static void swap(int[] arr, int i, int j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}*/

import java.util.*;

/*class FAANG                                 //factorial trailing zero count
{
    public static void main(String[] args)
    {
        int x=100;
        System.out.println(Fact(x));
        int ans=Fact(x);
        int count=0;
        while(ans!=0) {
            int digit = ans % 10;
            if (digit == 0) {
                count++;
            }
            ans=ans/10;
        }
        System.out.print(count);

    }
    public static int Fact(int n)
    {
        if(n==1){
            return 1;
        }
        int fnm1=Fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
}*/

/*class FAANG{                                       //Maximum sum subarray
    public static void main(String[] args) {
        int[] arr={-1};
        int c_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            c_sum=c_sum+arr[i];
            if(c_sum>max_sum){
                max_sum=c_sum;
            }
            if(c_sum<0){
                c_sum=0;
            }
        }
        System.out.println(max_sum);

    }
}*/

//overlapping rectangle is done in leetcode

/*class FAANG{                                                     // word distance 1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.next();
        }
        System.out.println("print word1");
        String word1=sc.next();
        System.out.println("print word2");
        String word2=sc.next();
        int ans=Min_distance(arr,word1,word2);
        System.out.println(ans);
    }

    private static int Min_distance(String[] arr, String word1, String word2) {
        int w1=-1,w2=-1,min= arr.length;                                     //min value should be given either arr.length or infinity
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(word1)){                                       // for strings use "equals"
                w1=i;
            }
            if(arr[i].equals(word2)){
                w2=i;
            }
            if(w1!=-1 && w2!=-1){
               min= Math.min(min,Math.abs(w2-w1));
            }
        }
        return min;
    }
}*/

/*class FAANG{                                                     // largest number
    public static void main(String[] args) {
       int[] nums={3,5,2,1,4,6,8};

       if(nums.length==0){
           System.out.println("");
       }

       String[] sa=new String[nums.length];
       for(int i=0;i<nums.length;i++){
           sa[i]=Integer.toString(nums[i]);                       // learn converting integer to string
       }
       Arrays.sort(sa, new Comparator<String>() {                // learn comparator
           @Override
           public int compare(String a, String b) {
               String o1=a+b;
               String o2=b+a;
               return o2.compareTo(o1);
           }
       });

       if(sa[0].equals("0"))
           System.out.println("0");

       StringBuilder sb = new StringBuilder();                // what is String builder
       for(String s:sa){
           sb.append(s);
       }
        System.out.println(sb.toString());
    }
}*/

/*class FAANG{                                           //longest palindromic substring
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-- > 0){
            String str=s.next();
            String ans= Longest_palindromic_substring(str);
            System.out.println(ans);
        }
    }

    private static String Longest_palindromic_substring(String str) {
        if (str == null) {
            return null;
            }
        if (str.length() == 0) {
            return "";
        }

        char[] input=new char[2*str.length()+1];
        for(int i=str.length()-1;i>=0;i--){
            input[2*i+1]=str.charAt(i);
            input[2*i]= '#';
        }
        input[2*str.length()]='#';             // there is one position left in above case n it is filled here.

        // now create an integer arr
        int[] LPS=new int[2*str.length()+1];
        int c=0; //center
        int r=0; //right boundry
        for(int x=1;x< LPS.length;x++){
            int mirr=2*c-x;         // mirror element
            if(x<r){
                LPS[x] = Math.min(r-x,LPS[mirr]);
            }
            while(x+LPS[x]+1<=2*str.length() && x-LPS[x]-1>=0 && input[x+LPS[x]+1]==input[x-LPS[x]-1]){
               LPS[x]++;
            }
            if(x+LPS[x]>r){
                c=x;
                r=x+LPS[x];
            }
        }
        int valueMax =0; // max palindromic length
        int indexMax =0;  // index at which we get max length

        for(int i=0;i< LPS.length;i++){
            if(LPS[i]>valueMax){
                valueMax=LPS[i];
                indexMax=i;
            }
        }

        int palindromicspan = valueMax/2;
        if(indexMax%2==0){
            return str.substring(indexMax/2-palindromicspan,indexMax/2+palindromicspan);
        }else{
            return str.substring(indexMax/2-palindromicspan,indexMax/2+palindromicspan+1);
        }

    }
}*/

/*
class FAANG{                                           //pancake sorting
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        List<Integer> ans= panCakeSort(a);         //point to remember, while creating AN ARRAY
            for(int x:ans)
             System.out.print(x+",");
    }

    private static List<Integer> panCakeSort(int[] a) {
         List<Integer> list=new ArrayList<>();
         int n=a.length;
         while(n>0) {
             int idx = find(a, n);
             if (idx != n - 1) {
                 flip(a, idx + 1);
                 flip(a, n);
                 list.add(idx + 1);
                 list.add(n);
             }
             n--;
         }
         return list;
    }
    private static int find(int[] a, int n) {
         for(int i=0;i<a.length;i++)
             if(a[i]==n) return i;
         return -1;
    }
    private static void flip(int[] a, int k) {
        for(int i=0;i<k/2;i++){
            int t=a[i];
            a[i]=a[k-i-1];
            a[k-i-1]=t;
        }
    }
}
*/

/*class FAANG{                                                //Balanced array
    public static void main(String[] args) {
        int[] nums={0,1,0};
        int sum=0, ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();        //using hashmap //sum,index
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            int item=nums[i];
            if(item==0){
                sum++;
            }else{
                sum--;
            }
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));            //remember this line ,here get(sum) sum gives the value of index
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(ans);

    }
}*/

/*class FAANG{                                              //gas station
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        int net=0,curr=0,start=0;
        for(int i=0;i<gas.length;i++){
            net+=gas[i]-cost[i];
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                start=i+1;
            }
        }
        if(net<0){
            System.out.println("-1");
        }
        else{
            System.out.println(start);
        }
        }
    }*/

/*class FAANG{                                         //Find First and Last Position of Element in Sorted Array
    public static void main(String[] args) {           // time complexity is more
        int[] nums={1,2,4,4,4,5};
        int target=3;
        int l=0,h=nums.length,i=0;
        int[] ans=new int[(nums.length/2)-1];
        while(l!=h){
            int mid=(l+h)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                h=mid-1;
            }else{
                if(nums[mid]==target && nums[mid+1]==target){
                    ans[i]= mid;
                    ans[i+1]=mid+1;
                    break;
                }else if(nums[mid]==target && nums[mid-1]==target){
                    ans[i]=mid-1;
                    ans[i+1]=mid;
                    break;
                }else{
                    ans[i]=-1;
                    ans[i+1]=-1;
                    break;
                }

            }
        }
        if(ans[i]==0){
            ans[i]=-1;
            ans[i+1]=-1;
        }
        for(int x:ans){
            System.out.print(x+",");
        }

//        int i=0,j=nums.length-1,k=0;
//        int[] res=new int[(nums.length/2)-1];
//        while(i<nums.length){
//            if(nums[i]==target){
//                res[k]=i;
//                k++;
//                break;
//            }
//            else{
//                i++;
//            }
//        }
//        while(j!=0){
//            if(nums[j]==target){
//                res[k]=j;
//                break;
//            }
//            else{
//                j--;
//            }
//        }
//
//        if(res[k]==0){
//            res[k]=-1;
//            res[k+1]=-1;
//        }
//        for(int x:res){
//            System.out.print(x+",");
//        }
    }
}*/

/*
class FAANG{                                            // find k closest element
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=4,x=-1;
        int n=arr.length;

        int curr_sum=0,pos=0;

        for(int i=0;i<k;i++){
            curr_sum+=Math.abs(x-arr[i]);
        }

        int sum=curr_sum;

        for(int i=1;i<=n-k;i++){
            curr_sum-=Math.abs(x-arr[i-1]);
            curr_sum+=Math.abs(x-arr[i+k-1]);
            if(curr_sum<sum){
                sum=curr_sum;
                pos=i;
            }
        }
        List<Integer> answer = new ArrayList<>();

        for(int i=0;i<k;i++){
            answer.add(arr[i+pos]);
        }
        System.out.println(answer);

    }
}
*/

/*class FAANG{                                         //leet code 2244. Minimum Rounds to Complete All Tasks
    public static void main(String[] args) {
       // String[] str={"once","tree","school"};
       int[] tasks= {2,2,3,3,2,4,4,4,4,4};
       Arrays.sort(tasks);
       int res=0;
       for(int i=0;i<tasks.length;){
           int j=i;
           while(i<tasks.length && tasks[i]==tasks[j]){
               i++;
           }
           if(i-j==1) System.out.println(-1);
           res+=(i-j+2)/3;

       }
        System.out.println(res);

    }
}*/

//import java.lang.*;
//class FAANG
//{
//    static void BubbleSort(int[] a,int si,int li)
//    {
//        if(li==0)
//            return;
//        if(si==li){
//            BubbleSort(a,0,li-1);
//            return;}
//        if(a[si]>a[si+1]){
//            int temp=a[si];
//            a[si]=a[si+1];
//            a[si+1]=temp;
//        }BubbleSort(a, si+1,li);
//    }
//    public static void main(String[] achal) {
//        int z[] = {10, 9, 8, 7, 6, 5};
//        BubbleSort(z, 0, z.length - 1);
//        for (int i = 0; i < z.length - 1; i++)
//            System.out.println(z[i]);
//    }}

/*class FAANG{                                    //3 sum closet
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int target=100;
        Arrays.sort(nums);
        int closeDiff=Integer.MAX_VALUE;
        int closeSum=0;
            int i=0;
            int sum=0;
            while(i<=nums.length-3) {
                int j = i + 1;
                int k = nums.length - 1;
                sum += nums[i] + nums[j] + nums[k];
                while (j < k) {
                    if (Math.abs(sum - target) < closeDiff) {
                        closeDiff = Math.abs(sum - target);
                        closeSum = sum;
                    }
                    if (sum < target) {
                        sum -= nums[j];
                        j++;
                        sum += nums[j];
                    } else if (sum > target) {
                        sum -= nums[k];
                        k--;
                        sum += nums[k];
                    } else {
                        System.out.println(sum);
                    }

                }
                i++;
            }


        System.out.println(closeSum);
    }
}*/

///////////////////////////////////////////////////////////////////////////////////Strings/////////////////////////////////////////////////////////////////////////////

/*class FAANG{                                             //438. Find All Anagrams in a String
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> result =new ArrayList();

        if(s.length()==0 || s == null) System.out.println(result);

        int[] char_counts=new int[26];
        for(char c:p.toCharArray()){
            char_counts[c-'a']++;
        }

        int left=0;
        int right=0;
        int count=p.length();

        while(right < s.length()){
            if(char_counts[s.charAt(right++)-'a']-- >=1){
                count--;
            }

            if(count==0) result.add(left);

            if(right - left == p.length() && char_counts[s.charAt(left++)-'a']++>=0){
                count++;
            }
        }
        System.out.println(result);
    }
}*/

/*class FAANG{                                    //165. Compare Version Numbers
    public static void main(String[] args) {
        String version1="1.0.2";
        String version2="1.0.01";

        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");

        int maxLength=Math.max(s1.length,s2.length);
        for(int i=0; i<maxLength; i++){
            int v1=i<s1.length ? Integer.parseInt(s1[i]):0;          // (converting string Integer to int;)
            int v2=i<s2.length ? Integer.parseInt(s2[i]):0;

            if(v1>v2) System.out.println(1);
            else if(v2>v1) System.out.println(-1);
        }
        System.out.println(0);

    }
}*/

/*class FAANG{                                        //First Unique Character in a String
    public static void main(String[] args) {
        String s="leetcode";
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0; i<s.length(); ++i){
            if(arr[s.charAt(i)-'a'] == 1) System.out.println(i);
        }
        System.out.println(-1);
    }
}*/

class FAANG{
    public static void main(String[] args) {
        int N=3;
        int[] A={4,3,3};
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int r[]=new int[N];
        for(int i=N-1;i>=0;i--){
            r[i]=set.size();
            set.add(A[i]);
        }
        set.clear();
        for(int i=0;i<N;i++){
            ans.add(set.size()-r[i]);
            set.add(A[i]);
        }

        System.out.println(ans);
    }
}








