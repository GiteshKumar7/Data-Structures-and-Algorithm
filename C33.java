// Reverse of the doublly linked list;

public class C33 {

    //classical implementaion of the doubly linked list
   public  static class Node{
       int data;
       Node next;
       Node prev;
       public Node(int data){
         this.data= data;
         this.next= null;
         this.prev= null;
   }
}

public static Node head;
public static Node tail;
public static int size;

// add  at the  first
public static void addFisrt(int data){
    Node newNode= new Node(data);
      size++;
    if(head==null){
      head= tail= newNode;
      return;
    }
    newNode.next= head;
    head.prev= newNode;
    head= newNode;
   
}


// reverse of the doubly linnked list
   public static Node reverse(Node head){
     Node curr= head;
     Node prev= null;
     while(curr!=null){
        Node Next= curr. next;
        curr.next= prev;
        curr.prev= Next;
         prev= curr;
         curr= Next;
     }
     return  prev;
   }

// print the dll;
public static void prinntdll(Node head){
    Node temp = head;
    while( temp !=null){
        System.out.print(temp.data + "<->");
        temp = temp.next;
    }
      System.out.println("null");
}


 public static void main(String aeegs[]){

    C33  dll = new C33();
    dll.addFisrt(3);
    dll.addFisrt(2);
    dll.addFisrt(1);
    dll.addFisrt(0);

   
  
    prinntdll(head);
    System.out.println(dll.size);
  
    Node reversed= reverse(head);
    prinntdll(reversed);
   
  

 }    
}
 
