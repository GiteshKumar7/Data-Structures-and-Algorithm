// average of three numbers usuing three inputs 
import java.util.*;

   class ravi {
     public int average(int a , int b , int c){
        return (a+ b+c)/ 3;

     }


    public void show(){
      System.out.println("show");
    }

   }


public class A8 {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);

   

  ravi obj = new ravi();
    int m = obj.average(2, 4, 6);
    System.out.println(m);

       obj.show();
   
//    int a  = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc. nextInt();
  



//     int average = (a + b+ c)/ 3;
//     System.out.println(average);


    }
    
}
