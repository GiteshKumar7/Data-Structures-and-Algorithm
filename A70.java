import java.util.*;
public class A70 {

   public static  void update(int marks[] ,int unchange){
      unchange  =99;
      for(int i =0 ; i<marks.length; i++){
        marks[i] = marks[i]+1;
          }
}
     public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      //   int marks[]= {22, 33, 11,331};
      int marks[] = new int[4];
      System.out.println("Enter value at index 0 :");
      marks[0]=sc.nextInt();
      System.out.println("Enter value at index 1:");
        marks[1]=sc.nextInt();
      System.out.println("Enter value at index 2:");
      marks[2]=sc.nextInt();

      int unchange =88;
      
        update(marks, unchange);
        System.out.println(" dd :"+ unchange);// call by value 

        // for updating the mark 
       for(int i=0;i<marks.length; i++){// calll by reference
     System.out.println(marks[i]+ " ");
   }
        System.out.println(" ");
    }
    
}




