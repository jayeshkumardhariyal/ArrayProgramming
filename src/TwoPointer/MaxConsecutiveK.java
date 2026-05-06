package TwoPointer;

public class MaxConsecutiveK{
    public static int getCountofk(int a[],int k){
        int n=a.length;
        int tempcount=0;
        int max=0;
        for (int nums:a){
            if(nums==k){
                tempcount++;
            }if(nums!=k){
                if(tempcount>max){
                    max=tempcount;
                }
                tempcount=0;
            }
        }
        if(tempcount>max)
            max=tempcount;
        return max;
    }
    public static void main(String[] args) {
        int []a={6,1,1,1,7,7,1,7,7,7,1,1,};
        int max=getCountofk(a,7);
        System.out.println("Maximum number of ones in the array is: "+max);

    }
}
