package PZ4.task7;

public class MyThread implements Runnable{

    private StringBuilder stringBuilder;
    int a;

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            getString();
        }
    }

    public MyThread(StringBuilder stringBuilder){
        this.stringBuilder = stringBuilder;
    }

    public MyThread(int a){
        this.a = a;
    }

    public synchronized void getString(){
        System.out.println(Thread.currentThread().getName() + " - " + stringBuilder);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int k = stringBuilder.charAt(0);
        k+=1;
        stringBuilder.deleteCharAt(0);
        stringBuilder.append((char) k);
    }

}
