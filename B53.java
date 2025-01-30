// implementing the multiple inheritances using the interfaces 



// innterfaces
interface herbi {
  // method declarations only without body
    public void plant();
}

// interfaces
interface carbi {
  // method declarations only without body
    public void meat();
}

// implementing class using interfaces both the
class bear implements herbi, carbi {
    public void plant() {
        System.out.println("eating plant ");
    }

    public void meat() {
        System.out.println("eating meat");
    }
}

public class B53 {
    public static void main(String[] args) {

        bear b = new bear();
        b.plant();
        b.meat();

    }

}
