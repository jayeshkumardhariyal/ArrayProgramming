package DSAPractice;

public class FloydTriangle {
    public static void printPattern (int n){
        int psize=1;
        int num=1;
        for (int i=1;i<=n;i++){
            //for printing pattern
            for (int j=1;j<=psize;j++){
                System.out.print(num++ +" " );
            }
            System.out.println();
            psize+=1;
        }
    }
    public static void main(String[] args) {
        printPattern(4);
    }
}
