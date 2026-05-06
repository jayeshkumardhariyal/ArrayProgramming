package TwoPointer;

public class RotateArraykTimes {
    public static void rev(int []a,int i,int j){
        while (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int k=6;
        rev(a,0,a.length-1);
        rev(a,0,k-1);
        rev(a,k,a.length-1);


        for (int n:a){
            System.out.print(n+" ");
        }

    }
}
