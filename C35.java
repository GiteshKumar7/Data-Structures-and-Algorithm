//leetcode 160 Intersection of two linked lists

import java.util.HashMap;

public class C35 {
    // node creation
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    // method for the interection of  the two lined list
    public static Node intersectUsingMap(Node head1, Node head2){
     
        if( head1==null  || head2==null){
            return null;
        }

        // create a Hashmap to store the node of the first linnked list
       HashMap<Node, Integer> map= new HashMap<>();

        Node temp = head1;
        while( temp !=null){
            map.put(temp, 1);
            temp = temp.next;
        }

        // traverse the second linked list and check if the node is present in the map
         temp = head2;
        while(temp!=null){
          if( map.containsKey(temp)){
          return temp;
         }
         temp  = temp.next;
        }
        return null; // No inntersection
      
    }


    public static void print(Node head){
     Node temp = head;
     while(temp!=null){
        System.out.print(temp.data +"->");
        temp= temp.next;
     }
     System.out.println();
    }
    

    
    public static void main(String args[]){

   Node head1= new Node(3);
   head1.next=new Node(1);
   head1.next.next= new Node(4);
   head1.next.next.next= new Node (6);
   head1.next.next.next.next= new Node (2);
   head1.next.next.next.next= null;


   Node head2= new Node(1);
   head2.next=new Node(2);
   head2.next.next=new Node(8);
   head2.next.next.next= head1.next.next;

  System.out.println("Linked list1");
   print(head1);
   System.out.println("Linked list2");
   print(head2);

   
  Node  result= intersectUsingMap(head1, head2);

  if(result!=null){
    System.out.println("Intersection point is " + result.data);
  }else{
    System.out.println("No intersection");
  }


    }
}
