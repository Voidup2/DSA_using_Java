//Leetcode question -> 1342. count the number of steps to reduce a number to zero
public class p039 {
    static int numberOfSteps(int num){
        int c = 0;
        return helper(num, c);
    }
    static int helper(int num,int c){
        if(num == 0){
            return c;
        }
        if(num % 2 == 0){
            num = num / 2;
           return helper(num,++c);
        }    
        num = num  - 1;
        return helper(num,++c);
    }
    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println(result);
    }
}
