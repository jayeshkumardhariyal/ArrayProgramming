package TwoPointer;

public class SecondSmallest {
    public static int[] secondSmallest(int []a){
        long min=a[0];
        long secondMin =Long.MAX_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                secondMin =min;
                min=a[i];
            } else if (a[i]< secondMin && a[i]!=min) {
                secondMin =a[i];
            }
        }
        int smin=(int)secondMin;
        int fmin=(int )min;
        return new int[]{smin,fmin};
    }
    public static void main(String[] args) {
        int []a={80,80,43,50,38,63,58,80};
        int []min= (secondSmallest(a));
        for (int nums:min){
            System.out.println(nums);
        }

    }
}
