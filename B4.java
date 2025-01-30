//sum of 2nd row in 2D array 
public class B4 {

public static int sumof2Row(int matrix[][]){
   
    int sum =0; 
    // for(int i=1; i<matrix.length; i++){
     for(int i=0; i<matrix[2].length; i++){
        sum+=matrix[0][i];
       }
    return sum;
    }


  public static void main(String args[]){
   int matrix[][]={{4,7,8},
                    {8,8,7},
                    {5,9,6}};

          int m =     sumof2Row(matrix); 
          System.out.println(m);  
    }
    
}
