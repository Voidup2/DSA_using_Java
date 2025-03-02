//Linear Search
//Leetcode question: Find Numbers with Even Number of Digits
public class p6 {
    static int findNumbers(int[] nums) {
        int u=0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            while(nums[i] > 0){
               nums[i] = nums[i]/10;
               count++;
            }
            if(count%2==0){
                u++;
            }
        }
        return u;
    }
    public static void main(String[] args) {
        int[] nums = {122,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
