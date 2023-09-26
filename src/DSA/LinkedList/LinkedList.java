package DSA.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


//adding a num at first in linked list
//public class LinkedList {
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 6, 7, 4, 2, 4, 6};
//        Node head=new Node(arr[0]);
//        Node current=head;
//
//        for(int i=0;i<arr.length;i++){
//            Node newNode= new Node(arr[i]);
//            current.next=newNode;
//            current=newNode;
//        }
//
//        Node first=new Node(8);
//        first.next=head;
//        head=first;
//
//
//        current=head;
//        while (current != null) {
//            System.out.println(current.data);
//            current=current.next;
//
//        }
//    }
//}

/*public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 4, 2, 4, 6};
        Node head=new Node(arr[0]);
        Node current=head;
        Node last=head;

        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            current.next=newNode;
            current=newNode;

            last=newNode;
        }

        Node newNode1=new Node(10);
        last.next=newNode1;

        current=head;
        while (current != null) {
            System.out.println(current.data);
            current=current.next;

        }
    }
}*/


/*
//Adding element at desired position
public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 4, 2, 4, 6};
        Node head=new Node(arr[0]);
        Node current=head;


        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }

        int pos=3;
        current=head;
        Node middle=new Node(10);
        for(int i=0;i<pos-1;i++){
            current = current.next;
        }
        middle.next=current.next;
        current.next=middle;

        current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}*/

//remove the nth node from last of linkedlist.
/*public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 4, 2, 4, 6};
        int pos=2; // from end
        Node head=new Node(arr[0]);
        Node current=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }

        int count=0;
        current=head;
        while (current!=null){
            current=current.next;
            count++;
        }
//        System.out.println(count);
        current=head;
        int indexFromStart=count-pos-1;
        for(int i=0;i<indexFromStart;i++){
            current=current.next;
        }
        current.next=current.next.next;

        current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
}*/

/*public class LinkedList {
    public static void main(String[] args) {
        int[] nums={2,4,5,6,8,3,5,9,2,3}; int k=2;
        k=k-1;


        int[] arr=new int[10];
        int res=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            arr[num]++;
        }

       for(int i=arr.length-1;i>0;i--){
           if(arr[i]>0 && k>0){
               k--;
           }else if(arr[i]>0 && k==0){
               res=i;
               break;
           }

       }
        System.out.println(res);
    }
}*/


public class LinkedList {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,8};
        Node head=new Node(arr[0]);
        Node current=head;
//        Node last=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            current.next=newNode;
            current=newNode;

//            last=newNode;
        }

//adding number at the begining
//        Node num=new Node(10);
//        num.next=head;
//        head=num;

        //adding number at last
//        Node num=new Node(10);
//        last.next=num;

//        adding num at desired position
//        int position=3;
//        current=head;
//        Node middle=new Node(10);
//        for(int i=0;i<position;i++){
//            current=current.next;
//        }
//        middle.next=current.next;
//        current.next=middle;

//        adding number at position from back
//        current=head;
//        int position=4;
//        int count=0;
//        while(current!=null){
//            count++;
//            current=current.next;
//        }
//        int pos=count-position-1;
//        current=head;
//
//        Node middle=new Node(10);
//        for(int i=0;i<pos;i++){
//            current=current.next;
//        }
//        middle.next=current.next;
//        current.next=middle;

        int pos=3;
        current=head;
        for(int i=0;i<pos;i++){
            current=current.next;
        }








        current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
