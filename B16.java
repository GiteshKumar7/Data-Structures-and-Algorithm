// StringBuilder for memory efficiency
public class B16 {
    public static void main(String args[]){
     
        StringBuilder sb = new StringBuilder("");
          
        
        for(char ch = 'a' ;ch < 'z'; ch++){
            // append == add one and one again and again at the end
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.charAt(3));
   
        System.out.println(sb.getClass());


    }
    
}
