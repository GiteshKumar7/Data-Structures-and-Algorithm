// Object Oriented programming (OOPS)

// creation of the class 
class pen {
    String color;
    int tipsize;

    // creation of the the method
    public void colorchange(String newcolor) {
        color = newcolor;
    }

    // creation of the the method
    public void tipsizeChange(int size) {
        tipsize = size;
    }

}

// Class having name BankAccount
class BankAccount {
    public String username;
    protected int balance;
    private String password;

    public void setPasswordS(String pwd) {
        password = pwd;
    }
 
}

public class B38 {
    public static void main(String args[]) {

        pen p1 = new pen();// object ceation with the help of the contructor

        // usinng directly the class variable
        p1.color = "yellow";
        System.out.println(p1.color);
        p1.tipsize = 11;
        System.out.println(p1.tipsize);

        // using the variable with the help of the method
        p1.colorchange("Red");
        System.out.println(p1.color);
        p1.tipsizeChange(11);
        System.out.println(p1.tipsize);




        BankAccount b1= new BankAccount();// creation of the object

        //username is public 
        b1.username="rahul";
        System.out.println(b1.username);
        // balance is protected
        b1.balance=11;
         System.out.println(b1.balance);
      // password is private -> no one can access
       
      b1.setPasswordS("gitesh");
     
         




    }

}
