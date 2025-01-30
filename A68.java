public class A68 {
    public static void main(String args[]){


  int n=5 ;
  // // code for rectangle
//   for(int i =1; i<=n; i++){
//     for(int j=1 ; j<=(n-1);j++){
//         System.out.print("*");
//     }
//     System.out.println();
//   }


// code for hollow rectangle 
 
  for(int i =1; i<=n; i++){
    for(int j=1 ; j<=n;j++){
        if(i==1 || i==n || j==1|| j==n ){
        System.out.print("*");
   }else{
    System.out.print(" ");
   }
 }
    System.out.println();
  }



    }
    
}
