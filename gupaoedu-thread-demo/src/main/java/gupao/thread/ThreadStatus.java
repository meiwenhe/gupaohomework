package gupao.thread;

import java.util.concurrent.TimeUnit;

public class ThreadStatus{
    public static void main(String[] args){
        new Thread(new Runnable() {

            public void run() {
                synchronized (ThreadStatus.class){
                    try {
                        ThreadStatus.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"watingThread").start();

         new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(100*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"watingoutThread").start();

        new Thread(new BlockThread(), "blockThread_1").start();
        new Thread(new BlockThread(), "blockThread_2").start();

    }

    static class BlockThread implements  Runnable{

        public void run() {
            synchronized (BlockThread.class){
                while (true){
                    try {
                        TimeUnit.SECONDS.sleep(100*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
