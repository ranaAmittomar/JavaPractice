package multiThreading;


class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {

        System.out.println("Runnable1");

    }
}

class MyRunnableThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable2");

    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        //this is how we implement or do the threading using runnable.
        MyRunnableThread1 myRunnableThread1 = new MyRunnableThread1();
        Thread t1 = new Thread(myRunnableThread1); //its crucial to do this to run runnable.
        MyRunnableThread2 myRunnableThread2 = new MyRunnableThread2();
        Thread t2 = new Thread(myRunnableThread2);
        //We can run threads in both way ,as we've defined below.[myRunnableThread1.run()];[myRunnableThread2.run();]
        t1.start();
        t2.start();
    }

}
