// constructors 

 class student{
    int roll;
    String name;

    student(){
        System.out.println("hello sir");
    }

    // parameterized onstructor
    student(String name, int roll ){
        this.name = name;
        this.roll=roll;
      System.out.println("constructors is called");
    }
 }


public class B40 {
    public static void main(String args[]){


        // Non-parameterized (Default) constructor
        student s2 = new student();

           // parameterized constructor
        student s1 = new student("Gitesh",12);// parametreized constructor
        System.out.println(s1.name);
        System.out.println(s1.roll);

    }
    
}
