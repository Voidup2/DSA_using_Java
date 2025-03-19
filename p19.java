//Cyclic sort-> this sorting algo is applied only when the elements in the array are from 1-n continuous, this algo works by checking the value and its index place 
//for example if 4 is at an index place 0 it will check if the value at index 0 is equal to index value+1 or not if not the value will be swapped with the value of index value-1
import java.util.Arrays;
public class p19 {
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
