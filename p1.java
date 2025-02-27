// Q. This is linear search program find the element in the array and return its index, if element not present return -1
import java.util.Scanner;
public class p1{
    static int linearSearch(int[] arr,int n){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
            return i;
            }
         }
         return -1;
    }
  

    public static void main(String[] args) {

        System.out.print("Enter the number you want to search: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {23,45,69,32,56,7,63,13};
        System.out.println(linearSearch(arr,n));
    }
}