package DSAPractice;

public class SecondLargest {
    public static int SecondMax(int a[]) {
        int tempmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                tempmax = max;
                max = a[i];
            }
            if (a[i] > tempmax && a[i] != max) {
                tempmax = a[i];
            }
        }
        return tempmax;
    }

    public static void main(String[] args) {
        int a[] = {11, 10, 20, 4, 20, 5};
        int smax=SecondMax(a);
        System.out.println(smax);
    }
}
