package TwoPointer;

public class Deletion {
    public static int [] deleteElement(int []a, int pos){
        int n=a.length;
        if (pos<0 && pos>=n){
            System.out.println("======Index out of Bound=======");
        }
        int res[]=new int[n-1];
        for (int i=0;i<res.length;i++){
            if(i<pos){
                res[i]=a[i];
            }else{
                res[i]=a[i+1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,};
        System.out.println("Before deletion: ");
        for (int n:a){
            System.out.print(n+" ");
        }
        int [] res= deleteElement(a,2);
        System.out.println("\nAfter Deletion: ");
        for (int n:res){
            System.out.print(n+" ");
        }


    }
}
