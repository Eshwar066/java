package Problems;

 /*public class DSA {                                           //Swaping two numbers in an Array
    public static void main(String[] args)
    {
        int i=0,j=2;
       int[] arr={10,20,30,40,50};

       System.out.println(arr[i]+","+arr[j]);
       Swap(arr,i,j);
       System.out.println(arr[i]+","+arr[j]);
    }

    public static void Swap(int arr[],int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }*/

/*import java.util.Scanner;                             //Taking input  of numbers and adding them to array
class DSA
{
    public static void main(String [] args)
    {
        int[] array=takeInput();
        display(array);
    }
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("size?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("for the index value" + i + "give number");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    private static void display(int[] arr) {
        for(int x:arr)
            System.out.print(x+",");
    }
}*/

/*class DSA                                          //Finding max num in an array
{
    public static void main(String[] args)
    {
        int[] array=isMax();
        display(array);
    }
    public static int[] isMax()
    {
        int A[]={2,4,5,6,7};
        int max=A[0];
        for(int i=0;i<A.length; i++)
        {
            if (A[i]>max);
            max=A[i];

        }
        return new int[]{max};
    }
    public static void display(int[] array)
    {
        for (int x:array)
            System.out.println(x);
    }
}*/

/*
class DSA                                          //LOWER and Upper bound of Array
{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,9};
        System.out.println(lowerBound(arr,4));
        System.out.println(upperBound(arr,4));

        System.out.println(lowerBound(arr,8));
        System.out.println(upperBound(arr,8));
    }

    private static int lowerBound(int[] arr, int data) {
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if (arr[mid]==data){
                ans=mid;
                high=mid-1;
            } else if (data<arr[mid]) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }
    private static int upperBound(int[] arr, int data) {
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if (arr[mid]==data){
                ans=mid;
                low=mid+1;
            } else if (data<arr[mid]) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }
}
*/

/*import java.util.Scanner;                                     //Linear Search  O(n)

class DSA
{
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int item=sc.nextInt();
        System.out.println(linearSearch(arr,item));
    }

    public static int linearSearch(int[] arr,  int item) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}*/

/*class DSA                                                 //binary search o(log n)
{                                                            // array must be sorted
    public static void main(String[] args)
    {
        int[] Arr={2,4,6,8,12,14,16,18,19,20,22,24,26};
        System.out.println(binarySearch(Arr,14));
    }
    public static int binarySearch(int[] Arr,int item)
    {
        int lo=0;
        int hi=Arr.length-1;

        while (lo<=hi) {
            int mid = (lo + hi) / 2;
            if(Arr[mid]<item){
                lo=mid+1;
            } else if (Arr[mid]>item) {
                hi=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}*/

/*class DSA                                      //Bubble sort
{
    public static void main(String[] args)
    {
        int[] arr={8,7,6,5,4,3,2};
        bubbleSort(arr);
        display(arr);

    }
    public static void  bubbleSort(int[] arr)
    {
        for (int i=0;i< arr.length-1;i++)
            for(int j=0;j< arr.length-1-i;j++)
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
    }
    public static void display(int[] arr)
    {
        for(int x:arr)
        {
            System.out.print(x+",");}

    }
}*/

/*class DSA {                                                    //Selection sort
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 99, 87};
        selectionSort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + ",");
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j <= arr.length - 1; j++) {
                int min = i;
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }*/

/*class DSA                                                     //Insertion sort
{
    public static void main(String[] args)
    {
        int[] arr={70,60,50,40,30,20,10};
        insertionSort(arr);
        display(arr);
    }
    public static void display(int[] arr) {
        for(int x:arr)
            System.out.print(x+",");
    }
    public static void insertionSort(int[] arr) {
        for (int counter = 0; counter <= arr.length - 1; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            while (j>=0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;

        }
    }
}*/

/*class DSA                                                      //Printing  a 2D matrix
{
    public static void main(String[] args)
    {
        int[][] arr=new int[3][3];

        display(arr);
    }

    public static void display(int[][] arr) {
        arr[0][1]=2;
        arr[0][2]=12;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");}
            System.out.println();
            }
    }
}*/

/*import java.util.Scanner;

class DSA
{
    public static void main(String[] args)
    {
     int[][] arr=takeInput();
     display(arr);
    }

    private static int[][] takeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of rows");
        int rows=sc.nextInt();
        int[][] arr=new int[rows][];
        for(int row=0;row<rows;row++) {
            System.out.println("enter the number of columns for each row" + row);
            int cols = sc.nextInt();
            arr[row] = new int[cols];
            for(int col=0;col<cols;col++){
                System.out.println("enter the value for row"+row+"col"+col);
                arr[row][col]=sc.nextInt();
            }
        }
        return arr;
    }
    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");}
            System.out.println();
    }
}
}*/

/*import java.util.ArrayList;                               //Using ArrayList

class DSA
{
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();

        System.out.println(list);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(1,5);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("*******************");
        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

    }
}*/

/* import java.util.Scanner;                                     //WavePrint

 class DSA
 {
     public static void main(String[] args)
     {
         int[][] arr=takeInput();
         display(arr);
     }

     private static int[][] takeInput() {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the num of rows");
         int rows=sc.nextInt();
         int[][] arr=new int[rows][];
         for(int row=0;row<rows;row++) {
             System.out.println("enter the number of columns for each row" + row);
             int cols = sc.nextInt();
             arr[row] = new int[cols];
             if(row==0 || row==2)
             {
             for(int col=0;col<cols;col++){
                 System.out.println("enter the value for row"+row+"col"+col);
                 arr[row][col]=sc.nextInt();}}
             else
             {
             for(int j=cols-1;j>=0;j--){
                     System.out.println("enter the value for row"+row+"col"+j);
                     arr[row][j]=sc.nextInt();}
             }}

         return arr;
     }
     private static void display(int[][] arr) {
         for (int i = 0; i < arr.length; i++){
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + ",");}
             System.out.println();
         }
     }
 }
//         11,12,13,14,
//         24,23,22,21,
//         31,32,33,34,
//         44,43,42,41,*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////Recursion//////////////////////////////////////////////////

/*class DSA                                   //doing work while stack os building
{
    public static void main(String[] args)
    {
        PD(5);
    }
    public static void PD(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
}*/

/* class DSA                                       //doing work while stack is falling
 {
     public static void main(String[] args)
     {
         PI(5);
     }

     public static void PI(int n){
         if(n==0){
             return;
         }
         PI(n-1);

         System.out.println(n);
 }
}*/

/*class DSA                                  //doing work before a call and after a call
{
    public static void main(String[] args)
    {
        PDI(5);
    }
    public static void PDI(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }
}*/

/* class DSA                                //PDI Skip
 {
     public static void main(String[] args)
     {
         PDI(5);

     }
     public static void PDI(int n){
         if(n==0){
             return;
         }
         if(n%2!=0){
         System.out.println(n);}
         PDI(n-1);
         if (n%2==0){
         System.out.println(n);}}
 }*/

/* class DSA                                  //Factorial of a number
 {
     public static void main(String[] args)
     {
         System.out.println(Fact(15));
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

/* class DSA                                     //Fibonaci number[here the computational time is more]
 {
     public static void main(String[] args)      //we can optimal program in DP series
     {
         System.out.println(Fib(10));
     }
     public static int Fib(int n)
     {
         if(n==0 || n==1)
         {
             return n;
         }
         int fnm1=Fib(n-1);
         int fnm2=Fib(n-2);
         int fn=fnm1+fnm2;
         return fn;
     }
 }*/

/* class DSA                                     //power of a number {more optimized code is below}
 {
     public static void main(String[] args)
     {
         System.out.println(power(5,3));
     }
     public static int power(int x,int n)
     {
         if(n==0){
             return 1;
         }
         int pnm1=power( x, n-1);
         int fn=x*pnm1;
         return fn;
     }
 }*/

/* class DSA {                                               //Recursion (isSorted Array)
     public static void main(String[] args) {
         int[] arr = {2, 5, 7, 11, 9};
         System.out.println(isSorted(arr, 0));
     }

     public static boolean isSorted(int[] arr, int si) {
         if (si == arr.length - 1) {
             return true;
         }

         if (arr[si] > arr[si + 1]) {
             return false;
         } else {
             boolean restAns = isSorted(arr, si + 1);
             return restAns;
         }
     }
 }*/

/* class DSA                                                        //Recursion (first index of element)
 {
     public static void main(String[] args)
     {
         int[] arr={2,4,5,6,4,7,1};
         System.out.println (firstIndex(arr,0,9));
     }

     private static int firstIndex(int[] arr, int si, int data) {
         if(si==arr.length-1 && arr[si]!=data){
             return -1;
         }
         if(arr[si]==data){
             return si;
         }else{
             int restAns= firstIndex(arr,si+1,data);
             return restAns;
         }
     }
 }*/

/* class DSA
 {
     public static void main(String[] args)                         //Recursion (last index of element)
     {
         int[] arr={2,4,5,6,4,7,1};
         int si=arr.length-1;
         System.out.println (firstIndex(arr,si,9));
     }

     private static int firstIndex(int[] arr, int si, int data) {
         if(si==0 && arr[si]!=data){
             return -1;
         }
         if(arr[si]==data){
             return si;
         }else{
             int restAns= firstIndex(arr,si-1,data);
             return restAns;
         }
     }
 }*/

/* class DSA                                                    //recusion(last index) starting the arr from first
 {
     public static void main(String[] args)
     {
         int[] arr={2,4,6,3,8,9,3,5,3,1,5};
         System.out.println(lastIndex(arr,0,3));
     }

     private static int lastIndex(int[] arr, int si, int data) {
         if(si== arr.length){
             return -1;
         }
         int index=lastIndex(arr,si+1,data);
         if(index==-1){
             if(arr[si]==data){
                 return si;
             }else{
                 return -1;
             }
         }else{
             return index;
         }
     }
 }*/

/* class DSA                                                                         //All Indices
 {
     public static void main(String[] args)
     {
         int[] arr={2,4,5,6,4,7,4,4,1};
         int[] ans=allIndices(arr,0, 4,0);
         display(ans);
     }

     private static int[] allIndices(int[] arr, int si, int data,int count) {
         if(si== arr.length){
             int[] base=new int[count];
             return base;
         }

         int[] indices = null;
         if (arr[si] == data) {
             indices = allIndices(arr, si + 1, data, count + 1);
         } else {
             indices = allIndices(arr, si + 1, data, count);
         }
         if (arr[si]==data){
             indices[count]=si;
         }
         return indices;
     }
     private static void display(int[] ans) {
         for (int x:ans) {
             System.out.print(x+",");;
         }
     }
 }*/

/*class DSA                                          //pattern
{
    public static void main(String[] args) {
        pattern (5,1,1);
    }
    public static void pattern(int n,int row,int col)
    {
        if (row > n) {
            return;}

        if (col > row) {
                System.out.println();
                pattern(n, row + 1, 1);
                return;
        }

        System.out.print("*");
        pattern(n,row,col+1);
    }}*/


/*class DSA                                                 //Bubble Sort
{
    public static void main(String[] args) {
        int[] arr={50,40,30,20,10};
        BubbleSort(arr,0, arr.length-1);
        display(arr);
    }
    public static void BubbleSort(int[] arr,int si, int li){
        if(li==0){
            return;
        }
        if(si==li){
            BubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
                int temp=arr[si];
                arr [si]=arr[si+1];
                arr [si+1]=temp;
        }
       BubbleSort(arr,si+1,li);
    }
    public static void display(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}*/
/////////////////////// intro to recursion get_ (uses more space)////////
/*
 import java.util.ArrayList;                                   // SubSequence of a string

 class DSA
 {
     public static void main(String[] args) {
         System.out.println(getSS("abc"));
     }

     public static ArrayList<String> getSS(String str){
         if(str.length()==0){
             ArrayList<String> baseResult = new ArrayList<>();
             baseResult.add(" ");
             return baseResult;
         }

         char cc=str.charAt(0);
         String ros=str.substring(1);
         ArrayList<String> myResult = new ArrayList<>();
         ArrayList<String> recResult = getSS(ros);
         for (int i=0; i< recResult.size();i++){
             myResult.add(recResult.get(i));
             myResult.add(cc + recResult.get(i));
         }
         return myResult;
     }
 }*/

/* import java.util.ArrayList;                                    //getPermutations of string

 class DSA
{
    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));
    }

    public static ArrayList<String> getPermutations(String str) {
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rr = getPermutations(ros);
        ArrayList<String> mr = new ArrayList<>();

        for (String rrs : rr) {
            for (int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0,i) + ch + rrs.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }
}*/

/* import java.util.ArrayList;                                // Get BoardPath

 class DSA
 {
     public static void main(String[] args) {
         System.out.println(getBoardPath(0,10));
     }
     public static ArrayList<String> getBoardPath(int curr, int end){
         if(curr == end){
             ArrayList<String> br= new ArrayList<>();
             br.add("");
             return br;
         }
         if(curr>end){
             ArrayList<String> br= new ArrayList<>();
             return br;
         }
         ArrayList<String> mr= new ArrayList<>();
         for(int dice=1;dice<=6;dice++){
             ArrayList<String> rr= getBoardPath(dice+curr,end);

             for(String rrs:rr){
                 mr.add(dice + rrs);
             }
         }
         return mr;
     }
 }*/

 /* import java.util.ArrayList;                            //get mazepath

 class DSA{
     public static void main(String[] args) {
         System.out.print(getMazePath(0,0,2,2));

     }
     public static ArrayList<String> getMazePath(int cr,int cc,int er,int ec){
         if(cr==er&& cc==ec){
             ArrayList<String> br=new ArrayList<>();
             br.add("");
             return br;
         }
         if(cr>er || cc>ec){
             ArrayList<String> br=new ArrayList<>();
             return br;
         }
         ArrayList<String> mr=new ArrayList<>();
         ArrayList<String> rrh= getMazePath(cr,cc+1,er,ec);
         for(String rrhs:rrh){
             mr.add("H"+rrhs);
             }
         ArrayList<String> rrv= getMazePath(cr+1,cc,er,ec);
         for(String rrvs:rrv){
             mr.add("V"+rrvs);}

      return mr;

     }
 }*/

/* class DSA{                                     //swap without using 3rd variable
     public static void main(String[] args) {
         int x=5,y=9;
         System.out.print(x+","+y);
         System.out.println("");
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.print(x+","+y);
     }
 }*/
 ///////////////// print recursion ////////////////////////////////

/* class DSA                                 //Print Subsequences(optimized)
 {
     public static void main(String[] args) {
         printSS("abc","");
     }
     public static void printSS(String str,String result){
         if(str.length()==0){
             System.out.print(result+",");
             return;
         }
         char cc=str.charAt(0);
         String ros = str.substring(1);
         printSS(ros,result);
         printSS(ros,result+cc);
     }
 }*/

/*class DSA                                       //print permutation(optimized)
{
    public static void main(String[] args) {
        printPermutation("abc","");
    }
    public static void printPermutation(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+",");
            return;
        }
         for(int i=0; i<ques.length();i++){
            char ch =ques.charAt(i);
            String roq = ques.substring(0,i)+ques.substring(i+1);
            printPermutation(roq,ans+ch);
         }
    }
}*/

/*class DSA                                 // print Boardpath
{
    public static void main(String[] args) {
        printBoardPath(0,10,"");
    }
    public static void printBoardPath(int curr,int end,String ans){
        if (curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for(int dice=1; dice<=6;dice++){
            printBoardPath(curr + dice ,end,ans + dice);
        }
    }
}*/

/* class DSA                                           //print maze path
 {
     public static void main(String[] args) {
         printMazePath(0,0,2,2,"");

     }
     public static void printMazePath(int cr, int cc, int er, int ec, String ans){
         if(cr==er && cc==ec){
             System.out.println(ans);
             return;
         }
         if(cr>er || cc>ec){
             return;
         }
         printMazePath(cr,cc+1,er,ec,ans+"H");
         printMazePath(cr+1,cc,er,ec,ans+"V");
     }
 }*/

/* class DSA                                                        //printMazePathDiag
 {
     public static void main(String[] args) {
         printMazePathDiag(0,0,2,2,"");
     }
     public static void printMazePathDiag(int cr, int cc, int er, int ec, String ans) {
         if (cr == er && cc == ec) {
             System.out.println(ans);
             return;
         }
         if (cr > er || cc > ec) {
             return;
         }
         printMazePathDiag(cr, cc + 1, er, ec, ans + "H");
         printMazePathDiag(cr + 1, cc, er, ec, ans + "V");
         printMazePathDiag(cr + 1, cc+1, er, ec, ans + "D");
     }
 }*/

/*class DSA                                          //count NQueens (backtrackimng)
{
    public static void main(String[] args) {
    boolean[][] board=new boolean[4][4];
        System.out.println(countNQueens(board,0));
    }
    public static int countNQueens(boolean[][] board, int row){
        if(row==board.length){
            return 1;}

            int count=0;
            for(int col=0; col<board[row].length;col++){
                if(isItSafe(board,row,col)){
                    board[row][col]=true;
                    count =count+ countNQueens(board,row+1);
                    board[row][col]=false;
                }
            }
            return count;
        }

    public static boolean isItSafe(boolean[][] board, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}*/
//////////////////////////////// Recursion problems //////////////////////////////////////

/* import java.util.Scanner;                               //1. entering an arr n checking weather it is sorted

 class DSA
 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         boolean ans=isSorted(arr,0);
         System.out.println(ans);
     }

     private static boolean isSorted(int[] arr,int i) {
         if (i == arr.length - 1) {
             return true;
         }
         if (arr[i] > arr[i + 1]) {
             return false;
         }
         return isSorted(arr,i+1);
     }
 }*/

/* import java.util.Scanner;                         //2. Enter an arr and check last index of num

 class DSA
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter num to be found in arr:");
        int m=sc.nextInt();
        int ans=lastIndex(arr,n-1,m);
        System.out.println(ans);
    }
    private static int lastIndex(int[] arr,int i,int m) {
        if(i==0){
            return -1;
        }

        if(arr[i]==m){
            return i;
        }
        return lastIndex(arr,i-1,m);
    }
}*/



/* class DSA                                             // 3.converting str to integer
 {
     public static void main(String[] args) {
         String str="1234";
         int n=str.length();

         int ans=strToInteger(str,0);
         System.out.println(ans);
     }

     private static int strToInteger(String str, int number) {
         if(str.length()==0){
             return number;
         }
         char ch=str.charAt(0);
         number=number+(ch-48)*(int) Math.pow(10,str.length()-1);
         String ros=str.substring(1);
         return strToInteger(ros,number);
     }
 }*/

/* import java.util.Scanner;                                 //printing while recursion is retuning back(dublicate in Sting)(hel*lo)

 class DSA
 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         System.out.println(Dublicate(s));
     }

     private static String Dublicate(String s) {
         if(s.length()<=1){
             return s;
         }
         String ros=Dublicate(s.substring(1));
         if(s.charAt(0)==ros.charAt(0)){
             return s.charAt(0)+"*"+ros;
         }
         return s.charAt(0)+ros;
         }
     }*/

/* import java.util.Scanner;                                 //removing dublicates in a String

 class DSA
 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         System.out.println(Dublicate(s));
     }

     private static String Dublicate(String s) {
         if(s.length()<=1){
             return s;
         }
         String ros=Dublicate(s.substring(1));
         if(s.charAt(0)==ros.charAt(0)){
             return ros;
         }
         return s.charAt(0)+ros;
     }
 }*/










/////////////////////////////// time and space complexity /////////////////////////////////////

/* class DSA {                                              //sorting 0's,1's and 2's(*****)  "o(n)ando(1)"
     public static void main(String[] args) {
         int[] arr = {1, 1, 0, 2, 1, 0, 1};
         int[] ans=sort(arr);
         display(ans);

     }

     private static int[] sort(int[] arr) {
         int low=0,mid=0,high=arr.length-1;

         while(mid<=high){
             if(arr[mid]==0){
                 swap(arr,low,mid);
                 mid++;
                 low++;
             }else if (arr[mid]==1){
                 mid++;
             }else {
                 swap(arr,mid,high);
                 high--;
             }

         }
         return arr;
     }
     public static void swap(int[] arr, int i, int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }


     private static void display(int[] arr) {
         for (int j : arr) {
             System.out.print(j + " ");
         }
         System.out.println();
     }

 }*/




/* class DSA                                  //Power(x,n) in (logn)(*****) , genrally we get dis in O(n),=.. but by dis we optimize the code..
 {
     public static void main(String[] args) {
         System.out.println(power(2,10));
     }
     public static int power(int x, int n){
         if(n==0){
             return 1;
         }
         int pnb2=power(x, n/2);
         if(n%2==1){
             return pnb2*pnb2*x;
         }else{
             return pnb2*pnb2;
         }
     }
 }*/

/* import java.util.Arrays;                         //Prime numbers o(n loglog n) most optimized code (*****)

 class DSA
 {
     public static void main(String[] args) {
         SOE(30);

     }
     public static void SOE(int n){
         boolean [] primes = new boolean[n+1];

         Arrays.fill(primes,true);
         primes[0]=primes[1]=false;
         for(int table=2; table*table<=n;table++){

             if(primes[table]== false){
                continue;
             }

              for (int mult=2; table*mult<=n;mult++){
                  primes[table*mult]=false;

              }
         }
         for (int i=0; i<primes.length;i++){
             if (primes[i]){
                 System.out.print(i+",");

             }
         }
     }
 }*/

/* class DSA                                                    //Two merged arrays
 {
     public static void main(String[] args) {
         int[] arr1={10,20,30,40,50,60};
         int[] arr2={5,10,15,20,25,30,35,40,45,50,55,60,65,70};

         int[] ans= mergeTwoSortedArrays(arr1,arr2);
         display(ans);

     }

     public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2){
         int[] merged = new int[arr1.length+arr2.length];
         int i=0,j=0,k=0;
         while(i<arr1.length && j<arr2.length){
             if(arr1[i]<=arr2[j]){
                merged[k]=arr1[i];
                i++;
                k++;
             }else{
                 merged[k]=arr2[j];
                 j++;
                 k++;
             }
         }
        if(i==arr1.length){
            while(j<arr2.length){
                merged[k]=arr2[j];
                j++;
                k++;
            }
        }
         if(j==arr2.length){
             while(i<arr1.length){
                 merged[k]=arr1[i];
                 i++;
                 k++;
             }
         }
     return merged;
     }
     private static void display(int[] ans) {
         for (int x:ans) {
             System.out.print(x+",");
         }
     }
 }*/

/*
 class DSA                                                           //Merge sort
 {
     public static void main(String[] args) {
         int[] arr={20,10,30,50,70,90,25,1,45};
         int[] ans= mergeSort(arr,0, arr.length-1);
         for (int x:ans) {
             System.out.print(x+",");
         }

     }
     public static int[] mergeSort(int[] arr,int lo,int hi){
         if(lo==hi){
             int[] br=new int[1];
             br[0]=arr[lo];

             return br;
         }
         int mid=(lo+hi)/2;

        int[] fh= mergeSort(arr, lo, mid);
        int[] sh=mergeSort(arr,mid+1,hi);

        int[] merge= mergeTwoSortedArrays(fh, sh);
        return merge;
     }

     public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2){
         int[] merged = new int[arr1.length+arr2.length];
         int i=0,j=0,k=0;
         while(i<arr1.length && j<arr2.length){
             if(arr1[i]<=arr2[j]){
                 merged[k]=arr1[i];
                 i++;
                 k++;
             }else{
                 merged[k]=arr2[j];
                 j++;
                 k++;
             }
         }
         if(i==arr1.length){
             while(j<arr2.length){
                 merged[k]=arr2[j];
                 j++;
                 k++;
             }
         }
         if(j==arr2.length){
             while(i<arr1.length){
                 merged[k]=arr1[i];
                 i++;
                 k++;
             }
         }
         return merged;
     }
 }*/

 /*class DSA                                               //Quick Sort
 {
     public static void main(String[] args) {
         int[] arr={20,10,30,50,60,5,80,25};
         quickSort(arr,0,arr.length-1);
         for (int val:arr){
             System.out.print(val+",");
         }
     }
     public static void quickSort(int[] arr, int lo, int hi){
         if(lo>=hi){
             return;
         }
         int mid=(lo+hi)/2;
         int pivot=arr[mid];

         int left=lo;
         int right=hi;

         while(left<=right){
             while(arr[left]<pivot){
                 left++;
             }

             while(arr[right]>pivot){
                 right--;
             }
             if(left<=right) {
                 int temp = arr[left];
                 arr[left] = arr[right];
                 arr[right] =  temp;

                 left++;
                 right--;
             }

         }
         //smaller problem
         quickSort(arr,lo,right);
         quickSort(arr,left,hi);

     }
 }*/

 //////////////////////////////////////////////////////// Back Tracking /////////////////////////////////////////////////////////

/* class DSA                                            //2. 1D Queen permutation
 {
     static int count=0;
     public static void main(String[] args) {
         QueenPermutation(new boolean[4],0,2,"");
     }
     public static void QueenPermutation(boolean[] boxes,int qpsf,int tq,String ans){
         if(qpsf==tq){
             count++;
             System.out.println(count+". "+ans);
             return;
         }
         for(int i=0;i<boxes.length;i++){
             if(boxes[i] == false){
                 boxes[i]=true;
                 QueenPermutation(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+"");
                 boxes[i]=false; //undo process
             }
         }
     }
 }*/

/* class DSA                                            //3. 1D Queen Combination
 {
     static int count=0;
     public static void main(String[] args) {
         QueenCombination(new boolean[4],0,2,"",-1);
     }
     public static void QueenCombination(boolean[] boxes,int qpsf,int tq,String ans,int lastBoxUsed){
         if(qpsf==tq){
             count++;
             System.out.println(count+". "+ans);
             return;
         }
         for(int i=lastBoxUsed+1;i<boxes.length;i++){
                 boxes[i]=true;
                 QueenCombination(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+"",i);
                 boxes[i]=false; //undo process

         }
     }
 }*/

/* class DSA                                                    //CoinChange Combination
 {
     public static void main(String[] args) {
        CoinCombination(new int[]{2,3,5,6},10,"",0);
     }
     public static void CoinCombination(int[] denom,int amount,String ans,int lastDenomIdx){
         if(amount==0){
             System.out.println(ans);
             return;
         }
         for(int i=lastDenomIdx;i<denom.length;i++){
             if(amount>=denom[i]){
             CoinCombination(denom,amount-denom[i],ans+denom[i],i);
             }
         }
     }
 }*/

 class DSA                                                           //CoinChange permutation
 {
     static int count=0;
     public static void main(String[] args) {
         CoinCombination(new int[]{2,3,5,6},10,"");
     }
     public static void CoinCombination(int[] denom,int amount,String ans){
         if(amount==0){
             count++;
             System.out.println(count+". "+ans);
             return;
         }
         for(int i=0;i<denom.length;i++){
             if(amount>=denom[i]){
                 CoinCombination(denom,amount-denom[i],ans+denom[i]);
             }
         }
     }
 }





 

 





