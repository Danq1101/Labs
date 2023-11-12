package PZ4.task7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder("a");
        int a = 1;

        MyThread thread0 = new MyThread(stringBuilder);

        Thread thread = new Thread(thread0);
        Thread thread1 = new Thread(thread0);
        Thread thread2 = new Thread(thread0);
        thread.setName("thread 0");
        thread1.setName("thread 1");
        thread2.setName("thread 2");

        thread.start();
        thread1.start();
        thread2.start();
    }
}
