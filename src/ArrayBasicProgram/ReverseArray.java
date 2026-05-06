package ArrayBasicProgram;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int []a,int start,int end){
        int n=a.length-1;
        while (start<end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a=new int[n];

        for (int i = 0; i <=n-1 ; i++) {
            System.out.println("Enter value "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("Before reverse: ");
        for (int nums:a){
            System.out.print(nums+" ");
        }
        reverse(a,0,4);
        System.out.println("\nAfter reverse: ");
        for (int nums:a){
            System.out.print(nums+" ");
        }

    }
}
