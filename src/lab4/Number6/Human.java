package lab4.Number6;

class Human implements Runnable {

    int[] forCheck = {1, 1, 1, 1, 1, 1};


    @Override
    public void run() {
        task();
    }

    public synchronized void task() {
        for (int i = 0; i < 2; i++) {
            notify();
            String str = Thread.currentThread().getName();
            int numberOfFork = Integer.parseInt(str);
            System.out.println(numberOfFork);
            if (forCheck[numberOfFork] != 0 && forCheck[numberOfFork - 1] != 0) {
                System.out.println(str + " - Takes first fork");
                forCheck[numberOfFork] = 0;
                System.out.println(str + " - Takes second fork");
                forCheck[numberOfFork - 1] = 0;
                System.out.println(str + " - Start eating");
                if (forCheck[0] == 0 && forCheck[5] != 0)
                    forCheck[5] = 0;
            } else {
                System.out.println(str + " - Start talking");
            }
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        forCheck = new int[]{1, 1, 1, 1, 1, 1};
    }

//    public boolean chek(){
//        for (int j = 0; j < forCheck.length; j++) {
//            if ()
//        }
//        return flag;
//    }
}



