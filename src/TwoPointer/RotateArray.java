package TwoPointer;

import java.util.Scanner;

public class RotateArray {
    public static void reverse(int []a,int start,int end){
        int n=a.length-1;
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int []a,int k){
        k=k%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a=new int[n];

        for (int i = 0; i <=n-1 ; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("Before reverse: ");
        for (int nums:a){
            System.out.print(nums+" ");
        }
        rotate(a,3);
        System.out.println("\nAfter reverse: ");
        for (int nums:a){
            System.out.print(nums+" ");
        }
    }
}

