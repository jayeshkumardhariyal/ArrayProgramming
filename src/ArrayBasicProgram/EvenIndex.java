package ArrayBasicProgram;

import java.util.Scanner;

public class EvenIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print("Enter value"+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <=arr.length-1; i++) {
           if (i%2==0){
               System.out.print(arr[i]+" ");
           }
        }


    }
}
