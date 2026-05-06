package ArrayHashing;

public class Q1 {
    public static void getFreq(int []a){
//        int max=a[0];
//        int min=a[0];
//        for (int n:a){
//            if(n>max)
//                max=n;
//            else if (n<min) {
//                min=n;
//            }
//        }
        int []freq=new int[101];
        for (int n:a){
            freq[n]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0){
                System.out.println(i+"is: "+freq[i]+"times");
            }
        }
    }
    public static void main(String[] args) {
        int []a={80,80,43,50,38,63,58,80};
        getFreq(a);
    }
}
