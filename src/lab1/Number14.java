package lab1; //14

import java.util.Scanner;

public class Number14 {
    public static void main(String[] args){
        int[][] array = new int[10][10];
        int max = 0, min = 0, i = 0, j = 0, zmn, m, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur numbers");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                array[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < 3; i++){
            m = 0; n = 0;
            min = max =  array[i][0];
            for (j = 0; j < 3; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    m = j;
                }
                if(array[i][j] < min) {
                    min = array[i][j];
                    n = j;
                }
            }
            System.out.println("m = " + m + " n = " + n + " max = " + max + " min = " + min);
            zmn = array[i][0];
            array[i][m] = zmn;
            array[i][0] = max;

            if (array[i][m] == min) {
                zmn = array[i][j - 1];
                array[i][m] = zmn;
                array[i][j - 1] = min;
            }
            else{
                zmn = array[i][j - 1];
                array[i][n] = zmn;
                array[i][j - 1] = min;
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
