package TwoPointer;

public class RotateArrayByOnePosition {
    public static void revArray(int []a,int start,int end){
//        int start=0;
//        int end=a.length-1;
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70};
        int start=0;
        int end=a.length-1;
        revArray(a,start,end);
        revArray(a,start+1,end);
        for (int n:a){
            System.out.print(n+" ");
        }
    }
}
