public class p028 {
    public static boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        else if(n%4 ==0){
            n = n/4;
            return isPowerOfFour(n);
        }
        return false;
    }
    public static void main(String[] args) {
        int a = 5;
        boolean result = isPowerOfFour(a);
        System.out.println(result);
    }
}
