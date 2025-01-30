// print the number of 7's in 2D array 
public class B3 {
    public static int NumberTimes(int matrix[][]){
       int count =0;

       for(int i=0 ; i<matrix.length; i++){
        for(int j=0 ; j<matrix[0].length; j++){
       if(matrix[i][j]==7){
        count++;
          }
        }
       }
    System.out.println("the final count of 7's is " + count);
       return count ;

    }

    public static void main(String args[]){

    int matrix[][]={{4,7,8},
                    {8,8,7}};

          int m =     NumberTimes(matrix); 
          System.out.println(m);    

    }
    
}
