//  search in sorted array 
//  top and righ approach
public class B7 {
    public static boolean  SearchInSortedMatrix(int matrix[][], int key ){
        int row = matrix.length -1;
        int col = 0;
        int count =0;

        while( row>=0 && col<matrix.length-1){
         if(matrix[row][col]== key){
            System.out.println(key + " :found at index (" + row+ "," +col+ ")");
          
            
            return true;
         }else if(matrix[row][col]>key){
            row--;
         }else{
            col++;
         }
        
        }
        System.out.println(count);
        System.out.println("Elements not  found ");
        return false;

    }


    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;

        boolean bool = SearchInSortedMatrix(matrix, key);
        System.out.println(bool);
    }

}
