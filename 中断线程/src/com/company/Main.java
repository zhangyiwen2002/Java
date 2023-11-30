package com.company;
class Mythread implements Runnable{
    @Override
    public void run() {
        int n=0;
        while(!Thread.currentThread().isInterrupted()){
            n++;
            System.out.println(n);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Thread thread=new Thread(new Mythread());
        thread.start();
        try {
            System.out.println("主线程即将休眠！");
            Thread.sleep(10);
            System.out.println("主线程休眠结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程即将设置为中断状态！");
        thread.interrupt();
        System.out.println("子线程已经设置为中断状态！");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
