package PZ4.task6;

public class Main {
    public static void main(String[] args)  {
        NewThread myThread = new NewThread();
        NewThread oneMoreThread = new NewThread();
        myThread.start();
        oneMoreThread.start();

        NewRunnable newRunnable = new NewRunnable();
        Thread myThread1 = new Thread(newRunnable);
        Thread oneMoreThread1 = new Thread(newRunnable);
        myThread1.start();
        oneMoreThread1.start();
    }
}
