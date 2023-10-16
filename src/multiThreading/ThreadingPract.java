package multiThreading;


class DemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Priority Thread: " + Thread.currentThread().getName());
    }
}

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
//
//        MyThread1 thread1 = new MyThread1();
//        MyThread2 thread2 = new MyThread2();
//        thread1.start();// the start() calls ,it works internally in thread.class of java
//        thread2.start(); //same.
        //WHen we set MAX_PRIORITY to thread,then that thread runs first.
        DemoThread thread1 = new DemoThread();
        DemoThread thread2 = new DemoThread();
        thread1.setName("First Thread");
        thread2.setName("Second Thread");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }

}
