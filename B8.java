import java.util.*;
public class B8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char arr[] ={'a', 'b','c','d'};
        // creation of string in java
        String  str = "abcd";
        String str1= new String("abcd");

        // string are immutable wwhch means old string remains unchanged 

         

        // taking input and output

        //  next line will be printed 
        System.out.println("enter  second name :");
        String name1 =sc.nextLine();
        System.out.println(name1);

        // after this next line is not printed 
       System.out.println("enter first name :");
        String name = sc.next();
        System.out.println(name);


        String FullName= "Gitesh kumar ";

        // finding length of String
        System.out.println(FullName.length());
        // finding index of the character
        System.out.println(FullName.charAt(8));
        // printing the string
        System.out.println(FullName.trim());
        //finding the substring from a to b in a string 
    System.out.println(FullName.substring(2,5 ));
    // finnding the  substrinng from  a to end of tthe string 
    System.out.println(FullName.substring(4));
    // joining two string together using concat() function
    System.out.println(FullName.concat(  "Yadav"));


    }
    
}
