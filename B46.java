// Hybrid  inheritance

class Animal{
    String color;
      
     void eat(){
        System.out.println("eating");
     }

     void sleep(){
        System.out.println("sleeping");
     }
 }

 class  fish extends Animal{
       int gills;

       void swim(){
     System.out.println("swimming");
       }
 }


 class bird extends Animal{
     int wings;

     void fly(){
        System.out.println("flying");
     }

 }


 class mammals extends Animal{
   int legs;

   void walk(){
    System.out.println("walking");
   }

 }



 class human extends mammals{
    int height;
       void think(){
        System.out.println("thinking");
       }

       void analyze(){
        System.out.println("analyzing");
       }

 }




public class B46 {
    public static void main(String[] args) {
        

      human h = new human();
      
      // from human
      h.height= 11;
      System.out.println(h.height);

       // from mammals
       h.walk();
       h.legs=11;
       System.out.println(h.legs);

      // from animal
      h.eat();;
      h.sleep();
      h.color= "Yellow";
      System.out.println(h.color);

      System.out.println("hello");
      System.out.println();

// object of bird
      bird b= new bird();

      // for bird
      b.fly();
      b.wings= 2;
      System.out.println(b.wings);


      // animal
      b.eat();
      b.sleep();
      b.color= "green";
      System.out.println(b.color);



    }
    
}
