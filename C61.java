// circularQueue using the arrays
// all in  O(1)
// enqueue and dequeue

import java.util.*;

public class C61 {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front= -1;
        }

        // is empty condition
        public static boolean isEmpty() {
            return rear == -1;
        }

        // is full condition
        public static boolean isFull(){
        return (rear+1)%size==front;
        }

        // add enque function
        public static void Enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }

           rear= (rear+1)%size;
           arr[rear]=data;
        }

        // remove Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is  empty");
                return -1;
            }

            int result = arr[front];// storing
            if(front==rear){// f and q  are  in same index
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
             
            return arr[front];
             
        }
    }

    public static void main(String[] args) {

        // Queue<Integer> queue = new ArrayDeque<Integer>();
         Queue q= new Queue(4);
         q.Enqueue(1);
        q.Enqueue(2);
         q.Enqueue(3);
         q.Enqueue(4);

         System.out.println(q.remove());
         q.Enqueue(9);
         System.out.println(q.remove());
         q.Enqueue(7);

         while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
         }
    }
}
