package DSAPractice;

public class StrongNumber {
    public static int getFactorail(int n) {
        int fact = 1;
        for (int i = 1; i <=n; ++i) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            sum += getFactorail(digit);
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int a = 145;
        if (isStrong(a))
            System.out.println("stromng ");
        else
            System.out.println("not strong");
    }
}
