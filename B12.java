//  this happen due to interning concept in java 
public class B12 {
    public static void main(String args[]){
     String  s1= "tony";
     String s2 ="tony";// old tony from s1 stored 
     String s3 = new String("tony");// new tony is stored in DB


    //  //generel sysnatx 
    //  if(s1==s2){
    //     System.out.println("String are equal");
    //  }else{
    //     System.out.println("String are not equal");
    //  }
    
    //  //with new keyword comparison
    //  if(s1==s3){
    //     System.out.println("String are equal");
    //  }else{
    //     System.out.println("String are not equal");
    //  }


    // Equal function
     if(s1.equals(s3)){
        System.out.println("String are equal ");
     }else{
        System.out.println("string are not equal");
     }



    }
    
}
