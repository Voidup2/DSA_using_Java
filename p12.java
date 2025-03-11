//Geeks for geeks: Position of an element in a infinite sorted array 
public class p12 {
    public static int binarySearch(int[] arr, int t){
        int s=0;
        int e=s+1;
        while(t >= arr[e]){
            int ns = e+1;
            e = e + 2*(e-s+1);
            s = ns;
        }
        for(int i=s;i<e;i++){
            if(arr[i] == t){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,11,15,19,19,21,26,28,30,33,36,37,40,47,55,56,59,64,66,69,71};
        int tar = 37;
        int result = binarySearch(arr, tar);
        System.out.println(result);
    }
}
