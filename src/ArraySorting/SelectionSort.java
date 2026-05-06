package ArraySorting;

/*
! Array Sorting
1) Count Sort
 */

public class SelectionSort {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            int minvalue = a[i];
            for (int j = i + 1; j < n; j++) {
                if (a[j] < minvalue) {
                    minindex = j;
                    minvalue = a[j];
                }
                a[minindex] = a[i];
                a[i] = minvalue;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 25, 18, 20, 15, 10 };
        int[] b = { 30, 25, 20, 10 };
        int[] c = { 10, 12, 15, 20, 25, 40, 35, 50, 60, 70, 80, 90, 100, 120 };
        int[] d = { 12, 18, 10, 5 };
        System.out.println("Before sorting: ");
        for (int n : d) {
            System.out.print(n + " ");
        }
        selectionSort(d);
        System.out.println("\nAfter Sorting: ");
        for (int n : d) {
            System.out.print(n + " ");
        }

    }
}
