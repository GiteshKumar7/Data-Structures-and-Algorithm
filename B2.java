// diagonal sum

public class B2 {

     public static  int diagonalSum(int matrix[][]){
        int sum=0;

        //TC=O(O^n2)
        // for(int i=0 ; i<matrix.length; i++){ // for rows
        //     for(int j=0 ; j<matrix[0].length; j++){ // for columns 
        //     if(i==j){
        //         sum +=matrix[i][j];
        //     }
        //     else if(i+j==matrix.length-1){
        //         sum+=matrix[i][j];
        //     }

        //     }
        // }
        //  return sum;
    
         
        //TC=O(N)
        for(int i=0; i<matrix.length; i++){
          //primary diagonal 
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!=matrix.length-1-i){// for no overlapping
            sum+=matrix[i][matrix.length-i-1];
        }
    }
        return sum;
    

    }




    public static void main(String args[]){

    int matrix[][]= {{1, 2,3},
                     {4,5,6},
                     {7,8,9}};

   
     int m=  diagonalSum(matrix);
    System.out.println("Sum of diagonal elements is: "+m);
    }
    
}
