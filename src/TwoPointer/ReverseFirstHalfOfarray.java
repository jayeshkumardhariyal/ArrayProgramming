package TwoPointer;

public class ReverseFirstHalfOfarray {
    public static void swap(int []a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void revFirstHalf(int []a){
        int n=a.length;
        int start=0;
        int end=n/2;
        while (start<end){
            swap(a,start,end);
            start++;
            end--;
        }
        int start2=n/2+1;
        int end2=n-1;
        while (start2<end2){
           swap(a,start2,end2);
            start2++;
            end2--;
        }
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70};
        revFirstHalf(a);
        for(int n:a){
            System.out.print(n+" ");
        }

    }
}
