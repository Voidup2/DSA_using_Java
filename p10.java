//Leetcode Question: Search a 2D array
public class p10 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        for(int i=0;i<r;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean result = searchMatrix(a,31);
        System.out.println(result);
    }
}
