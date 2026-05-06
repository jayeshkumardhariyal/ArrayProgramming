package DSAPractice;

public class PalindromeTriangle {
    public static void printPattern (int n){

        for (int i=1;i<=n;i++){
            int num=1;
            int psize=2*i-1;
            //for printing pattern
            for (int j=1;j<=psize;j++){
                System.out.print(num+" ");
                if (j<i)
                    num++;
                else
                    num--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(4);
    }
}
