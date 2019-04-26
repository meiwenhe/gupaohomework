package com.mei.pattern.singleton.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                ThreadLocalSington sington = ThreadLocalSington.getInstance();
                System.out.print(sington);
                sington = ThreadLocalSington.getInstance();
                System.out.print(sington);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                ThreadLocalSington sington = ThreadLocalSington.getInstance();
            }
        });
        t1.start();
        t2.start();

    }
}
