// finding max;
public class B15 {
    public static void main(String args[]) {

        // Array of strings
        String fruits[] = { "apple", "bananana", "mango" };
        

        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) > 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }

}
