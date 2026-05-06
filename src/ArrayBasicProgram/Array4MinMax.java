package ArrayBasicProgram;

import java.util.Scanner;

public class Array4MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a=new int [n];
        //for taking value from user in an array
        for (int i = 0; i <=n-1; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        // for printing the value
        for(int nums:a){
            System.out.print(nums+" ");
        }
        //Find min max
        int min=a[0];
        int max=a[0];
        for (int i = 0; i <=n-1; i++) {
            if (a[i]>max)
                max=a[i];
            else
                min=a[i];
        }
        System.out.println("\nMaximum elements of array is: "+max);
        System.out.println("Minimum element of array is: "+min);
    }

}
