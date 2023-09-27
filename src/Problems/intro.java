//import java.net.StandardSocketOptions;
//import java.util.Scanner;



//public class intro {
//    public static void main(String[] args) {

//        System.out.println("enter a marks");           //Grading based on marks
//		Scanner sc=new Scanner(System.in);
//
//	    int a=sc.nextInt();
//	    int b=sc.nextInt();
//	    int c=sc.nextInt();
//
//	    int sum=a+b+c;
//	    int avg =sum/3;
//
//
//		 if (avg>=30 && avg<=50)
//		 {
//			System.out.println("c+");
//
//		 }
//		 else if(avg>=51 && avg<=70)
//		 {
//			System.out.println("b+");
//		 }
//		 else if (avg>=71)
//		 {
//			 System.out.println("a+");
//		 }
//		 else
//		 {
//			 System.out.println("c");
//		 }

//		Scanner sc=new Scanner(System.in);                    //checking the number is radix or not
//		String num;
//		System.out.println("enter a number:");
//		num=sc.nextLine();
//
//		if(num.matches("[01]+"))
//		{
//			System.out.println("Binary Radix=2");
//		}
//		else if(num.matches("[0-7]+"))
//		{
//			System.out.println("octal radix=8");
//		}
//		else if(num.matches("[0-9]+"))
//		{
//			System.out.println("decimal Radix=10");
//		}
//		else if(num.matches("[0-9a-fA-F]+"))
//		{
//			System.out.println("hexadecimal Radix=16");
//		}
//		else
//		{
//			System.out.println("not a number");
//		}

//		Scanner sc=new Scanner(System.in);               //checking for leap year
//		System.out.println("enter a year");
//		int year=sc.nextInt();
//		if(year%4==0 && year%100==0 && year%400==0)
//		{
//			System.out.println("its a leap year");
//
//		}
//		else
//		{
//			System.out.println("not a leap year");
//
//		}

//		Scanner sc=new Scanner(System.in);                //find the type of website and protocol used
//		System.out.println("enter a url");
//		String url=sc.nextLine();
//
//		String protocol=url.substring(0, url.indexOf(":"));
//
//		if (protocol.equals("http"))
//			System.out.println("hypertext Transfer Protocol");
//		else if (protocol.equals("ftp"))
//			System.out.println("file Transfer Protocol");
//		else if (protocol.equals("https"))
//			System.out.println("secured hypertext Transfer Protocol ");
//
//		String ext=url.substring(url.lastIndexOf(".")+1);
//
//		if (ext.equals("com"))
//		System.out.println("comercial");
//		else if (ext.equals("org"))
//		System.out.println("organisation");
//		else if (ext.equals("net"))
//		System.out.println("network");

//import java.util.Scanner;

import java.util.Scanner;

//		Scanner sc=new Scanner(System.in);                //find the type of website using switch case
//		System.out.println("enter a url");
//		String url=sc.nextLine();
//
//		String ext=url.substring(url.lastIndexOf(".")+1);
//		switch(ext)
//		{
//		case "com":System.out.println("commercial");
//		break;
//		case "net":System.out.println("network");
//		break;
//		case "org":System.out.println("organisation");
//		break;
//		}

/*class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               //Factorial of number
        System.out.println("enter the num:");
        int num = sc.nextInt();
        int fact = 1;
        for (
                int i = 1;
                i <= num; i++)
            fact = fact * i;
        System.out.println(fact);
    }
}*/


//        Scanner sc=new Scanner(System.in);               //sum of numbers
//        System.out.println("enter the num of  values u want:");
//        int num=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<=num;i++)
//            sum=sum+i;
//        System.out.println(sum);

//          Scanner sc=new Scanner(System.in);               //sum of numbers in between range
//          System.out.println("enter two numbers for range");
//          System.out.println("Enter num1");
//          int num1=sc.nextInt();
//          System.out.println("Enter num2");
//          int num2=sc.nextInt();
//          int sum=0;
//          for (int i=num1 ; i<=num2; i++)
//              sum=sum+i;
//          System.out.println(sum);

//          Scanner sc=new Scanner(System.in);               //prime number
//          System.out.println("enter lower and upper number:");
//          System.out.println("Enter lower number");
//          int lower=sc.nextInt();
//          System.out.println("Enter upper number");
//          int upper=sc.nextInt();
//          for(int num=lower;num<=upper;num++)
//            if(num>=1)
//                for (int i=2;i<=num;i++)
//                    if (num%i==0)
//                      break;
//                    else
//                       System.out.println(num);

//        Scanner sc=new Scanner(System.in);               //sum of digits of number
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        int sum=0;
//        while (num!=0) {
//            int digit = num % 10;
//            sum = sum + digit;
//            num = num / 10;
//        }
//        System.out.println(sum);

//        Scanner sc=new Scanner(System.in);           //Reversing a number
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        int reverse=0;
//        while (num>0){
//            int digit=num%10;
//            reverse=(reverse*10)+digit;
//            num=num/10;
//        }
//        System.out.println(reverse);

//        Scanner sc=new Scanner(System.in);           //palindrome number
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        int temp=num;
//        int reverse=0;
//        while (temp>0){
//            int digit=temp%10;
//            reverse=(reverse*10)+digit;
//            temp=temp/10;
//        }
//        System.out.println(reverse);
//        if (num==reverse)
//            System.out.println("palindrome");
//        else
//            System.out.println("not a palindrome number");

//        String str="boob";                               //string palindrome n reversing a string
//        StringBuilder str1=new StringBuilder();
//        str1=str1.append(str);
//        str1.reverse();
//        System.out.println(str1);
//        if(str.contentEquals(str1))
//            System.out.println("palindrome");
//        else
//            System.out.println("not a palindrome");


//        int sum=0,num,digit;                       //Armstrong num
//        for(int i=1;i<=1000;i++) {
//            num = i;
//            while (num > 0) {
//                digit = num % 10;
//                sum = sum + (digit * digit * digit);
//                num = num / 10;
//            }
//            if (i == sum)
//            {
//                System.out.println(i+" ");
//            }
//            sum = 0;
//        }

//        Scanner sc=new Scanner(System.in);                     //Program to print A.P Series
//        System.out.println("Program to print A.P Series");
//        System.out.println("Enter a,d and n");
//        int a=sc.nextInt();
//        int d=sc.nextInt();
//        int n=sc.nextInt();
//
//        int term=a;
//        for(int i=0;i<=n;i++)
//        {
//          System.out.print(term+",");
//          term=term+d;
//        }

//        Scanner sc=new Scanner(System.in);                     //Program to print G.P Series
//        System.out.println("Program to print G.P Series");
//        System.out.println("Enter a,d and n");
//        int a=sc.nextInt();
//        int d=sc.nextInt();
//        int n=sc.nextInt();
//
//        int term=a;
//        for(int i=0;i<=n;i++)
//        {
//          System.out.print(term+",");
//          term=term*d;
//        }

//        Scanner sc=new Scanner(System.in);                     //Program to print Fibonaci  Series
//        System.out.println("Program to print Fibonacci series ");
//        System.out.println("Enter the number of terms");
//        int n=sc.nextInt();
//
//        int a=0,b=1,c;
//        System.out.print(a+","+b+",");
//        for(int i=0;i<=n-2;i++)
//        {
//          c=a+b;
//          System.out.print(c+",");
//          a=b;
//          b=c;
//        }

//        Scanner sc=new Scanner(System.in);         //pattern
//        int n=sc.nextInt();
//        int count=0;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                ++count;
//                System.out.format("%02d ",count);
//            }
//            System.out.println(" ");
//        }
//        5
//        01 02 03 04 05
//        06 07 08 09 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//
//                System.out.format("%02d ",i);
//            }
//            System.out.println(" ");
//        }
//        5
//        01
//        02 02
//        03 03 03
//        04 04 04 04
//        05 05 05 05 05


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//
//                System.out.format("%02d ",j);
//            }
//            System.out.println(" ");
//        }
//        5
//        01
//        01 02
//        01 02 03
//        01 02 03 04
//        01 02 03 04 05


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                ++count;
//                System.out.format("%02d ",count);
//            }
//            System.out.println(" ");
//        }
//        5
//        01
//        02 03
//        04 05 06
//        07 08 09 10
//        11 12 13 14 15


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//
//*
//* *
//* * *
//* * * *
//* * * * *

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i+1;j++)
//            {
//                count++;
//                System.out.format("%02d ",count);
//            }
//            System.out.println(" ");
//        }
//        5
//        01 02 03 04 05
//        06 07 08 09
//        10 11 12
//        13 14
//        15


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i+1;j++)
//            {
//                System.out.format("%2d ",j);
//            }
//            System.out.println(" ");
//        }
//        5
//        1  2  3  4  5
//        1  2  3  4
//        1  2  3
//        1  2
//        1

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if( i<=j)
//                    System.out.format("* ");
//                else
//                    System.out.format("  ");
//            }
//            System.out.println(" ");
//        }
//                5
//                * * * * *
//                  * * * *
//                    * * *
//                      * *
//                        *


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if( i<=j)
//                    System.out.format("* ");
//                else
//                    System.out.format(" ");   //Give only one space
//            }
//            System.out.println(" ");
//        }
//        5
//                * * * * *
//                 * * * *
//                  * * *
//                   * *
//                    *


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if( i>=j)
//                    System.out.format("* ");
//                else
//                    System.out.format(" ");
//            }
//            System.out.println(" ");
//        }
//        5
//                *
//                * *
//                * * *
//                * * * *
//                * * * * *

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if(i+j>5)
//                    System.out.format("* ");
//                else
//                    System.out.format("  ");
//            }
//            System.out.println(" ");
//        }
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////   Arrays    ////////////
//        int A[]={3,9,7,8,12,6,15,5,4,10};               //Sum of all elements
//        int Sum=0;
//        for (int i=0;i< A.length;i++)
//        {
//            Sum=Sum+A[i];
//        }
//        System.out.println(Sum);


//        int A[]={3,9,7,8,12,6,15,5,4,10};                       //Searching an Element
//        System.out.println("Enter the element to be searched");
//        Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        for (int i=0;i< A.length;i++)
//        {
//            if (n==A[i])
//                System.out.println("number got at index "+i);
//        }
//        System.out.println("not found");


//        int A[]={3,9,7,8,12,6,15,5,4,10};                       //Maximum Element
//        int max=A[0];
//        for (int i=0;i< A.length;i++)
//        {
//            if (A[i] > max)
//                max=A[i];
//        }
//        System.out.println("Maximum Element is "+max);

//        int A[]={3,9,7,8,12,6,15,5,4,10};                       //Second Maximum Element
//        int max1=A[0];
//        int max2=A[0];
//        for (int i=0;i< A.length;i++)
//        {
//            if (A[i] > max1)
//            {
//                max2 = max1;
//                max1 = A[i];
//            }
//            else if (A[i]>max2)
//            {
//                max2=A[i];
//            }
//        }
//        System.out.println(" Second Maximum Element is "+max2);

//        int A[]={3,9,7,8,12,6,15,5,4,10};               //left Rotation of Array
//        for (int x:A)
//            System.out.print(x+",");
//        System.out.println("");
//
//        int temp=A[0];
//        for (int i=1;i< A.length;i++)
//        {
//            A[i-1]=A[i];
//        }
//        A[A.length-1]=temp;
//
//        for (int x:A)
//            System.out.print(x+",");
//        System.out.println("");

//        int A[]={3,9,7,8,12,6,15,5,4,10};               //Right Rotation of Array
//        for (int x:A)
//            System.out.print(x+",");
//        System.out.println("");
//
//        int temp=A[A.length-1];
//        for (int i=A.length-2;i>-1;i--)
//        {
//            A[i+1]=A[i];
//        }
//        A[0]=temp;
//
//        for (int x:A)
//            System.out.print(x+",");
//        System.out.println("");


//        int A[]=new int[10];                          //Inserting an element to an Array
//        Scanner sc=new Scanner(System.in);
//        int n=6;
//
//        A[0]=5;
//        A[1]=7;
//        A[2]=6;
//        A[3]=9;
//        A[4]=4;
//        A[5]=1;
//        for(int i=0; i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");
//
//        System.out.println("enter the number to be inserted:");
//        int x=sc.nextInt();
//        System.out.println("enter the index number:");
//        int index=sc.nextInt();
//        for(int i=n;i>index;i--)
//            A[i]=A[i-1];
//        A[index]=x;
//
//        for(int i=0; i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");


//        int A[]=new int[10];                          //Deleting an element to an Array
//        Scanner sc=new Scanner(System.in);
//        int n=6;
//
//        A[0]=5;
//        A[1]=7;
//        A[2]=6;
//        A[3]=9;
//        A[4]=4;
//        A[5]=1;
//        for(int i=0; i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");
//
//        System.out.println("enter the index number:");
//        int index=sc.nextInt();
//        for (int i=index;i<n;i++)
//            A[i]=A[i+1];
//
//        n=n-1;
//        for(int i=0; i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println(" ");

//         int A[]={8,6,10,9,2,15,7,13,14,11};        //Coping an array to B[]
//         int B[]=new int[10];
//         for(int i=0;i<A.length;i++)
//             B[i]=A[i];
//         for (int x:B)
//            System.out.print(x+",");

//        int A[]={8,6,10,9,2,15};       //increasing length of array
//        int B[]=new int[2*A.length];
//        for(int i=0;i<A.length;i++)
//            B[i]=A[i];
//        System.out.println(B.length);
//        for(int x:B)
//        System.out.print(x+",");


//            int A[][]={{3,4,7},{8,4,2},{2,0,6}};                  //Adding of matrix
//            int B[][]={{6,5,4},{8,5,2},{1,1,1}};
//
//            int C[][]=new int[3][3];
//
//            for(int i=0;i<3;i++)
//            {
//                for(int j=0;j<3;j++)
//                {
//                    C[i][j]=A[i][j]+B[i][j];
//                }
//            }
//            for(int x[]:C)
//            {
//                for(int y:x)
//                {
//                    System.out.print(y+" ,");
//                }
//                System.out.println("  ");
//            }

//        int A[][]={{3,4,7},{8,4,2},{2,0,6}};           //Multiplying Matrix
//        int B[][]={{1,0,0},{0,1,0},{0,0,1}};          //condition=num of column of 1st matrix == num of rows of 2nd matrix
//
//        int C[][]=new int[3][3];                       //to check the code, we write matrix B in given form.So we get ans MAtrix A only..
//
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                C[i][j]=0;
//                for(int k=0;k<3;k++)
//                {
//                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
//                }
//            }
//        }
//        for(int x[]:C)
//        {
//            for(int y:x)
//            {
//                System.out.print(y+" ,");
//            }
//            System.out.println("  ");
//        }

/*        String arr[]={"java","pascal","pyton","nikitha"};         //sorting an Array using builtin function
        java.util.Arrays.sort(arr);
        for (String x:arr)
            System.out.print(x)*/


//    }
//}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
               /////////////////Methods////////////////////
/*class methods{                               //practising methods
    static int max(int X, int Y)            //using static
    {
        if (X>Y)
            return X;
        else
            return Y;
    }
    public static void main(String[] args){
        int a=10, b=15;
        System.out.println(max(a,b));
    }
}*/

/*class methods
{
    static void change(int X[], int index, int value)   //Here we are reffering an object(Array)
    {
       X[index]=value;
    }
    public static void main(String[] args)
    {
        int A[]={2,4,6,8,7,4,1};
        change(A,2,20);
        for(int x:A)
        {
            System.out.print(x+",");
        }
    }
}*/

/*class methods                                     // Prime number
{
    static int isPrime(int n)
    {
        for (int i = 2; i < n / 2; i++)
        {if (n%i==0)
                System.out.println("-");
        }

        return n;
    }
    public static void main(String[] args)
    {
        for (int n=0;n<100;n++)
            System.out.println(isPrime(n));
    }
}*/

/*import java.util.Scanner;                      //checking the number is prime or not

class methods
{
    static boolean isPrime(int n)
    {
        for (int i = 2; i < n / 2; i++)
        {if (n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

            System.out.println(isPrime(n));
    }
}*/

//import java.util.Scanner;                         ////GCD or H.C.F of two numbers using calling method

/*class methods
{
    static int isGcd(int m, int n)
    {
        do{if(m>n)
        {
            m=m-n;
        }
        else {
            n=n-m;
        }}while(m!=n);
            return m;
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int m,n;
         m=sc.nextInt();
         n=sc.nextInt();
         System.out.println(isGcd(m,n));
    }
}*/

/*import java.util.Scanner;                       //GCD or H.C.F of two numbers
class methods
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        do{if(m>n)
        {
            m=m-n;
        }
        else {
            n=n-m;
        }}while(m!=n);
        System.out.println(m);

    }
}*/

/*class methods                                        //Maximum element in an Array using Methods
{
    static int max(int A[]) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        System.out.println(max(A));
    }
}*/

/*class methods                                      //Reversing a number using Methods
{
    static int reverse(int n)
    {
        int r=0;
        while(n!=0) {

            int digit = n % 10;
            r = r*10 + digit;
            n = n / 10;
        }
        return r;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}*/

/*class methods                                          //Reversing an array using Methods
{
    static int[] rev(int A[])
    {
        int B[]=new int[A.length];

        for (int i =A.length-1,j=0; i>=0; i--,j++)
            B[j]=A[i];
//        for (int j=0;j<B.length;j++)
//            System.out.print(B[j]+",");
        return B;
    }
    public static void main(String[] args)
    {
        int A[]={2,3,4,5,6,7,8,9};
        System.out.println(rev(A));
    }
}*/

/*class  methods                                            //Practising Variable Argument method
{
    static void showList(String...A)
    {
        for(int i=0;i<A.length;i++)
                System.out.println(i+1+". "+A[i]);
    }
    public static void main(String[] args)
    {
        showList("Eshwar","Teja","yamini","kavya","anjali");
    }
}*/

/*class methods                                            //max number using variable args
{
    static int max(int...A)
    {
        int m=A[0];
        for(int i=1;i<A.length;i++)
        {
            if (A[i]>m)m=A[i];
        }
        return m;
    }
    public static void main(String... args)
    {

        System.out.println(max(2,3,4,5,6,88,9,8));
    }
}*/

class methods {
   

    public static void main(String... args) {

        System.out.println("Eshwar");
    }
}



























































