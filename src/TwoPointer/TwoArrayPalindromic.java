package TwoPointer;

public class TwoArrayPalindromic {
    public static boolean isPalindrome(int []a,int []b){
        int start=0;
        int end=b.length-1;
        if (a.length!=b.length)
            return false;
        while (start<end){
            if(a[start]!=b[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,80,70,25};
        int b[]={25,70,80,40,30,20,10};
        System.out.println(isPalindrome(a,b));
    }
}
