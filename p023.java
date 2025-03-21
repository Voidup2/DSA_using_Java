//Leetcode Question -> Find all the duplicates in an array
import java.util.ArrayList;
import java.util.List;
public class p023 {
    public static List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                result.add(nums[i]);
            }
        }
        return result;
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
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }
}
