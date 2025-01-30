// wap to find the lenght of the string using recursion
// helloworld = 10
public class B79 {

    public static int lengthOfString(String str){
       // base case
        if(str.equals("")){
            return 0;
        }

        return 1 + lengthOfString(str.substring(1));

    }

    public static void main(String[] args) {
        
         String str= "hello_world";
         int count =lengthOfString(str); // countinng of an array 
         System.out.println(count);
    }
    
}
