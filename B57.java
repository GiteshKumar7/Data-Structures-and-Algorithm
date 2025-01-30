//constrcutor channing between  the parent class and child class
// using super keyword
// one constructor in child class call another constrcutor of the parent class

//parent class
class person {
    String name;
    int age;
    
    // parent class constructor
      person(String  name, int age){
        this.name=name;
        this.age= age;
      
        System.out.println("person contructor is called");
    }
}

// child class
class student extends person{
    //child class constructor
    String course;

    student(String name, int age, String course){
          super(name,age);
          this.course=course;
          System.out.println();
          System.out.println("the student class constructor is called");
           
    }

    public void  display(){
     System.out.println("name :"+ name +"," + "age :"+ age + ","+ "course :" + course );

    }

}

public class B57 {
    public static void main(String[] args) {

       student s = new student("John", 11, "Mathematics");// call parent and chid class
      s.display();

    }

}
