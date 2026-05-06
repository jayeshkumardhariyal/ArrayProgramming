package TwoPointer;

public class Insertion {
    public static int [] insertElement(int []a,int pos,int val){
        int n=a.length;

        if (pos<0 && pos>=n){
            System.out.println("======Index out of Bound=======");
        }
        int res[]=new int[n+1];
        res[pos]=val;
        for (int i=0;i<res.length;i++){
            if(i<pos){
                res[i]=a[i];
            } else if (i>pos) {
                res[i]=a[i-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,};
        System.out.println("Before insertion: ");
        for (int n:a){
            System.out.print(n+" ");
        }
        int [] res=insertElement(a,3,35);
        System.out.println("\nAfter Insertion: ");
        for (int n:res){
            System.out.print(n+" ");
        }


    }
}
