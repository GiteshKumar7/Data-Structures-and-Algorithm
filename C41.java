//Stack implementation  using the  arraylist

import java.util.ArrayList;

public class C41 {

    public static class stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty() method to check the sttack is empty or not
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push() operation
        public static void push(int data) {
            list.add(data);
        }

        // pop() operation
        public static int pop() {
            // If the stack is empty then return -1
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);// last is n-1
            list.remove(list.size() - 1);
            return top;
        }

        // peek() operation
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
