package TwoPointer;

public class ZIgZagMerge {
    public static int [] zigZagMerge(int []a,int []b){
        int []res=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length &&j<b.length){
            res[k++]=a[i++];
            res[k++]=b[j++];
        }
        while (i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length){
            res[k++]=b[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};

        int []res=zigZagMerge(a,b);
        for (int nums:res){
            System.out.print(nums+" ");
        }

    }
}
