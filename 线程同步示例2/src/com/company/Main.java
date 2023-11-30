package com.company;

class Station implements Runnable{
    Object lock=new Object();
    int ticket=10;

    @Override
    public void run() {
        while(ticket>0){
            synchronized (lock){
                if(ticket>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+"张票");
                    ticket--;
                }else{
                    System.out.println("票卖完了！");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
public class Main {

    public static void main(String[] args) {
        Station station=new Station();
        Thread station1=new Thread(station,"窗口一");
        Thread station2=new Thread(station,"窗口二");
        station1.start();
        station2.start();
        try {
            station1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            station2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}