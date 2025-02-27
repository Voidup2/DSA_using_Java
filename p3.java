//Finding the minimum and maximum value element in the array
public class p3 {
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {12,45,345,67,7,84,3,24,67};
        System.out.println("The smallest element in the array = "+findMin(arr));
        System.out.println("The largest element in the array = "+findMax(arr));
    }
}
