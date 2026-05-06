package DSAPractice;

public class MoveZeores {
    public static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void moveZeorestoEnd(int []a){
        int i=0;
        int j=0;
        for (int n:a){
            if (n!=0){
                swap(a,i,j);
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int []a={0,1,0,3,12};
        moveZeorestoEnd(a);
        for (int n:a){
            System.out.print(n+" ");
        }
    }
}
