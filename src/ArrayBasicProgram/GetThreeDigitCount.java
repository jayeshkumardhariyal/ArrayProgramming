package ArrayBasicProgram;

public class GetThreeDigitCount {
    public static int getThreeDigitCount(int []a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>99 &&a[i]<1000){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[]a={1000,200,400,500,1,2,3,4,5000};
        int count=getThreeDigitCount(a);
        System.out.println("Even count: "+count);

    }
}
