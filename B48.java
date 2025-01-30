//Runtime polymorphism
// method overriding

// parent class 
 class animal{
    void eat(){
        System.out.println("eating ");
    }
 }

//  child class
 class dog extends animal{
    void eat(){
        System.out.println("dog is eating ");
    }
 }

public class B48 {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        
        
    }
    
}
