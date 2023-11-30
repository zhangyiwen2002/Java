package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Resourse{
    private final int MAX_SIZE=10;
    private Queue<Object>list= new ArrayDeque<Object>();
    public synchronized void produce(){
        while(list.size()+1>MAX_SIZE){
            System.out.println(Thread.currentThread().getName()+"仓库已满");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(new Object());
        System.out.println(Thread.currentThread().getName()+":生产一个商品，现库存"+list.size());
        notifyAll();
    }
    public synchronized void custom(){
        while (list.size()==0){
            System.out.println("仓库为空");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.remove();
        System.out.println(Thread.currentThread().getName()+":消费一个商品，现库存"+list.size());
        notifyAll();
    }
}
class Producer implements Runnable{
    Resourse resourse;

    public Producer(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        while(true){
            resourse.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class customer implements Runnable{
    Resourse resourse;

    public customer(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        while(true){
            resourse.custom();
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
        Resourse resourse=new Resourse();
        Thread p1=new Thread(new Producer(resourse),"生产者1");
        Thread p2=new Thread(new Producer(resourse),"生产者2");
        Thread c1=new Thread(new customer(resourse),"消费者1");
        Thread c2=new Thread(new customer(resourse),"消费者2");
        Thread c3=new Thread(new customer(resourse),"消费者3");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();

    }
}
