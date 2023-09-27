package Problems;/* class DSA                                  //Factorial of a number
 {
     public static void main(String[] args)
     {
         System.out.println(Fact(5));
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
///////////////// print recursion ////////////////////////////////

/* class DSA1                                 //Print Subsequences(optimized)
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

/*class DSA1                                       //print permutation(optimized)
{
    public static void main(String[] args) {
        printPermutation("abcd","");
    }
    public static void printPermutation(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans+",");
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



//////////// time and space complexity /////////////////////////

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

 import java.util.Arrays;                         //Prime numbers o(n loglog n) most optimized code (*****)

 class DSA1
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
 }



