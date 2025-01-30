// constrcutor priority 
// animal-> dog-> rummydog 


abstract class animal{
    // constrcutor 
    animal(){
  System.out.println("animal constructor is called");
   }

}

class dog extends animal{
    // constrcutor
    dog(){
        System.out.println("dog constrcutor is called");
    }
}


class rummydog extends dog{
    // constructor
    rummydog(){
        System.out.println("rummydog constrcutor is called");
    }
}


public class B51 {
 public static void main(String[] args) {
    
    rummydog r = new rummydog();
    

 }
    
}
