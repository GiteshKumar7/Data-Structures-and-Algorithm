// reverese a given number  using a formula 
// rev = (rev * 10 ) + lastDigits 
public class A34 {
    public static void main(String args[]){

        int n =10899;
        System.out.println("initial n :" + n);
        int rev =0;
         int lastdigits=0;

         while (n>0){
            lastdigits= n%10;
            rev = (rev * 10 ) + lastdigits;
            
            n =n/10;
            System.out.println(n);
         }
         System.out.println("rev  : "+ rev);

    }
    
}
