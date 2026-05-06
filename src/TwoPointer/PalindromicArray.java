package TwoPointer;

public class PalindromicArray {
    public static boolean isPalindromeArray(int []a){
        int n=a.length;
        int start=0;
        int end=n-1;
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
        int a[]={10,20,30,40,30,20,10};
        System.out.println(isPalindromeArray(a));
        int a2[]={10,20,30,40,30,50,10};
        System.out.println(isPalindromeArray(a2));

    }
}
