// stack implementation using the linked list

public class C42 {
      // this is for the linekd list
      public static class Node{
         int data;
         Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
           }
        }


        // for the stack implementation
    public static class stack{
            
          static Node head= null;// head= top

            // isEmpty() funtction
            public static boolean isEmpty(){
                return head==null;
            }
            
            // push() funtion
        public static void push(int data){
            Node newNode= new Node(data);

             newNode.next=head;
            head=newNode;
            }

        // pop() method    
        public static int pop(){
                if(isEmpty()){
                    return -1;
                }
             
                    int top= head.data;
                    head= head.next;
                    return top;
            }
       
            // peek function()
      public static int peek(){
                if(isEmpty()){
                    return -1;
                }

                return head.data;
            }
        }

    public static void main(String args[]){

   stack s= new stack();
   // pushh elements onto the stack
   s.push(1);
   s.push(2);
   s.push(3);


   // print and pop elements until the stack is empty
   while(!s.isEmpty()){
    System.out.println(s.peek());// print the top
    s.pop();   // remove the top
   }

    }  
}
