import java.util.*;
public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//   int a =10;
//   double  m=a;


// double d = 2222.2;
// int   a = (int) d;
// System.out.println(a);



//   double d =10.9;
//   float  a =d;

//   int a =(int) sc.nextFloat();

// float f = sc.nextInt();// type conversion or implicit conversion 

//    float f = 23.333f;
//    int a = (int ) f;
//    System.out.println(a);  // type  casting / excplicit // lossssy conversion  

// char ch = 'a';
// char  ch1 = 'b';
// System.out.println(ch);

// int m  = ch;
// int  n = ch1;

// System.out.println(m); // a - 97
// System.out.println(n); // b -98
//   System.out.println(n-m);// char minus char first  conversted into int  
//   System.out.println(n+ m);// char minus char first  conversted into int  

//     byte b = 11;
//     short r = 12;
//     char p =  'a';
//     byte  m = (byte) (b + r +p);
//   System.out.println(m);


// // int a =  111;
//  float f = 11.4f;
//  double d = 222.22;
//  long s = 3333;
   
// //  int  g  =(int) (f+d + s);
//  double  g1 = f+ d +s;
//  System.out.println(g1); 

// byte b = 10;
//  b = (byte) (b* 2); // asumme b is int in the expressions 

//  System.out.println(b);


/// type promotion in this expressions 
   byte b = 2;
    byte c = (byte) ( b * 2); // b act as int not byte in expression 
    System.out.println(c);     



    } 
}
