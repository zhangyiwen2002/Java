package com.company;

class SynchronizedTest {
    public static synchronized void method1(){
        System.out.println("Method1 start");
        System.out.println("Method1 execute");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
    public static synchronized void method2(){
        System.out.println("Method2 start");
        System.out.println("Method2 execute");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
public class Main {

    public static void main(String[] args) {
        SynchronizedTest test1=new SynchronizedTest();
        SynchronizedTest test2=new SynchronizedTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test1.method1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test2.method2();
            }
        }).start();
    }
}

