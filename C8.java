// Containner with most water
// two pointer approach ->0(n)
  // height =1 8 6 2 5 4 8 3 7 ( given)

import java.util.ArrayList;

public class C8 {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp = height.size()-1;
       
        // calculating the water area
        while(lp<rp){
        int ht= Math.min(height.get(lp), height.get(rp));
        int width =rp-lp;
        int CurrWater= width*ht;
        maxWater= Math.max(maxWater, CurrWater);

       // update the pointer or smaller line
       if(height.get(lp)<height.get(rp)){
        lp++;
       }else{
        rp--;
       }

        }

      return maxWater;
    }
   

    public static void main(String args[]){
    ArrayList<Integer> height =new ArrayList<>();
    // 1 8 6 2 5 4 8 3 7
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

   int m = storeWater(height);
  System.out.println("Container with most water :" + m);
    }
    
}
