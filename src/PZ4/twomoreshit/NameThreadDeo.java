package PZ4.twomoreshit;

public class NameThreadDeo {
    public static void main(String[] args) {
        Thread thread = new Thread(new NameRunnable());
        thread.setName("Thread 1");
        thread.start();

        Thread thread1 = new Thread(new NameRunnable());
        thread1.setName("Thread 2");
        thread1.start();
    }
}






