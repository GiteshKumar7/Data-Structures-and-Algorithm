// add() and peek() in Max heap
// remove() in   Max heap

import java.util.*;

public class D43 {
    public static class heap {

        ArrayList<Integer> arr = new ArrayList<>();

        // addition in the heap
        public void add(int data) {
            // add at the last positions
            arr.add(data);

            int x = arr.size() - 1;// last index of the array list
            int par = (x - 1) / 2;

            while (arr.get(x) > arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

               // update the poinnter after use
               x= par;
               par=(x-1)/2;

            }
        }
 
        // first element in heap or tree data stucture
        public int peek() {
            return arr.get(0);
        }


     // heapify to fix the min heap
     public void heapify(int i){
        int left= 2*i+1;
        int right= 2*i+2;
        int maxidx= i;

        // found smaller in the left then update the mindidx
        if(left < arr.size() && arr.get(maxidx) < arr.get(left)){
            maxidx= left;
        }

        if(right <arr.size() && arr.get(maxidx) < arr.get(right)){
            maxidx= right;
        }

        if(maxidx != i){
            // swap
            int temp=arr.get(i);
            arr.set(i,arr.get(maxidx));
            arr.set(maxidx,temp);
        }
     }

     public int remove(){
        // store the root
        int data= arr.get(0);
        
        // step 1. swap 
        int temp= arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // step 2. delete the last node 
        arr. remove(arr.size()-1);

        // step 3. heapify the root 
        heapify(0);
       return data;
     }

     // checking the  heap is empty or not 
     public boolean isEmpty(){
        return  arr.size() == 0;
     }

    }

    public static void main(String[] args) {

    heap  pq  = new heap();
    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(5);

    while(!pq.isEmpty()){
    System.out.println("peek : " + pq.peek()); //  first max heap come and then remove it 
     pq.remove(); 
   }

    }
}
