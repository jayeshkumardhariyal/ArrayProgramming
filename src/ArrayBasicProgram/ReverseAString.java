package ArrayBasicProgram;

public class ReverseAString {
    public static String reverseString(String s){
        int n=s.length();
        char[] a=s.toCharArray();

        int start=0;
        int end=a.length-1;
        while (start<end){
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return new String(a);
    }
    public static void main(String[] args) {
        String a="Hello";
        System.out.println(reverseString(a));
    }
}
