package ArraySorting;

/*
! Array Sorting
1) Count Sort
 */

public class InsertionSort {
    public static void insertionSort(int [] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int pivot=a[i];
            int j=i-1;
            while(j>=0 && pivot<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=pivot;
        }
    }
    public static void main(String[] args) {
        int[] a = {25,18,20,15,10};
        int[] b = {30, 25, 20, 10};
        int[] c={10,12,15,20,25,40,35,50,60,70,80,90,100,120};
        int[] d={12,18,10,5};
        int [] e={8,10,12,15,18,16,20,30};
        System.out.println("Before sorting: ");
        for(int n:e){
            System.out.print(n+" ");
        }
        insertionSort(e);
        System.out.println("\nAfter Sorting: ");
        for(int n:e){
            System.out.print(n+" ");
        }

    }
}
