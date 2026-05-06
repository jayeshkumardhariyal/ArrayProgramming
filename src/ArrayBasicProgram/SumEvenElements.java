package ArrayBasicProgram;

public class SumEvenElements {
    public static void sumEven(int []a){

        int sum=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0)
                sum+=a[i];
        }
        System.out.println("Sum of all even elements are : "+sum);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        sumEven(a);

    }
}
