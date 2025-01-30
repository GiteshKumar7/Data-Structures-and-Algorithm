//  23. Leetcode  Merge k Sorted Lists
//https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.PriorityQueue;

public class C40 {
     public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data= data;
                this.next= null;
            }

     }

     public static Node head;
     public  static Node tail;
     public static int size;    
     
     public static Node mergeKsortedList(Node[] list){ 
        // taking the array of linnked lis as an input


        Node dummy=new Node(-1);
        Node temp = dummy;

        // creation of the priority queue
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.data-b.data);

        //adding the head of the array of the linked list
        for(Node node: list){
            if(node!=null){
                pq.add(node);
            }
        }
         
        // loop until the priority queue is empty
        while(!pq.isEmpty()){
            // remove the smallest element from the priority queue
            Node smallest= pq.poll();
            temp.next= smallest;
              temp= temp.next;

              if(smallest.next!=null){
                pq.add(smallest.next);
              }
        }

        return dummy.next;
     }

    public static void print(Node head){

        Node temp= head;
        while(temp!=null){
           System.out.print(temp.data +"-> ");
           temp= temp.next;
        }
        System.out.println("Null");
   
       }
   
     public static void main(String[] args) {

        Node head1= new Node(2);
        head1.next= new Node(4);
        head1.next.next= new Node(8);
        head1.next.next.next= new Node(10);

        Node head4= new Node(2);
        head4.next= new Node(4);
        head4.next.next= new Node(8);
      
        Node head2= new Node(1);
        head2.next= new Node(3);
        head2.next.next= new Node(3);
        head2.next.next.next= new Node(6);
        head2.next.next.next.next= new Node(11);
        head2.next.next.next.next.next= new Node(14);

        Node head3= new Node(1);
        head3.next= new Node(3);
        head3.next.next= new Node(3);
        head3.next.next.next= new Node(6);
      
        print(head1);
        print(head2);
        print(head3);
        print(head4);

        // creating the array of the linked list using the Node class
        Node[] heads= {head1,head2,head3, head4};

        Node result= mergeKsortedList(heads);
        System.out.println("after K merge sorted list :");
        print(result);
        
    }
    
}
