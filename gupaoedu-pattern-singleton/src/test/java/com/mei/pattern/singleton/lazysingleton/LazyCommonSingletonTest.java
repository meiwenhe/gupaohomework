package com.mei.pattern.singleton.lazysingleton;

public class LazyCommonSingletonTest {
    public static void main(String[] args){

        /*LazyCommonSingleton singleton = LazyCommonSingleton.getInstance();
        System.out.println(singleton);
        singleton = LazyCommonSingleton.getInstance();
        System.out.println(singleton);
        singleton = LazyCommonSingleton.getInstance();
        System.out.println(singleton);
        singleton = LazyCommonSingleton.getInstance();
        System.out.println(singleton);*/
       // long start = System.currentTimeMillis();


       /* Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0;i<1000;i++){
                    LazyCommonSingleton singleton = LazyCommonSingleton.getInstance();
                    System.out.println(singleton+String.valueOf(System.currentTimeMillis()));
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0;i<1000;i++){
                    LazyCommonSingleton singleton = LazyCommonSingleton.getInstance();
                    System.out.println(singleton+String.valueOf(System.currentTimeMillis()));
                }

            }
        });


        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0;i<1000;i++){
                    LazyCommonSingleton singleton = LazyCommonSingleton.getInstance();
                    System.out.println(singleton+String.valueOf(System.currentTimeMillis()));
                }

            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0;i<1000;i++){
                    LazyCommonSingleton singleton = LazyCommonSingleton.getInstance();
                    System.out.println(singleton+String.valueOf(System.currentTimeMillis()));
                }

            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        long end = System.currentTimeMillis();
        System.out.println("time is "+ (end - start));*/

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = LazyCommonSingleton.getInstance();;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 100000,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
