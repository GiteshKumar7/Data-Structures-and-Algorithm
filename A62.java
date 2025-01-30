public class A62 {

public static void decTobin(int num){
    int bin= 0;
    int pow=0;
    while(num>0){
        int lastdigit= num%2;
        num = num/2;
        bin = bin + lastdigit * ( int )Math.pow(10, pow);
        pow++;
    }
    
    System.out.println(bin);
}


    public static void main(String args[]){
      decTobin(15);

    }
    
}
