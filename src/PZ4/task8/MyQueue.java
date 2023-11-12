package PZ4.task8;

public class MyQueue{
    private int n;
    boolean valueSet = false;

    public synchronized int get(){
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println("Отправлено: " + n);
        notify();
    }

}
