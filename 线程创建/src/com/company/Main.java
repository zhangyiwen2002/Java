package com.company;
class MyThread extends Thread{
    int cnt=0;
    @Override
    public void run() {
        System.out.println("线程名称："+Thread.currentThread().getName());
        while (cnt<10){
            System.out.println("cnt="+cnt);
            cnt++;
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        MyThread thread= new MyThread();
        thread.start();
    }
}
