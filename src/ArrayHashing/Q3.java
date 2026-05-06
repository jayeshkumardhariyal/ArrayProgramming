package ArrayHashing;

public class Q3 {
    public static void printFrequency(int a[]){
        int n=a.length;
        for (int i=0;i<n;i++){
            int count=1;
            for (int j=i+1;j<n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n-1];
                    n--;
                    j--;
                }
            }
            System.out.println(a[i]+" is "+count+" times");
        }

    }
    public static void main(String[] args) {
        int a[]={10,20,30,10,20,300};
        printFrequency(a);

    }
}
