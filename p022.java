//Leetcode Question -> Find the duplicate number
public class p022 {
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
    public static int findDuplicate(int[] nums) {
        cycleSort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                return nums[i];
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,4};
        int result = findDuplicate(arr);
        System.out.println(result);
    }
}
