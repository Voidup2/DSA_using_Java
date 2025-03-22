//Leetcode question -> First missing positive number
import java.util.Arrays;
public class p025 {
    public static int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] > 0 && arr[i]<arr.length){
            int ci = arr[i]-1;
            if(arr[i] != arr[ci]){
                int temp = arr[ci];
                arr[ci] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        else{
            i++;
        }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int result = firstMissingPositive(arr);
        System.out.println(result);
    }
}
