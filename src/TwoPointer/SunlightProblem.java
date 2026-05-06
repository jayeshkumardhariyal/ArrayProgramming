package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class SunlightProblem {
    public static int SunlightCount(int []a){
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []a={1,10,2,10};
        int count=SunlightCount(a);
        System.out.println(count);
    }
}
