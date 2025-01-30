// types of the constructors 

class student {
    String name;
    int roll;

    // Default constructors
    student() {
        System.out.println("hello Boys");
    }

    // parameterizzed constructors
    student(String name) {
        this.name = name;
    }

    // parameterizzed constructors
    student(int roll) {
        this.roll = roll;
    }

}

public class B41 {
    public static void main(String args[]) {

        student s1 = new student();
        student s2 = new student("Gitesh");
        student s3 = new student(11);

        System.out.println(s2.name);
        System.out.println(s3.roll);

    }

}
