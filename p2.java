//Q. Searching chars in a given String
public class p2 {
    public static void main(String[] args) {
        String up = "Utsav Prakash";
        char ch = 't';
        System.out.println(searchChar(up,ch));

        
    }
    static boolean searchChar(String str,char ch){ 
        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
               return true;
            }
        }
return false;
    }
}
