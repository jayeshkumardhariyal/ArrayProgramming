package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class OceanViewProblem {
    public static int SunlightCount(int []a){
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []a={4,20,6,18,5,7,12,6};
        int count=SunlightCount(a);
        System.out.println(count);
    }
}
