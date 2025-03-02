//Linear Search
// Leetcode questions: Richest Customer Wealth
public class p7 {
    static int maximumWealth(int[][] acc) {
        int[] a = new int[acc.length];
        for(int i=0;i<acc.length;i++){
            int amt = 0;
            for(int j=0;j<acc[i].length;j++){
                 amt = amt + acc[i][j];
            }
            a[i] = amt;
        }
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{2,8,7},{7,1,3},{1,9,5}};
        int result = maximumWealth(a);
        System.out.println(result);
    }
}
