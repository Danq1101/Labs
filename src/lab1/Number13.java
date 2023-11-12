package lab1;

public class Number13 {
    public static void main(String[] args) {
        int[][] a = new int[15][2]; // x  y 3
        int k = 0;                  // 2  3 0
        while (k != 15){            // 2  4 0
            boolean flag = true;
            int x = (int)(Math.random()*7 + 2);
            int y = (int)(Math.random()*7 + 2);
            for (int j = 0; j < k; j++) {
                if ((x == a[j][0] || x == a[j][1]) && (y == a[j][1] || y == a[j][0])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                a[k][0] = x;
                a[k][1] = y;
                k++;
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i][0] + " * " + a[i][1]);
        }
    }
}




