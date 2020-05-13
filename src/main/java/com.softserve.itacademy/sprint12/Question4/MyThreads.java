package com.softserve.itacademy.sprint12.Question4;

//Please, fix the problem with the preloaded implementation of the class MyThread.
//        Test starts both threads with the code:
//        MyThreads.t1.start();
//        MyThreads.t2.start();
//        The goal of each thread is to update fields m and n and not switch between
//        threads while in the loop. You need to get an output like this:
// Please, don't change actions that change variables or print output within run methods.
// Use only thread synchronization assets.



class MyThreads {
    public final static Object den = new Object();
    public final static Object ada = new Object();

    public static int n;
    public static int m;

    public static Thread t1 = new Thread() {
        public void run() {
            synchronized (den) {
                for(int i = 0; i < 5; i++, n++)
                    System.out.println("Thread1 n = " + n);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ada) {
                for(int i = 0; i < 5; i++, m++)
                    System.out.println("Thread1 m = " + m);
                System.out.println( "Thread1 success!");
            }
        }
    };

    public static Thread t2 = new Thread() {
        public void run() {
            synchronized (den) {
                for(int i = 0; i < 5; i++, m++)
                    System.out.println("Thread2 m = " + m);
                Thread.yield();
            }
            synchronized (ada) {
                for(int i = 0; i < 5; i++, n++)
                    System.out.println("Thread2 n = " + n);
                System.out.println("Thread2 success!");
            }
        }
    };

    public static void main(String[] args) {
        MyThreads.t1.start();
        MyThreads.t2.start();
    }
}