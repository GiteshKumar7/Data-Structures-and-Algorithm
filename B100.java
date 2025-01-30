// ArrayLists 
import java.util.*;
import java.util.ArrayList;
public class B100 {
    public static void main(String args[]){
      // collection Framework
        ArrayList<Integer> list = new ArrayList<>();
       ArrayList<String> nlist= new ArrayList<>();
       ArrayList<Float> mlist= new ArrayList<>();
       ArrayList<Boolean> olist= new ArrayList<>();

    

 /// add element
list.add(11);
list.add(12);
list.add(13);
list.add(14);
list.add(15);

list.add(2, 99);
System.out.println(list); // 0(1)

  // get operation ->0(n)
  int element =list.get(2);
  System.out.println(element);

// remove operation ->0(n)
  int rm = list.remove(1);
  System.out.println(list);

// set element at index ->0(n)
int set = list.set(2, 33);
System.out.println(list);

// anoother ways of adding inn the set


// conatins element at  index -> 0(n)
boolean s = list.contains(13);
System.out.println(s);
System.out.println(list.contains(3));


 // size operation
System.out.println(list.size());



// printing the arraylist
for( int i =0 ; i<list.size(); i++){
System.out.print(list.get(i)+ " ");
}
System.out.println();


// this is for the string
nlist.add("Samlma");
nlist.add("Gite");
System.out.println(nlist);// 0(1)

       
    }
    
}
