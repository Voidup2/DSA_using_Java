//Leetcode question: Maximum Gap
import java.util.*;
public class p11 {
    public static int maximumGap(int[] nums){
        int n = nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for(int i=0,j=1;i<n-1 && j<n;i++,j++){
            int dif = nums[j] - nums[i];
            if(max < dif){
                max = dif;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,9,1};
        int result = maximumGap(arr);
        System.out.println(result);
    }
}
