package PZ4.task8;

public class Consumer implements Runnable {
    private  MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myQueue.get();
        }
    }
}
