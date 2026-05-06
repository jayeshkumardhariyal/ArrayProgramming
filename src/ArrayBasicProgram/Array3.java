package ArrayBasicProgram;

import java.util.Scanner;

public class Array3 {
    public static void swap(int [] a,int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a= new int[n];
        for (int i=0;i<=n-1;i++){
            System.out.print("Enter value "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("Before swap: ");
        for (int nums:a){
            System.out.print(nums+" ");
        }
        swap(a,1,4);
        System.out.println("\nAfter swap: ");
        for (int nums:a){
            System.out.print((nums+" "));
        }
    }
}
