//Find the max and min element in the 2d array
public class p4 {
    static int findMin(int[][] arr){
        int min = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
    static int findMax(int[][] arr){
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,648,8,7},{70,96,58},{56,58,78,69,-21}};
        System.out.println("The smallest element of 2d array: "+findMin(arr));
        System.out.println("The largest element of 2d array: "+findMax(arr));
    }
}
