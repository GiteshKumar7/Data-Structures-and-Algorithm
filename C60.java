// implementation of the queue using the Arrays
//https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
import java.util.*;

public class C60 {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // is empty condition
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add enque function
        public static void Enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
           
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is  empty");
                return -1;
            }

            int front = arr[0];// storing
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            //int front = arr[0];
            return arr[0];
        }

    }

    public static void main(String[] args) {

        // Queue<Integer> queue = new ArrayDeque<Integer>();
         Queue q= new Queue(5);
         q.Enqueue(1);
         q.Enqueue(2);
         q.Enqueue(3);
         q.Enqueue(4);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }

    }
}
