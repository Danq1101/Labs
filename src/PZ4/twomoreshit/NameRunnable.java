package PZ4.twomoreshit;

public class NameRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("NameRunnable running");
        System.out.println("Running" + Thread.currentThread().getName());
    }
}
