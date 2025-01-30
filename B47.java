//compile time polymorphism
// Method overloading 

class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class B47 {
    public static void main(String[] args) {

        calculator cal = new calculator();

        System.out.println(cal.add(1, 2));
        System.out.println(cal.add(2.2f, (float) 3.3));
        System.out.println(cal.add(11, 33, 22));

    }

}
