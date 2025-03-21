//Bubble sorting Question-> bubble sorting is a stable sorting algorithm in this the order of the original array is maintained
import java.util.Arrays;
public class p16 {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){//here arr.length-i is done because with each iteration in a bubble sort algorithm
                if(arr[j]<arr[j-1]){        //the largest element is shifted to the end of the list so no need to check it every time
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,7,1,4,11,2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
     }
}
