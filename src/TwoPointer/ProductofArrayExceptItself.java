package TwoPointer;

import java.util.Scanner;

public class ProductofArrayExceptItself{
    public static int [] productofArrayExceptItself(int []a){
        int product=1;
        int count=0;
        int zeroindex=-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
                zeroindex=i;
            }else
                product*=a[i];
        }
        int [] res=new int[a.length];
        if (count>1) {
            return res;
        } else if  (count==1) {
            res[zeroindex]=product;
        }else {
            for (int i = 0; i < a.length; i++) {
                res[i] = product / a[i];
            }
        }
        return res;
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
       int []res= productofArrayExceptItself(a);
        for (int nums: res){
            System.out.print(nums+" ");
        }

    }
}
