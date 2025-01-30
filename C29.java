// java collections framework
// Linnked list

// use LinkedList class for cration and deletion and updation 

import java.util.LinkedList;

public class C29 {
    public static void main(String args[]){

    // store object of Integer, Float , Charater

    // creation of the linked list
    LinkedList<Integer> ll = new LinkedList<Integer>();

   // add 
   ll.add(1);
   ll.add(2);
   ll.add(3);
   ll.add(4);
   ll.add(5);
   ll.addFirst(0);
    ll.addLast(6);
    // 0->1->2->3->4->5->6


   // remove 
   System.out.println(ll);
  System.out.println(ll.getFirst());
  System.out.println(ll.getLast());
  System.out.println(ll.get(3));
  System.out.println(ll.getClass());


  ll.remove();
  ll.removeFirst();
  ll.removeLast();
  System.out.println(ll);
   

  }  
}
