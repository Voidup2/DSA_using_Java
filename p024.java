//Leetcode question -> Set mismatch
import java.util.Arrays;
public class p024 {
    public static int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        return arr;
    }
    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
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
    }
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }
}
