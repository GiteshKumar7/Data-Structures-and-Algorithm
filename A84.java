// finnding the subarray , count of the subrray, 
//sum of the ellememnt in suarray and their min and max;
// brtue  force approach is used here

import java.util.*;

public class A84 {

    public static void printSubarray(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int ts = 0;
        for (int i = 0; i < arr.length; i++) {   
          int s=i;
            int currentsum = 0;
            for (int j = i; j < arr.length; j++) {
                int e = j;
                // calculating the sum of subarray 
                 currentsum += arr[e];

                for (int k = s; k <= e; k++) { // just for printing the values 
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println(" | sum " + currentsum);

            if(currentsum>max){
                max=currentsum;
            }else{
                min=currentsum;
            }

            
            }
        }
        System.out.println("the total subarray :" + ts);
        System.out.println("the maximum subarray :" +max);
        System.out.println("the minimum subarray :" + min);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of n :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }

     System.out.println("the original array :" +Arrays.toString(arr));

        printSubarray(arr);
        System.out.println("the original array :" +Arrays.toString(arr));

    }

}
