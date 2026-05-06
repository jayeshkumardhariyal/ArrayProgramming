package ArrayBasicProgram;

public class StrictlyIncreasing {
    public static boolean strictlyincreasing(int []a){
        for (int i=0;i<a.length-1;i++){
            if(a[i]>=a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []a={2,3,7,8,9};
        if(strictlyincreasing(a)){
            System.out.println("It is strictly increasing");
        }else {
            System.out.println("It is not strictly increasing");
        }

    }
}
