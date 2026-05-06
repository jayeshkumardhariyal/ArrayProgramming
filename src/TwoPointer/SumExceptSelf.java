package TwoPointer;

import java.util.Scanner;

public class SumExceptSelf {
    public static void sumExceptSelf (int []a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        for (int i=0;i<a.length;i++){
            a[i]=sum-a[i];
        }
        for (int nums:a){
            System.out.print(nums+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<=a.length-1;i++){
            System.out.print("Enter value "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        sumExceptSelf(a);

    }
}
