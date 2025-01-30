
// if else 
import java.util.*;
public class A23 {
    public static void main(String a[]){
   Scanner sc = new Scanner (System.in);
   
    System.out.print("Enter age :");
    int age = sc.nextInt();

    if(age >= 19){
        if((age>19) &&(age <44)){
            System.out.println("vote, Drive ");
             }
          else if(age >44 && (age <60)){
            System.out.println("old aged man");
        }
        else {
            System.out.println("too old aged man ");
        }
    }

    else  
    {
        System.out.println("Not adult ");
    }

   
   

    }

}
