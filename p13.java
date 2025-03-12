public class p13 {
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int m = s + (e-s)/2;
        while(s<=e){
        int nm = s + (e-s)/2;
        m=nm;
        if(arr[m] < arr[m+1]){
            s = m+1;
        }
        else if(arr[m] < arr[m-1]){
            e = m-1;
        }
        else{
            return m;
        }
    }
        return m;
    }
    public static void main(String[] args) {
        int[] arr = {18,29,38,59,98,100,99,98,90};
        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }
}
