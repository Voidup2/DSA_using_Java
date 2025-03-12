//Leetcode Question: Find peak element
public class p14 {
    public static int findPeakElement(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m] > arr[m+1]){
                e = m;
            }
            else{
                s = m+1;
            }
        }
        return s;
    }   
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int result = findPeakElement(arr);
        System.out.println(result);
    }
}
