package ArrayBasicProgram;

public class MaxAndMin {
    public static void minAndMax(int []a){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }if (a[i]<min) {
                min=a[i];
            }

        }
        System.out.println("Maximum element of the array is : "+max);
        System.out.println("Minimum element of the array is: "+min);

    }
    public static void main(String[] args) {
        int a[]={5,3,4,2,6,10};
        minAndMax(a);

    }
}
