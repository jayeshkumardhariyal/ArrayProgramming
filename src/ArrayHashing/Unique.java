package ArrayHashing;

public class Unique {
    public static boolean isUniques(int[] a) {
        int n = a.length;
        int[] freq = new int[101];
        for (int nums : a) {
            freq[nums]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {10, 12, 18, 6, 15, 17, 11};
        System.out.println(isUniques(a));
    }
}