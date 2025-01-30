public class A45 {
    public static void main(String args[]) {

        int n = 5;

        // //print star pattern
        // for(int i =0 ; i<n ; i++){
        // for(int j=0; j<n;j++){
        // System.out.print(" * ");
        // }
        // System.out.println(" ");
        // }

        // // rectangele
        // for(int i =1; i <= n; i++){// rows
        // for(int j =1 ; j<=i; j++){//
        // System.out.print(" * ");
        // }
        // System.out.println(" ");
        // }

        // // print inverted star patttern
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i + 1); j++) {

        // System.out.print(" * ");
        // }
        // System.out.println(" ");
        // }

        // // half pyramid pattern
        // for(int i =1 ; i<=n; i++){
        // for(int j=1 ; j<=i; j++){
        // System.out.print( j +" ");
        // }
        // System.out.println(" ");
        // }

        // //print character pattren
        // char ch='A';
        // for(int i =1 ; i<=n; i++){
        // for(char j =1 ; j<=i; j++){
        // System.out.print( ch + " ");

        // }
        // System.out.println(" ");
        // }

        // // print hollow rectangle
        // int row = 4;
        // int col = 5;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= col; j++) {
        // if (i == 1 || i == row || j == 1 || j == col) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // inverted and rotated half pyramid
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // }

        // //inverted half pyramid with number pattern
        // for(int i=1; i<=n; i++){
        // for(int j=1 ; j<=(n-i+1); j++){
        // System.out.print(j + " ");
        // }
        // System.out.println(" ");
        // }

        // //inverted half pyramid with number pattern
        // char ch = 'A';
        // for(int i=1; i<=n; i++){
        // for(int j=1 ; j<=(n-i+1); j++){
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println(" ");
        // }

        // // floyd triangle
        // int number =1;
        // for(int i =1 ; i<=n ; i++){
        // for(int j = 1; j<=i; j++){
        // System.out.print(number+ " ");
        // number ++;
        // }
        // System.out.println(" ");
        // }

        // //0 in one columm and 1 and one rows
        // for(int i =1 ; i<=n; i++){
        // for(int j=1 ; j<=i; j++){
        // if( !(j%2==0)){
        // System.out.print(1+ " ");
        // }else {
        // System.out.print(0 +" ");
        // }
        // }
        // System.out.println();
        // }

        // // 0-1 triangle
        // for(int i =1; i<=n ; i++){

        // int SumStart= (i%2==0)? 0: 1;

        // for(int j=1 ; j<=i; j++){

        // System.out.print(SumStart + " ");
        // SumStart= 1-SumStart;//for toggle 0 into 1 and vice versa
        // }
        // System.out.println(" ");
        // }

        // Buterfly pattern
        int row = 8;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // reversing the above ;to get lower parts
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
