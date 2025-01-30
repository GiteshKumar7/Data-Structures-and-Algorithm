// queue using two stacks

import java.util.*;

public class C65 {
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

    //0(1) check whether the stack is empty or not(means queue)
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // takes 0(N)
        public static void push(int data) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // takes 0(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        // takes 0(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(); // Create a new queue
        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
