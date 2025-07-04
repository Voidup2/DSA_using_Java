//Leetcode Question -> 54. Spiral Matrix
import java.util.ArrayList;
import java.util.List;
public class p060 {
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int rl = matrix.length;
        int cl = matrix[0].length;
        int x=0;
        int y=0;
        int dx=1;
        int dy=0;
        for(int i=0;i<rl*cl;i++){
            list.add(matrix[y][x]);
            matrix[y][x] = -101;
            if(!(0<=x+dx && x+dx<cl && 0<=y+dy && y+dy<rl)||matrix[y+dy][x+dx] == -101){
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x = x+dx;
            y = y+dy;
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> list = spiralOrder(mat);
        System.out.println(list);
    }
}
