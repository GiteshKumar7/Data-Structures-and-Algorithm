// logical operatos  && , || , !

public class A14 {

    public static void main(String[] args) {

        int a = 10;
        int b = 22;
        int c = 2;
        int d=0;
       

        System.out.println("var1 " + a);

        System.out.println("var1 " + b);

        System.out.println("var1 " + c);

       if((a>c) && (a>b) ){
          System.out.println(a);
       }
       else if((b>a)&& (b>c)){
  System.out.println(b);
       }
       else 
       System.out.println(c);
 


System.out.println(" ");// not operators 
       if(!(a>b)){
         d = a+b;
       }


    }

}
