
// print the reverse of the arraylist
import java.util.ArrayList;

public class C1 {
  public static void main(String args[]) {
  
    ArrayList<Integer> list= new ArrayList<>();
     list.add(14);
     list.add(12);
     list.add(13);

     list.add(3, 222);

   //  reverse -> 0(n) linear time
  for(int i = list.size()-1 ; i>=0 ; i--){
    System.out.print(list.get(i) + " ");
  }
  System.out.println();

  
  }   
}
