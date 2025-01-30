// super keyword -> accessing parent class using child class


class animal {
  String color;
          animal(){// default constructor
        System.out.println("animal constructor is called");
    }
    
}

class  horse extends   animal{
      horse(){// deafault constructor
       // super();
      //  color="red";

      super.color="yellow";
        System.out.println("horse constructor is called");
      }

}
public class B55 {
    public static void main(String[] args) {
        
    horse h = new horse();


    System.out.println(h.color);

    }
    
}
