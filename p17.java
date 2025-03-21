//Selection Sort-> in this sorting algorithm the maximum element is found and its position is swapped with the last index of the array and so on for the next largest element 
import java.util.Arrays;
public class p17 {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int e = arr.length-i-1;
            int max = findMax(arr,e);
            int temp = arr[e];
            arr[e] = arr[max];
            arr[max] = temp;
        }
    }
    static int findMax(int[] arr,int e){
        int max = 0;
        for(int i=1;i<=e;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {2,3,41,-7,8,6,-86};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
