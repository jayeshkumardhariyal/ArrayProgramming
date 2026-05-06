package TwoPointer;

public class SecondBiggestElement {
    public static int secondBiggest(int []a){
        long max=a[0];
        long secondMax=Long.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                secondMax=max;
                max=a[i];
            } else if (a[i]>secondMax && a[i]!=max) {
                secondMax=a[i];
            }
        }
        return (int) secondMax;
    }
    public static void main(String[] args) {
        int []a={1,1,2,2,3,3};
        int secondMax=secondBiggest(a);
        System.out.println("Second maximum: "+secondMax);
    }
}
