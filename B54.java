//static keyword

class student {
   
  static float percent(int math, int chem, int phy){ //static method
    return  (math+chem + phy )/3;
  }

    String name;
    int roll;

    static String schoolName;// static variables

    // getters
    String getName() {
        return this.name;
    }

    // setter
    void setname(String name) {
        this.name = name;
    }

}

public class B54 {
    static{
        System.out.println("hello static block");
    }
    public static void main(String[] args) {
         
        student s1 = new student();
        s1.schoolName = "kabfo";
        System.out.println(s1.schoolName);


        student s2 = new student();
        System.out.println(s2.schoolName);

        student s3 = new student();
         s3.schoolName = "ramess";
        System.out.println(s3.schoolName);
        
        

       
      System.out.println(s3.percent(99,44,88));
    }
}
