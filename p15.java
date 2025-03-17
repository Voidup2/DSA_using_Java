//Question: search element in sorted matrix
//in this problem first row of the matrix's last element is taken as the mid to compare with the target since the matrix is sorted so the last element is 
//used to check if the target is greater then last element if yes then the value of row is incremented and if no then the value of row remain same and the 
//value of column is decremented (sr-> starting row and er-> starting column)
import java.util.*; 
public class p15 {
    public static int[] binSearch(int[][] arr, int tar){
        int sr = 0;
        int er = arr.length-1;
        int c = arr[sr].length-1;
        while(sr<=er){
            if(arr[sr][c] == tar){
                return new int[]{sr,c};
            }
            else if(arr[sr][c] > tar){
                c--;
            }
            else{
                sr++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] result = binSearch(arr, 15);
        System.out.println(Arrays.toString(result));
    }
}
