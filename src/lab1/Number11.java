package lab1;

public class Number11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int max = 0, q = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random() *(15 + 15))-15;
            if (a[i] > max) {
                max = a[i];
                q = i;
            }
        }
        System.out.println("Max number is - " + max + " index is - " + q);
    }
}
