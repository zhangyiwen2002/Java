package com.company;

public class Main {

    public static void main(String[] args) {
	    Thread thread=new Thread(new Runnable(){
            int total=10;

            @Override
            public void run() {
                while (total>0){
                    System.out.println(Thread.currentThread().getName()+":售出了第"+total+"张票");
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    total--;
                }
            }
        },"窗口一");
	    thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
        System.out.println("end");
    }

}
