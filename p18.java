//Insertion sort-> the sorting procedure is started from the starting index in which the 2nd index is checked with the first index if smaller
// than first index then the values are swapped if not break the loop
import java.util.*;
public class p18 {
    public static void insertionSort(int[] arr){
         for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
         }
    }
    public static void main(String[] args) {
        int[] arr = {-9,4,21,-9,3,-89};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
