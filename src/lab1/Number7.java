package lab1; // 7

public class Number7 {
    public static void main(String[] args) {
        int count = 0;
        int number;
        for (number = 0; number < 1000000; number++){
            int i1 = number / 100000;
            int i2 = number / 10000 % 10;
            int i3 = number / 1000 % 10;
            int i4 = number / 100 % 10;
            int i5 = number / 10 % 10;
            int i6 = number % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
