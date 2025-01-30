// Heirrarchial level of the inheritance


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



public class B45 {
    public static void main(String args[]){

   mammals m = new mammals();
   m.eat();
   m.walk();
   m.sleep();



    }
    
}
