// Doubly linked list

public class C32 {

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

// add at the last
  public static void addLast(int data){
    Node newNode= new Node(data);
    size++;
    if(tail==null){
        head= tail= newNode;
        return;
    }
    tail.next=newNode;
    newNode.prev=tail;
        tail= newNode;
  }
    

  // remove at first
  public static int  removefirst(int data){
     if(head==null){
        System.out.println("dll iss empty");
         return Integer.MIN_VALUE;
      
     }
     int val = head.data;
     if( size==1){
        head= tail = null;
        return val;
     }else{
     head= head.next;
     head.prev= null;
    }
    size--;
    return val;
  }


  public static int  removeLast(int data){
    if( head==null){
        System.out.println("dll is empty");
        return Integer.MIN_VALUE;
    }
    int  value= tail.data;
    if(size == 1){
        head = tail= null;
        return value; 
    }else{
    tail = tail.prev;
    tail.next= null;
    }
    size--;
    return value;


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

    C32  dll = new C32();
    dll.addFisrt(3);
    dll.addFisrt(2);
    dll.addFisrt(1);
    dll.addLast(4);
    dll.addLast(5);
    
  
    prinntdll(head);
    System.out.println(dll.size);

    // removing fisrt value
     int value=  removefirst(1);
     System.out.println("the first value : " +value);

    prinntdll(head); 
    System.out.println(dll.size);


      int last= removeLast(5);
      System.out.println("the lat remove value :" +last);
    prinntdll(head); 
   
 }    
}
