package ArrayBasicProgram;

public class CountEvenElements {
    public static int getEvenCount(int []a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[]a={1,2,};
        int count=getEvenCount(a);
        System.out.println("Even count: "+count);

    }
}
