// Binary strings  without consecutives 0's

public class B76 {

    public static void printBinString(int n ,int lastplace , String str){
     // base case
     if(n==0){
        System.out.println(str);
        return ;
     }
     // kaam 
     // reducing to n-1 and last palce 0 then add to the str
    printBinString(n-1, 0, str+"0"); 

    if(lastplace==0){
    // reducing to n-1 and last palce 0 and place 1 at last then add to the str
    printBinString(n-1, 1, str+"1"); 
    }

    }

public static void main(String[] args) {
printBinString(3, 0, "");

  }
}
