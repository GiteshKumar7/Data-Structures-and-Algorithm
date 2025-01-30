// Abstract class

abstract class animal{

    void eat(){
        System.out.println("Animal is eating");
    }

    abstract void walk();// this function should be in all abstract class and non absract class

}


class horse extends animal{

     void walk(){
        System.out.println("walks on four legs");
     }

}

class chicken extends animal{
    
    void walk(){
        System.out.println("walk on two legs");
    }
}

public class B50 {

   public static void main(String[] var0) {
   
   horse h = new horse();// object of horse
    h.walk();
   h.eat();


   chicken c = new chicken();// object of chicken
   c.walk();
   c.eat();

   // cannot create object of abstract class
   //animal  a = new animal();
 
 

   }
}
