package ArrayBasicProgram;

import java.util.Scanner;

public class Storefibonacciintoarray {
    public static void getFibonacci(int n){
        if (n==0){
            System.out.print("0");
            return;
        } else if (n==1) {
            System.out.print("0 "+ "1");
            return;
        } else if (n==2) {
            System.out.print("0 "+"1 "+"1 ");
            return;
        }
        System.out.print("0 "+"1"+" ");
        int n1=0,n2=1,n3=0;
        int i=1;
        while (i<n-1){
            n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number till than you want to print the print the fibonacci series: ");
        int n=sc.nextInt();
        getFibonacci(n);


    }
}
