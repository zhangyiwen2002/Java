package com.company;
class Resouce{
    public static int cnt=0;
    public static final Object lock=new Object();

}
class AddThread implements Runnable{
    @Override
    public void run() {
        synchronized (Resouce.class) {
            for (int i = 0; i < 1000; i++) {
                    Resouce.cnt++;

            }
        }
    }
}
class DecThread implements Runnable{
    @Override
    public void run() {
        synchronized (Resouce.class) {
            for (int i = 0; i < 1000; i++) {

                    Resouce.cnt--;

            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
	    Thread thread1=new Thread(new AddThread());
	    Thread thread2=new Thread(new DecThread());
	    thread1.start();
	    thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Resouce.cnt);
        System.out.println("end");
    }
}
