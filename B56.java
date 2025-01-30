//constrcutor channing within the same class using this keyword
// one constructor call another constrcutor of the same class

//
class student {
    String name;
    int age;
    String course;


    // cconstrcutor 1: Default constructor
    student() {
        // calling constrcutor 3
        this("Unknown", 18, "unknowncourse");
        System.out.println("Default constrcutor called"); 
    }

    // constructorr 2 : Two parameter (name and age)
    student(String name, int age) {
        this(name, age, "unkown"); // call constructor 3
        System.out.println("cnstrcutr with name and age");
    }


    
    // constructor 3 : Three parameters (name , age, course)
    student(String name, int age, String course) {
        this.name = name;// taking name giving to constructor 1 and 2
        this.age = age;// tking age giving to constructor 1 and 2
        this.course = course; // taking course giving to constructor 1 and 2
        System.out.println("Constructor with name,age and course");
    }
    

    public void display() {
        System.out.println("name :" + name + "," + "age :" + age + "," + "course :" + course);

    }

}

public class B56{
    public static void main(String[] args) {

        student s1 = new student(); // call default constructor
        s1.display();

        System.out.println(); // call costructor 2
        student s2 = new student("ramesh", 11);
        s2.display();

        System.out.println(); // call constructor 3
        student s3 = new student("Ramesh", 11, "btech");
        s3.display();

    }

}
