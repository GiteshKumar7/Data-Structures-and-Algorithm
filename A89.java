//kadane algorithm 
//for all anegative and positives 
public class A89 {
    public static int kadanes(int arr[]){

   int ms =arr[0];
   int cs=arr[0];

   for(int i=1 ; i<arr.length; i++){
     cs =Math.max(cs, cs+arr[i]);
   }
     if(cs>ms){
       ms=cs;
      }
   return ms;
 }
    
    public static void main(String args[]){
   int arr[]= {-1,-2,-3,-4};
     int arr1[]={-2,-3,4,-1,-2,1,5,-3};

    int msss= kadanes(arr);
    int msss1= kadanes(arr1);
    System.out.println( "the max sun arrays sum :" +msss);
    System.out.println( "the max sun arrays sum :" +msss1);
   
}
}
