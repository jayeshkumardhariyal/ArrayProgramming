package ArrayBasicProgram;

public class FIndmissingnumber {
    public static int findMissingPositiveforUnsortedArray(int []a){
        int n=a.length+1;
        int actualsum=0;
        int expectedsum=n*(n+1)/2;

       for (int i=0;i<a.length;i++){
           actualsum+=a[i];
       }
        return expectedsum-actualsum;
    }
    public static int findMissingforSortedArray(int []a){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]!=i+1){
                return i+1;
            }
        }
        return n+1;

    }
    public static void main(String[] args) {
        int a[]={ 1,2, 3,4};
//        int missing=findMissingforSortedArray(a);
        int missing=findMissingPositiveforUnsortedArray(a);
        System.out.println("Missing number in the array is: "+missing);
    }
}
