package gupao.thread;

public class ThreadApp extends Thread{
    public static void main(String[] args){
        Thread thread = new Thread(new ThreadApp());
        thread.start();
    }

    @Override
    public void run() {
        //super.run();
        System.out.println("run...........................");
    }
}
