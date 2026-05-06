package TwoPointer;

public class Q2 {
    public static int getCountofOnes(int a[]){
        int n=a.length;
        int tempcount=0;
        int max=0;
        for (int nums:a){
            if(nums==1){
                tempcount++;
            }if(nums!=1){
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
        int []a={6,1,1,1,7,7,1,1,1,1,};
        int max=getCountofOnes(a);
        System.out.println("Maximum number of ones in the array is: "+max);

    }
}
