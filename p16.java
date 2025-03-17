//Bubble sorting Question-> bubble sorting is a stable sorting algorithm in this the order of the original array is maintained

import java.util.Arrays;

public class p16 {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
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
