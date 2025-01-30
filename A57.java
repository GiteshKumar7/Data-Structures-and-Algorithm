// function overloading using different data types 
public class A57 {

     public static int  sum(int a, int b){
        return a+b;
     }

     public static float sum(float a, float b){
        return a + b;
     }


    public static void main(String argd[]){

      System.out.println("the sum of two number "+ sum(22,3));
      System.out.println("the sum of two number "+ sum(22.2f,44.4f));
    }
    
}
