package DSAPractice;

public class InvertedNumberTriangle {
    public static void printPattern (int n){
        int psize=n;
        for (int i=1;i<=n;i++){
            int num=1;
            //for printing pattern
            for (int j=1;j<=psize;j++){
                System.out.print(num++ );
            }
            System.out.println();
            psize-=1;
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
