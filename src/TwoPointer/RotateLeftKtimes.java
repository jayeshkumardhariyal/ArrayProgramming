package TwoPointer;

public class RotateLeftKtimes {
    public static void reverse(int []a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int k=2;
        reverse(a,0,a.length-1);
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
