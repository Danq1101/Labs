package lab4.Number5;

class Running implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
