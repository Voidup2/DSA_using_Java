// Q. Find elements inside a 2d array
import java.util.Arrays;
import java.util.Scanner;
public class p5 {
    static int[] findElement(int[][] arr,int num){
        int a[] = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == num){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();
        int[][] arr = {{1,3,648,8,7},{70,96,58},{56,58,78,69,-21}};
        int[] result =  findElement(arr, num);
        System.out.println(Arrays.toString(result));
    }
}
