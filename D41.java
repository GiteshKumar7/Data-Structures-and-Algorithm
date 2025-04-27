//object creation in priority queues

//priority queue on the basis of the rank

import java.util.*;

public class D41 {
    public static class Student implements Comparable<Student> { // function overriding
        int rank;
        String name;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
             return this.rank - s2.rank;// ascending
            //return  s2.rank -this.rank ;// descending order
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.poll();
        }

    }
}
