package lab2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Drob drob = new Drob();
        Drob drob1 = new Drob(2, 3, 4, 5);
        drob.plus(2, 3, 4, 5, 6);

        System.out.println(drob1.minus());
        drob.um(1, 2, 3, 4, 5);
        drob1.del();
        Scanner s =new Scanner(System.in);
        System.out.print("Enter ur k - ");

        Drob drobTest = new Drob();
        int k = s.nextInt();
        double newM = 0, newN = 0, newM1 = 0, newN1 = 0;
        Drob[] array = new Drob[k];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter ur fraction ");
            array[i] = new Drob(s.nextInt(), s.nextInt());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getDrob());
            if (i%2 == 1){
                newM = array[i].getM();
                newN = array[i].getN();
                newM1 = array[i++].getM();
                newN1 = array[i++].getN();
                drobTest.plus(newM, newN, newM1, newN1);
            }
        }
    }
}

class Drob {
    double m, m1, n, n1;
    Drob() {
    }
    Drob(int m, int n, int m1, int n1) {
        this.m1 = m1;
        this.n1 = n1;
        this.m = m;
        this.n = n;
    }

    Drob(int m, int n){
        this.m = m; this.n = n;
    }

    void setDrob(int m, int n){
        this.m = m;
        this.n = n;
    }

    double getDrob(){
        return m/n;
    }

    double getM(){
        return m;
    }

    public double getN() {
        return n;
    }

    void plus(double... n) {
        double sum = 0;
        int length = n.length;
        if (length % 2 == 0) {
            for (int i = 0; i < length; i+=2) {//(m*n1 + m1*n)/n*n1) =  m/n + m1/n1 = 1.466666 2 3 4 5
                int j = i + 1;
                sum += n[i] / n[j];
            }
            System.out.println(sum);
        } else {
             for (int i = 0; i < length - 1; i+=2) {//(m*n1 + m1*n)/n*n1) =  m/n + m1/n1 = 7.466666 2 3 4 5 6
                int j = i + 1;
                sum += n[i] / n[j];
            }
            System.out.println(sum + n[length - 1]);
        }
    }

    double minus(){return ((m*n1 - m1*n)/n/n1);} // m/n - m1/n1 = m*n1 - m1*n
    void um(int... n){
        double uch = 1;
        double uzn = 1;
        int length = n.length;
        if (length % 2 == 0){
            for (int i = 0; i < length; i+=2) // m/n * m1/n1
                uch *= n[i];
            for (int i = 1; i < length; i+=2)
                uzn *= n[i];
            System.out.println( uch / uzn);
        }
        else {
            for (int i = 0; i < length - 1; i += 2)  // 1 2 3 4 5
                uch *= n[i];
            for (int i = 1; i < length - 1; i += 2)
                uzn *= n[i];
            System.out.println( uch / uzn * n[length - 1]);
        }

    }
    void del(){
        System.out.println(m*n1/n/m1);
    }

    @Override
    public String toString() {
        return "Drob{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
