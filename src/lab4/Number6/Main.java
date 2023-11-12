package lab4.Number6;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Human human =  new Human();
        Thread thread1 = new Thread(human);
        Thread thread2 = new Thread(human);
        Thread thread3 = new Thread(human);
        Thread thread4 = new Thread(human);
        Thread thread5 = new Thread(human);
        thread1.setName("1");
        thread2.setName("2");
        thread3.setName("3");
        thread4.setName("4");
        thread5.setName("5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

