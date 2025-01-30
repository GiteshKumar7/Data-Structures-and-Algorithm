//copy constructor

class student {
    String name;
    int roll;
    String password;
    int[] marks;


      // constructor of s1 object
      student() {
        marks=new int[3];
        System.out.println("hello Boys");
    }


    //  shallow copy constructor
    // student(student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks= s1.marks;// // only taking the reference and change reflect

    // }


    // deep copy constructor ->change does not reflect
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
  
        for( int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }
    }

     


}

public class B42 {
    public static void main(String[] args) {

        student s1 = new student();//
        s1.name= "giteh";
        s1.roll=99;
        s1.password="abcdef";

        s1.marks[0]=11;
        s1.marks[1]=1;
        s1.marks[2]=31;
       
      

        student s2 = new student(s1); // copy object
        s2.password="xyz";

        s1.marks[2]=99;
       

        for( int i=0;i<3; i++){
            System.out.println(s2.marks[i]);
        }



    }

}
