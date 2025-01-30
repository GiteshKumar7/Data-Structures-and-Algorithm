// counting total occurances of elemsts index in an array
// using   method , recursion

public class B68 {

    public static void occurance(int arr[], int key, int i) {
        // base case of reaching to last elements
        if (i == arr.length ) { // to get last comparison
            return;
        }

        if( arr[i]==key){
         System.out.println(i);
        }

        occurance(arr, key,i+1);
    }

    public static void main(String[] args) {
  int arr[]={8,3,6,9,5,10,2,5,3};
  int key =3;
  occurance(arr,key,0);
    }

}
