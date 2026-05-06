package ArrayBasicProgram;

public class SortedArray {
    public static boolean isSorted(int []a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            if (a[i]>a[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={2,7,7,8,9};
        if (isSorted(a))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");

    }
}
