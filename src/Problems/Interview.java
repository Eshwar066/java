package Problems;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;


//public class Interview {
//    public static void main(String[] args) {
//        String str1="eshwar";
//        String str2="sai";
//
//        char[] c1=str1.toCharArray();
//        char[] c2=str2.toCharArray();
//
//        ArrayList<Character> arr=new ArrayList<>();
//        ArrayList<Character> arr1=new ArrayList<>();
//
//        for(int i=0;i<str1.length();i++){
//            char c=c1[i];
//            if(c=='a'|| c=='e' || c=='i' ||c=='o' || c=='u'){
//                arr.add(c);
//            }else{
//                arr1.add(c);
//            }
//
//            if(i<c2.length ){
//                char c3=c2[i];
//                if(c3=='a'|| c3=='e' || c3=='i' ||c3=='o' || c3=='u'){
//                    arr.add(c3);
//                }else{
//                    arr1.add(c3);
//                }
//            }
//        }
//
//        String word="";
//       for(char x:arr){
//           word+=x;
//       }
//        for(char x:arr1){
//            word+=x;
//        }
//        System.out.println(word);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="qwertyuiopasdfghjklzxcvbnm";
//        String resV="";
//        String resC="";
//
//
//        for(int i=0;i<str.length();i++){
//            char c=str.charAt(i);
//            if(c=='a' || c=='e' || c=='i'|| c=='o'||c=='u'){
//              resV+=c;
//            }else{
//                resC+=c;
//            }
//        }
//        System.out.println(resV+""+resC);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="qwertyuiopasdfghjklzxcvbnm";
//        String[] str1=str.split("");
//        int l=0;
//        int r=str1.length-1;
//        while(l<r){
//            if(str1[l].equals("a") ||str1[l].equals("e") ||str1[l].equals("i") ||str1[l].equals("o") ||str1[l].equals("u") ){
//                String temp=str1[l];
//                str1[l]=str1[r];
//                str1[r]=temp;
//                l++;
//                r--;
//
//            }else{
//                l++;
//            }
//        }
//        for(String s:str1){
//            System.out.println(s);
//        }
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="eshwarsai";
//        ArrayList<Character> arr=new ArrayList<>();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
//                arr.add(0,str.charAt(i));
//            }else{
//                arr.add(str.charAt(i));
//            }
//        }
//        String res="";
//        for(char c:arr){
//            res+=c;
//        }
//        System.out.println(res);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str1="Eshwar";
//        String str2="Polimera";
//        String res="";
//
//        int k=Math.max(str1.length(),str2.length());
//        for(int i=0;i<k;i++){
//            if(i<str1.length()) {
//                res += str1.charAt(i);
//            }
//            res+=str2.charAt(i);
//        }
//        System.out.println(res);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="madam";
//        int l=0;
//        int r=str.length()-1;
//        while(l<r){
//            if(str.charAt(l)!=str.charAt(r)){
//                System.out.println("not a palindrome");
//                break;
//            }
//            l++;
//            r--;
//
//        }
//        System.out.println("palindrome");
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="Eshwar";
//        String reversed=reverseString(str);
//        System.out.println(reversed);
//    }
//    public static String reverseString(String str){
//        if(str.length()==0){
//            return str;
//        }
//        return reverseString(str.substring(1))+str.charAt(0);
//    }
//}

//sorting zeros ,ones and twos
//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={0,1,2,0,1,1,0,0,2,2,0,1,2};
//        ArrayList<Integer> arr1=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                arr1.add(0,arr[i]);
//            } else if (arr[i]==1) {
//                arr1.add(arr[i]);
//            }
//        }
//        while(arr1.size()<arr.length){
//            arr1.add(2);
//        }
//        System.out.println(arr1);
//
//    }
//}

//most common element in a string
//public class Interview {
//    public static void main(String[] args) {
//        String str="eshwarsairampolimera";
//        int[] arr=new int[26];
//        for(int i=0;i<str.length();i++){
//            arr[str.charAt(i)-'a']++;
//        }
//        int max=0;
//       for(int x:arr){
//          if(x>max){
//              max=x;
//          }
//       }
//        System.out.println(str.charAt(max));
//    }
//}


//most common element in a string
//public class Interview {
//    public static void main(String[] args) {
//        String str="eshwarsairampolimera";
//        HashMap<Character,Integer> arr=new HashMap<>();
//        for(int i=0;i<str.length();i++) {
//            char c=str.charAt(i);
//            if(arr.containsKey(c)){
//                arr.put(c,arr.get(c)+1);
//            }else{
//                arr.put(c,1);
//            }
//        }
//        int max=0;
//        char str1='z';
//        for(Map.Entry<Character,Integer> x:arr.entrySet()){
//            char c=x.getKey();
//            int val=x.getValue();
//            if(val>max){
//                str1=c;
//                max=val;
//            }
//        }
//        System.out.println(str1+","+max);
//    }
//}


//first non-repeating character in a string
//public class Interview {
//    public static void main(String[] args) {
//        String str="helloworld";
//        int[] arr=new int[26];
//        for(int i=0;i<str.length();i++){
//            arr[str.charAt(i)-'a']++;
//        }
//        char c='\0';
//        for(int i=0;i<str.length();i++){
//
//            if(arr[str.charAt(i)-'a']==1){
//                c=str.charAt(i);
//                break;
//            }
//        }
//        System.out.println(c);
//    }
//}


//replace a character with  another character
//public class Interview {
//    public static void main(String[] args) {
//        String str="eshwar";
//        String str1="";
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='r'){
//                str1+='a';
//            }else{
//                str1+=str.charAt(i);
//            }
//        }
//        System.out.println(str1);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str = "hello i m eshwar from bellary siruguppa";
//        String[] words = str.split(" "); // Split the string into words
//        StringBuilder capitalizedStr = new StringBuilder();
//
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                // Capitalize the first letter of each word
//                word = word.substring(0, 1).toUpperCase() + word.substring(1);
//                capitalizedStr.append(word).append(" ");
//            }
//        }
//
//        // Remove the trailing space and print the result
//        String result = capitalizedStr.toString().trim();
//        System.out.println(result);
//    }
//}


//remove dublicate numbers
//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={2,3,5,6,2,2,34,3,5,2,1,1,1,1,3,34,4,3};
//        ArrayList<Integer> arr1=new ArrayList<>();
//        for(int x:arr){
//            if(!arr1.contains(x)){
//                arr1.add(x);
//            }
//        }
//        System.out.println(arr1);
//    }
//}

// public class Interview {
//     public static void main(String[] args) {
//         String str1="i have a three apples";
//         String  str2="i have a two mangos";
//         String[] strW1=str1.split(" ");
//        String[] strW2=str2.split(" ");
//
//        int count=0;
//        for(int i=0;i<strW1.length  ;i++){
//            if(strW2[i].equals(strW1[i])){
//                count++;
//             }
//         }
//        System.out.println(count);
//     }
// }

//factorial number
//public class Interview {
//    public static void main(String[] args) {
//        int num=5;
//        int ans=factorial(num);
//        System.out.println(ans);
//    }
//
//    private static int factorial(int num) {
//        if(num==0 || num==1){
//            return 1;
//        }
//
//        return num*factorial(num-1);
//    }
//}



//public class Interview {
//    public static void main(String[] args) {
//        String str1="Eshwar";
//        String str2="sai";
//        String str="";
//
//        int l=0,r=str1.length()-1;
//        while(l<=r){
//            str+=str1.charAt(l);
//            if(l<str2.length()){
//                str+=str2.charAt(l);
//            }
//            l++;
//        }
//        System.out.println(str);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={0,1,1,0,0,1,0,1,0,0,1};
//        int l=0;
//        int r=arr.length-1;
//        while(l<r){
//            if(arr[l]==1 && arr[r]==0){
//                int temp=arr[l];
//                arr[l]=arr[r];
//                arr[r]=temp;
//                l++;
//                r--;
//            }else if(arr[l]==1 ){
//                r--;
//            }else{
//                l++;
//            }
//        }
//        for(int x:arr){
//            System.out.println(x);
//        }
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 1, 0, 0, 2, 2, 2, 1, 0, 1, 0, 0, 2, 1};
//        int low = 0;
//        int mid = 0;
//        int high = arr.length - 1;
//
//        while (mid <= high) {
//            if (arr[mid] == 0) {
//                // Swap arr[low] and arr[mid]
//                int temp = arr[low];
//                arr[low] = arr[mid];
//                arr[mid] = temp;
//                low++;
//                mid++;
//            } else if (arr[mid] == 1) {
//                mid++;
//            } else {
//
//                int temp = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = temp;
//                high--;
//            }
//        }
//
//        // Print the sorted array
//        for (int x : arr) {
//            System.out.println(x);
//        }
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 1, 0, 0, 2, 2, 2, 1, 0, 1, 0, 0, 2, 1};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i],i);
//        }
//        System.out.println(map);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        Integer[] arr1={1,2,3,4,5};
//        Integer[] arr2={4,5,6,7,8};
//
//        ArrayList<Integer> arr3=new ArrayList<>(Arrays.asList(arr1));
//        ArrayList<Integer> arr4=new ArrayList<>(Arrays.asList(arr2));
//
//        List<Integer> res=new ArrayList<>();
//        for(int x:arr3){
//            if(arr4.contains(x)){
//                res.add(x);
//            }
//        }
//        System.out.println(res);
//    }
//}


//swap zero's one's and two's
//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={1,0,1,1,0,0,1,1,1,1,2,2,2,1,0};
//        int l=0;
//        int r=arr.length-1;
//        int m=0;
//        while(m<r){
//            if(arr[m]==0 ){
//                int temp=arr[m];
//                arr[m]=arr[l];
//                arr[l]=temp;
//                l++;
//                m++;
//            }else if(arr[m]==1){
//                m++;
//            }else{
//                int temp=arr[m];
//                arr[m]=arr[r];
//                arr[r]=temp;
//                r--;
//            }
//        }
//        for(int x:arr){
//            System.out.println(x);
//        }
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="im eshwar from siruguppa bellary";
//        String[] str1=str.split(" ");
//        String str2="";
//        for(String s:str1){
//            str2+=s.substring(0,1).toUpperCase()+s.substring(1);
//            str2+=" ";
//        }
//        System.out.println(str2);
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str=("(((())))");
//        String[] str1=str.split("");
//        Stack<String> stack=new Stack<>();
//        for(String s:str1){
//            if(s.equals("(")){
//                stack.push(s);
//            }else{
//                stack.pop();
//            }
//        }
//        if(stack.isEmpty()){
//            System.out.println("balanced parenthesis");
//        }else{
//            System.out.println("not balanced");
//        }
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str="[[{{()}}]]";
//        String[] str1=str.split("");
//        boolean check=true;
//        Stack<String> stack=new Stack<>();
//        for(String s:str1){
//            if(s.equals("[") || s.equals("{") || s.equals("(")){
//                stack.push(s);
//            }else if(s.equals(")") && stack.peek().equals("(")){
//                stack.pop();
//            }else if(s.equals("}") && stack.peek().equals("{")){
//                stack.pop();
//            }else if(s.equals("]") && stack.peek().equals("[")){
//                stack.pop();
//            }else{
//                check=false;
////                System.out.println("not balanced");
//            }
//        }
//        if(stack.isEmpty() && check==true){
//            System.out.println("balanced");
//        }else{
//            System.out.println("not balanced");
//        }
//
//    }
//}

//public class Interview {
//    public static void main(String[] args) {
//        String str= "abc(def)qwee";
//        String[] str1=str.split("");
//        ArrayList<String> arr=new ArrayList<>();
//        int l=0;
//        int r=str1.length-1;
//        String res="";
//        int right=0;
//        while(l<r){
//            if(str1[l].equals(")") ){
//                right=l;
//            }
//            l++;
//        }
//        for(int i=0;i<str1.length;i++){
//            if(str1[i].equals("(")){
//                i=right+1;
//            }
//            arr.add(str1[i]);
//        }
//        for(String s:arr){
//            res+=s;
//        }
//        System.out.println(res);
//    }
//}

//Parenthesis Indexing: Write a Java program to find the index of the matching closing parenthesis for a given open parenthesis in an expression.

//public class Interview {
//    public static void main(String[] args) {
//        String str = "(abc{def[gh]ij}kl)";
//        String[] str1 = str.split("");
//        HashMap<Integer, Integer> map = new HashMap<>();
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < str1.length; i++) {
//            String currentChar = str1[i];
//
//            if (currentChar.equals("(") || currentChar.equals("{") || currentChar.equals("[")) {
//                stack.push(i);
//            } else if (currentChar.equals(")") || currentChar.equals("}") || currentChar.equals("]")) {
//                if (!stack.isEmpty()) {
//                    int openingBracketIndex = stack.pop();
//                    map.put(openingBracketIndex, i);
//                } else {
//                    // If there's a closing bracket without a corresponding opening bracket, it's not balanced
//                    System.out.println("Not balanced");
//                    return;
//                }
//            }
//        }
//
//        if (stack.isEmpty()) {
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                System.out.println("Open bracket at index " + entry.getKey() + " matches with close bracket at index " + entry.getValue());
//            }
//        } else {
//            System.out.println("Not balanced");
//        }
//    }
//}


//String Truncation: Truncate a string to a specified length and add "..." at the end if it's longer.
//public class Interview {
//    public static void main(String[] args) {
//       String str="String Truncation: Truncate a string to a specified length and add \"...\" at the end if it's longer" ;
//       String[] str1=str.split(" ");
//       String word="";
//
//       for(int i=0;i<12;i++){
//           word+=str1[i];
//           word+=" ";
//       }
//       word+="...";
//        System.out.println(word);
//    }
//}

//convert camel case to snake case
//public class Interview {
//    public static void main(String[] args) {
//        String str="Eshwar Sai Ram Polimera";
//        String[] str1=str.split(" ");
//        String res="";
//        for(int i=0;i<str1.length;i++){
//            res+="_";
//           res+=str1[i].substring(0,1).toLowerCase()+str1[i].substring(1);
//        }
//        System.out.println(res);
//    }
//}

//two sum
//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={3,4,6,7,3,2};
//        int target=7;
//        int result1=0;
//        int result2=0;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int res=target-arr[i];
//            if(map.containsKey(res)){
//                result1=map.get(res);
//                result2=i;
//            }
//            map.put(arr[i],i);
//        }
//        System.out.println(result1+" "+result2);
//    }
//}

//Integer Palindrome
//public class Interview {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,5,4,3,2,1};
//        int l=0,r=arr.length-1;
//        boolean res=true;
//        while(l<r){
//            if(arr[l]!=arr[r]){
//                res=false;
//                break;
//            }
//            l++;
//            r--;
//        }
//        if(res){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("not a palindrome");
//        }
//    }
//}

//Write a Java program to find the longest palindromic substring in a given string

//public class Interview {
//
//    public static void main(String[] args) {
//        String digits="6363824367";
//        if (digits.length() == 0)  new ArrayList<>();
//
//        List<String> ans = new ArrayList<>();
//        ans = letterCombinationss(digits);
//
//        // if(ans.get(0).length() == 0)
//
//        System.out.println(ans);;
//    }

//        public static List<String> letterCombinationss(String digits) {
//
//            String[] map = {".","..",
//                    "abc",
//                    "def",
//                    "ghi",
//                    "jkl",
//                    "mno",
//                    "pqr",
//                    "tuv",
//                    "wxy"
//            };
//
//            if(digits.length() == 0){
//                List<String> temp = new ArrayList<>();
//                temp.add("");
//                return temp;
//            }
//            char front = digits.charAt(0);
//            String rest = digits.substring(1);
//            List<String> rest_ans = letterCombinationss(rest);
//
//            // if(rest_ans.get(0).length() == 0) return new ArrayList<>();
//            List<String> ans = new ArrayList<>();
//
//            String f = map[front - '0'];
//            for(int i = 0 ; i<f.length(); i++){
//                for(var v : rest_ans){
//                    ans.add(f.charAt(i) + v);
//                }
//            }
//
//            return ans;
//        }
//}

/*//Removing dublicate characters from string using frequency array
public class Interview {
    public static void main(String[] args) {
        String str="eshwarsaisai";
        String str1="";
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            arr[c- 'a']++;
        }
        for(int i=0;i<str.length();i++){
          char c=str.charAt(i);
          if(arr[c-'a']==1){
              str1=str1+c;
          }
        }
        System.out.println(str1);
    }
}*/

//distinct characters of length 2
//public class Interview {
//    public static void main(String[] args) {
//        String str="aabbccdddrreelskipp";
//        String c="";
//        HashMap<String,Integer> map=new HashMap<>();
//        for(int i=0;i<str.length();i++){
//             c+=str.charAt(i);
//            if(c.length()==2 && !map.containsKey(c)){
//                map.put(c,1);
//                c=c.substring(1);
//            }else if(map.containsKey(c) && c.length()==2 ){
//                c=c.substring(1);
//            }
//        }
//        System.out.println(map);
//    }

/*import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        String str = "eshwarsaisai";
        String str1 = "";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in 'str' using a HashMap
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Append unique characters to 'str1'
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.get(c) == 1) {
                str1 = str1 + c;
            }
        }

        System.out.println(str1); // Output: "ehwri"
    }
}*/


/*public class Interview {
    public static void main(String[] args) {
        int[] arr={2,4,1,4,5,2,1,9,8,7,22,99};

        int res=0;
        int target=2;
        int k=0;
        for(int i=0;i<arr.length;i++){
             k=Math.max(k,arr[i]);
        }

        int[] freq=new int[k+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=k;i>0;i--){
            if(freq[i]>0){
                target--;
            }
            if(freq[i]>0 && target==0  ){
                res=i;
            }
        }
        System.out.println(res);

    }
}*/






