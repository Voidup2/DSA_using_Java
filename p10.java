//Leetcode Question: Search a 2D array
public class p10 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length-1;
        while(r < matrix.length && c>=0){
            if(target < matrix[r][c]){
                c--;
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else if(target == matrix[r][c]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean result = searchMatrix(a,60);
        System.out.println(result);
    }
}
