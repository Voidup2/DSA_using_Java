import java.util.*;
public class p030 {
    public static int fibonacci(double n){
        double result = (1/Math.sqrt(5))*Math.pow((1 + Math.sqrt(5)) / 2, n) - (1/Math.sqrt(5))*Math.pow((1 -  Math.sqrt(5)) / 2, n);
        int r = (int)result;
        return r;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }
}
