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
            int ci = arr[i] - 1;//Initializing the correct index after each iteration is good because it solves the problem of getting in infinite loop with duplicate elements,
            if(arr[i] != arr[ci]){//since while checking the condition previously if(arr[i] != i+1) the duplicate element at wrong index is swapped with same element at the correct positon 
                int temp = arr[ci];// so it will go in infinite loop to avoid that we must use correct index which is initialized at the start of each iteration and checks the value at i and at correct index 
                arr[ci] = arr[i];//for that element if both values are same the check condition if(arr[i] != arr[ci]) will not run and the else condition will work so the i is incremented and the program proceeds
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
