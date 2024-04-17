package prelim;

public class Array4 {
    public static void main(String[] args) {
        String[] name = {"Juan", "Maria","Pedro"};
        int[] age = {29,18,15};
        printArray(name,age);
    }
    public static void printArray(String[] n, int[] a ){
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i] + " " + a[i]);
        }

    }
    
}
