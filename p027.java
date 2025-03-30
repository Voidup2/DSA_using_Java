//Leetcode question -> Power of three
public class p027 {
    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3==0){
           return isPowerOfThree(n/3);
        }
        return false;
    }  
    public static void main(String[] args) {
        int n = 9;
        boolean x = isPowerOfThree(n);
        System.out.println(x);
    }
}
