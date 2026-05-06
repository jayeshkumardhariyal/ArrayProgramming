package ArraySorting;

/*
! Array Sorting
1) Count Sort
 */

public class BubblesortImproved {
    public static void bubbleSort(int [] a){
        int n=a.length;
// outer loops is for how many steps we are going to perform i.e n-1;
        for(int i=0;i<n-1;i++){
// for traversing in array and reducing the comparison steps after place in the maximums in their places
            int count=0;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count+=1;
                }
            }
            if(count==0)
                break;
        }
    }


    public static void main(String[] args) {
        int[] a = {25,18,20,15,10};
        int[] b = {30, 25, 20, 10};
        int[] c={10,12,15,20,25,40,35,50,60,70,80,90,100,120};
        System.out.println("Before sorting: ");
        for(int n:c){
            System.out.print(n+" ");
        }
        bubbleSort(c);
        System.out.println("\nAfter Sorting: ");
        for(int n:c){
            System.out.print(n+" ");
        }

    }
}
