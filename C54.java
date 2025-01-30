//Max Area in Histogram  84. Largest Rectangle in Histogram

//https://leetcode.com/problems/largest-rectangle-in-histogram/
//https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
//lc 84
import java.util.*;
public class C54 {
    public static void maxAreaHistogram(int arr[]) {

        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
      int maxArea=0;

        // stack creation to store the array values
        Stack<Integer> s = new Stack<Integer>();

        // for next smaller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //  next smaller left
        s=new Stack<Integer>();
        for(int i =0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
             s.pop();
            }

            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }

            s.push(i);
        }


    for(int i=0 ; i<arr.length; i++){
        int height= arr[i];
        int width= nsr[i]-nsl[i]-1;

        int currArea= height* width;
        maxArea=Math.max(maxArea,currArea); 
    }
    System.out.println("The Maximum Rectangular Area in Histogram :" + maxArea);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };

        maxAreaHistogram(arr);
    }
}
