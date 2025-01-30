// Binary strings  without consecutives 0's

    public class B75 {

        public static void printBinString(int n ,int lastplace , String str){
         // base case
         if(n==0){
            System.out.println(str);
            return ;
         }
         // kaam 
         
        printBinString(n-1, 1, str+"1");

        if(lastplace==1){
            printBinString(n-1, 0, str+"0");
        }

        }

    public static void main(String[] args) {
    printBinString(3, 0, "");
   
      }
}
