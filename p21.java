//Leetcode question -> Find All Numbers Disappeared in an Array
import java.util.*;
public class p21 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                result.add(i+1);
            }
        }
        return result;
    }
    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int ci = arr[i] - 1;
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
        int[] arr = {3,2,1,5,6,5,4};
        List<Integer> result = new ArrayList<>();
        result = findDisappearedNumbers(arr);
        System.out.println(result);
    }
}
