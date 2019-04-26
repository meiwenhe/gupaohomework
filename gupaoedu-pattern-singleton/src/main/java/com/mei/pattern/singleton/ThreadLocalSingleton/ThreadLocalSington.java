package com.mei.pattern.singleton.ThreadLocalSingleton;

public class ThreadLocalSington{
    private  static  final ThreadLocal<ThreadLocalSington> threadlocal = new ThreadLocal<ThreadLocalSington>(){
        @Override
        protected ThreadLocalSington initialValue() {
            return new ThreadLocalSington();
        }
    };
    public static ThreadLocalSington getInstance(){
        return threadlocal.get();//get()方法会判断当前线程是否存在当前对象，如果存在则返回，否则会调用initialValue()方法，生成对象，保证每个线程中的实例只有一个

    }
}
