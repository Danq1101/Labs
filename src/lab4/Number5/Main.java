package lab4.Number5;

public class Main {
    public static void main(String[] args) {
        Running beg = new Running();
        Thread thread1 = new Thread(beg);
        Thread thread2 = new Thread(beg);
        Thread thread3 = new Thread(beg);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

