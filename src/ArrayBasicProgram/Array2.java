package ArrayBasicProgram;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a= new int[n];
        for (int i=0;i<=n-1;i++){
            System.out.print("Enter value"+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        for (int nums:a){
            System.out.print(nums+" ");
        }
    }
}
