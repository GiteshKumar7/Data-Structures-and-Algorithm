// Queue implementation using the Linked linked list
// isfull condtion is not here in linked list
//

// all operaion -> 0(n)
public class C62 {
  public static class Node{
    int data;
    Node next;
     Node(int data){
     this.data= data;
     this.next= null;
       }
  }

  public static class Queue{
     static Node head =null;
     static Node tail=null;

   // isempty condition case 
     public static boolean isEmpty(){
     return head==null  && tail== null;
     }

       // enqueue operation
     public static void add(int data){
      Node newNode= new Node(data);
      // if there is no any node in the queue
      if(head==null && tail==null){
        head=newNode;
        tail=newNode;
      }else{
        tail.next=newNode;
         tail=newNode;
      }
    }

    // dequeue operation
    public static int remove(){
        if(head==null && tail==null){// isempty  condition
            System.out.println("queue is empty");
            return -1;
        }

            int front= head.data;
            // single element
            if(head==tail){
             head=tail=null;
            }else{
            head=head.next;
            }

        return front;
    }

    public static int peek(){
        if(head==null && tail==null){
            return -1;
        }

        int front= head.data;
        return front;
    }

  }
    
    public static void main(String[] args) {
        
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
