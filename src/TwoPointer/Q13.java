package TwoPointer;

public class Q13 {
    public static void movezeroestostart(int []a){
        int n=a.length;
        int i=0;
        int j=0;
        while (j<n) {
            if (a[j]==0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int []a={0,1,1,0,0,1,0,0};
//    Move zeroes to starting
        movezeroestostart(a);
        for(int n:a){
            System.out.print(n+" ");

        }
    }
}
