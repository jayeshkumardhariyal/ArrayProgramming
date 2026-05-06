package ArrayBasicProgram;

public class CountArrayElemnts {
    public static void sum(int [] a){
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        int size=a.length;
        int avg=sum/size;
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>avg)
                count++;
        }
        System.out.println("sum is : "+sum);
        System.out.println("Average is : "+avg);
        System.out.println("Number of elemnents greater than avereage value are: "+count);
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        sum(a);

    }

}
