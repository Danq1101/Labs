package PZ4.task8;

public class Producer implements Runnable {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue){
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myQueue.get();
        }
    }
}
