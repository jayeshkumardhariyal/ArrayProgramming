package ArrayBasicProgram;

public class SumOdd {
    public static void sumOdd(int []a){

        int sum=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==1)
                sum+=a[i];
        }
        System.out.println("Sum of all odd elements are : "+sum);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        sumOdd(a);

    }
}
