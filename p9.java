//Binary Search
//Leetcode Question Hard: Median of two sorted arrays
import java.util.*;
public class p9 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = m+n;
        int[] arr = new int[l];
        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }
        for(int j=0,i=m;j<n && i<l;j++,i++){
            arr[i] = nums2[j];
        }
        Arrays.sort(arr);
        if(l%2==0){
          double median = (arr[(l-1)/2] + arr[((l-1)/2)+1])/2.0;
          return median;
        }
        return arr[(l-1)/2];
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        double result = findMedianSortedArrays(arr1,arr2);
        System.out.println(result);
    }
}
