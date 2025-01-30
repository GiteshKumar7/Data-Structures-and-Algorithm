import java.util.*;

public class A24 {
    public static void main(String[] args) {
          

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the income amount ");
       float  income = sc.nextFloat();
         
       int  tax=0;
       if(income <  500){
         tax =0;
         System.out.println(tax);

       }else if(income<1000 && income>500){
           tax = (int) (income * (.05));
           System.out.println("the tax amount1 :"+ tax);
     }else {
           tax= (int )(income * .2f);
           System.out.println("tax amount2 :" + tax);
}
    }
    
}
