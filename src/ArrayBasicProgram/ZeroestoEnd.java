package ArrayBasicProgram;

public class ZeroestoEnd {
    public static void zeroestoEnd(int []a){
        int n=a.length;
        int insertpos=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[insertpos]=a[i];
                insertpos++;
            }
        }
        while(insertpos<n){
            a[insertpos]=0;
            insertpos++;
        }
    }
    public static void main(String[] args) {
        int []a={0,1,0,3,0,112};
        for(int n:a){
            System.out.print (n+" ");
        }
        System.out.println("\nAfter ");
        zeroestoEnd(a);
        for(int n:a){
            System.out.print (n+" ");
        }
    }
}
