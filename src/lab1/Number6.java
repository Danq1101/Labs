package lab1;

public class Number6 {
    public static void main(String[] args) {
        int[] ar = new int[11];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            System.out.println(ar[i] = ar[i-2] + ar[i-1]);
        }
    }
}
