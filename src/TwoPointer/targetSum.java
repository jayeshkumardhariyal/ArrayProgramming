package TwoPointer;

public class targetSum {
    public static int[] targetsum(int []a,int target){
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==target)
                return new int[]{i,j};
            else if (sum<target) {
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []a={1,2,4,6,10};
        int []res=targetsum(a,8);
        for (int n:res){
            System.out.print(n+" ");
        }


    }
}
