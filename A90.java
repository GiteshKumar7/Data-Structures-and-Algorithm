import java.util.*;

public class A90 {
public static int trappedRainedWater(int height[]){

     int n =height.length;

     int leftMax[]= new int[n];
     leftMax[0]=height[0];
// calculate left max boundary
      for(int i=1; i<n;i++){
        leftMax[i]=Math.max(leftMax[i-1],height[i]);
    }

// calculate righ max boundary
     int rightMax[] = new int[n];
    rightMax[n-1]=height[n-1];
    for(int i=n-2; i>=0;i--){
        rightMax[i]=Math.max(rightMax[i+1],height[i]);
    }


    int trapedwater =0;
   
    for(int i=0; i<n; i++){
        // water  level =min(leftmax, rightmax)
        int waterlevel = Math.min(leftMax[i],rightMax[i]);
        // trapped water= water level -height[];
        trapedwater +=waterlevel-height[i];
    }


    return trapedwater;
}

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        int trappedwater = trappedRainedWater(height);
        System.out.println("the trapped water among height elevation :" +trappedwater);
    }

}
