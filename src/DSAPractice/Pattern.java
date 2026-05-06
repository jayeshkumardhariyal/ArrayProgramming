package DSAPractice;

public class Pattern {
    public static void printPattern(int n){

        int psize=1;
        int totalrow=2*n-1;
        int num=1;
        for (int i=1;i<=totalrow;i++){
            for (int j=1;j<=psize;j++){
                System.out.print(num);
            }
            if (i<n){
                psize+=1;
                num+=1;
            }else{
                psize-=1;
                num-=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);

    }
}
