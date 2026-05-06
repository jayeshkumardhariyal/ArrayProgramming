package ArrayBasicProgram;

public class FrequesncyofCharacter {
    public static void count(String s){
        char []a=s.toCharArray();
        int count=0;
       for(int i=1;i<a.length;i++){
           if(a[i-1]==a[i]){
               count++;
           }
           System.out.println(a[i]+" frequency is: "+count);
           count=0;
       }

    }
    public static void main(String[] args) {
        String s="aabbbc";
        count(s);
    }
}
