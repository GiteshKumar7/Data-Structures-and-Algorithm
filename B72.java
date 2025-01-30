// tiling problem

public class B72 {

   public static int tilingProblem(int n){
    //base case 
    if(n==0 || n==1){
        return 1;
    }

    // // kaam 
    // // vertical chioce 
    // int fnm1=tilingProblem(n-1);

    // // Horizontal choice 
    // int fnm2=  tilingProblem(n-2);

    // int totalways=fnm1+ fnm2;
    // return totalways;

    // onle code for it  choose any one
    return  tilingProblem(n-1)+tilingProblem(n-2);


   }

public static void main(String args[]){
     System.out.println(2);    

    }
    
}
 