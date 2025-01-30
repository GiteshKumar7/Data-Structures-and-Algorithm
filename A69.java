//creating and  inputting array data structure 
import java.util.*;
public class A69 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int marks[] = new int[11];

    System.out.println("the length of the array : "+ marks.length);// returning the length of the array 

        System.out.println("enter marks");
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("physics marks: " + marks[0]);
        System.out.println("chemistry marks :" + marks[1]);
        System.out.println("math marks :"+  marks[2]);
    
        marks[2]= marks[2]+2;

        
        System.out.println("math marks :"+  marks[2]);
    
        int percentage = (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("percentage :"+ percentage);



    }
    
}
