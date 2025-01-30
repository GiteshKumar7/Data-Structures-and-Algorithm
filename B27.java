// finding the odd and even using bitwise operator
//
public class B27 {
    public static void oddeven(int n){
       
        int bitmask=1;
        // using bitwise xor operation 
         if((n ^ bitmask )>n){
            System.out.println(n +" is is a even number");
         }else{
            System.out.println(n +" is a odd number");
         }
    }

    public static void main(String args[]){
      oddeven(3);
      oddeven(4);
      oddeven(3);
      oddeven(8);
    }
    
}
