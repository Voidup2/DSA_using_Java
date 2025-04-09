public class p032 {
    public static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        return binSearch(num) != -1;
    }
    public static int binSearch(int n){
        int s = 1;
        int e = n;
        while(s<=e){
            int mid = s+(e-s)/2;
            long sq = (long)mid*mid;
            if(sq==n){
                return mid;
            }
            else if(sq<n){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num = 104976;
        System.out.println(isPerfectSquare(num));
    }
}
