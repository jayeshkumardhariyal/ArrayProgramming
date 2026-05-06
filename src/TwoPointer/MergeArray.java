package TwoPointer;

public class MergeArray {
    public static void mergeArray(int []a,int []b){
        int []res=new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            res[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            res[i+a.length]=b[i];
        }
        for (int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={6,7,8};
        mergeArray(a,b);
    }
}
