package multiThreading;


class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("Thread1");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("Thread2");
            i++;
        }
    }
}


public class ThreadingPract {

    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();// the start() calls ,it works internally in thread.class of java
        thread2.start(); //same.

    }

}
