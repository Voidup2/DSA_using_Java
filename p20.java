//Leetcode question(Cycle sort) -> find the missing number
public class p20 {
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] != i && arr[i]<arr.length){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
    public static int missingNumber(int[] nums) {
        cycleSort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i] == i){
                i++;
            }
            else{
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(arr);
        System.out.println(result);
    }
}
