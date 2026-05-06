package ArrayBasicProgram;

public class DuplicateElement {
    public static int findDuplicate(int []a){
        int n=a.length;
        int duplicate=0;
        for (int i=1;i<n;i++){
            if (a[i-1]==a[i]){
                duplicate=a[i];
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int []a={1, 3, 4, 2, 2};
        int duplicate=findDuplicate(a);
        System.out.println("Duplicate number present in the array is: "+duplicate);

    }
}
