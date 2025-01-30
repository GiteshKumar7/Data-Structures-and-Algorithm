// Single and multi  level inheritance;

class Animal {
    int age;

    void eat() {
        System.out.println("eaating");
    }

    void sleep() {
        System.out.println("sleeping ");
    }

    void breathe() {
        System.out.println("brething");
    }

}

class Mammals extends Animal {
    int legs;

    void walk() {
        System.out.println("walking");
    }

    void run() {
        System.out.println("running");
    }
}

class Dog extends Mammals {

    String color;

    void bark() {
        System.out.println("barking");
    }

}

public class B44 {
    public static void main(String[] args) {


  Dog d= new Dog();

  // for dogs
  d.bark();
  d.color="Yellow";
  System.out.println(d.color);


  // for mammals
  d.walk();
  d.run();
  d.legs=2;
  System.out.println(d.legs);


  // for animals
  d.age = 9;
  System.out.println(d.age);
  d.eat();
  d.breathe();
  d.sleep();


    }

}
