package DSAPractice;

public class Numberpyramid {
    public static void printPattern(int n) {
        int psize = 1;
        int pspace = n - 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {

            // for printing spaces
            for (int j = 1; j <= pspace; j++) {
                System.out.print(" ");
            }
            int colmid = psize / 2 + 1;
            //for printing pattern
            for (int j = 1; j <= psize; j++) {
                if (j < colmid)
                    System.out.print(num--);
                else
                    System.out.print(num++);
            }
            pspace -= 1;
            psize += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
