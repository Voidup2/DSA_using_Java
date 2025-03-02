//Binary Search
//we are assuming that the array is sorted
public class p8 {
    public static int binSearch(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(tar < arr[mid]){
                end = mid - 1;
            }
            else if(tar > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-9,-3,-1,0,2,4,5,6,8,9,45,77,87,89,101};
        int result = binSearch(arr, 45);
        System.out.println(result);
    }
}
