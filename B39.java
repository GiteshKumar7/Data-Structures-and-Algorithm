// getter and setters


//creation of the class 
class pen {
   private   String color;
    private  int tipsize;


    // getters
    String getcolor(){
        return this.color;
     }

      // setters
    void setcolor(String newcolor){
        color = newcolor;
    }


  // getters
    int gettipsize(){
        return this.tipsize;
    }

   
    // setters
     void settipsize(int size) {
        tipsize = size;
    }

}


public class B39 {
    public static void main(String args[]) {

        pen p1 = new pen();// object ceation with the help of the contructor

      
        // get -> to get using the sout
        // set -.> without usig te sout
     p1.setcolor("yello");
     System.out.println(p1.getcolor());

     p1.settipsize(11);
     System.out.println(p1.gettipsize());


     
         




    }

}
