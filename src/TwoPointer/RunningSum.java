package TwoPointer;

import java.util.Scanner;

public class RunningSum {
    public static void runningSum(int []a){

        for (int i=1;i<a.length;i++){
            a[i]+=a[i-1];
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
        runningSum(a);

    }
}
