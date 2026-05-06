package ArrayBasicProgram;

import java.util.Scanner;

public class PrimeNumberintoArray {
    public static boolean getPrime(int n){
        if (n<2)
            return false;
        for(int i=2;i*i<=n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n number of prime number you want to print: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
       for (int i=2;count<n;i++){
           if (getPrime(i)) {
               a[count]=i;
               count++;
           }
       }

        System.out.println("first "+n+" prime numbers are: ");
       for (int nums:a){
           System.out.print(nums+" ");
       }


    }
}
