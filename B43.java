//Inheritance 

// parent class or super class or  base class
class Animal{
   String color;

   void eat(){
    System.out.println("eats");
   }

   void sleep(){
    System.out.println("sleeps");
   }

   void breathe(){
    System.out.println("breathe");
   }

}


// Derived class or child class
class fish extends Animal{
    int fins;

    int getfin(){// getter
        return this.fins;// setter
    }

    void setfins(int fins){
          this.fins= fins;
    }

    void swim(){
        System.out.println("swimming");
    }


}


public class B43 {
  public static void main(String[] args) {
    
//     fish f = new fish();
    
//    f.setfins(11);
//     System.out.println(f.getfin());


//     f.swim();
//     f.eat();
//     f.sleep();
//     f.breathe();

   Animal a = new Animal();
  a.eat();
  a.breathe();
  a.sleep();
 
  }
    
}
