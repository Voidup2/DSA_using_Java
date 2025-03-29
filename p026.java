//Leetcode question -> Length of Last word
public class p026 {
    public static int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        int size = a.length-1;
        int result = a[size].length();
        return result; 
    }
    public static void main(String[] args) {
        String a = "Utsav Prakash  ";
        int result = lengthOfLastWord(a);
        System.out.println(result);
    }
}
