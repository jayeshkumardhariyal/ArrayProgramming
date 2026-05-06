package DSAPractice;

public class RightAlignedTriangle {
    public static void printPattern (int n){
        int psize=1;
        int pspace=n-1;
        for (int i=1;i<=n;i++){
            int num=1;
            // for spaces
            for(int j=1;j<=pspace;j++){
                System.out.print("  ");
            }
            //for printing pattern
            for (int j=1;j<=psize;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
            psize+=1;
            pspace-=1;
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
