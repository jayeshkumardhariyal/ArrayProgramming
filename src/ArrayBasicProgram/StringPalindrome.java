package ArrayBasicProgram;

public class StringPalindrome {
    public static boolean isPlaindrome(String s){
        char[] a=s.toCharArray();
        int start=0;
        int end=a.length-1;
        while (start<end){
            if(a[start]!=a[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="mada";
        if (isPlaindrome(s)){
            System.out.println("It  is palindrome string");
        }else{
            System.out.println("it is not a palindrome string");
        }

    }
}
