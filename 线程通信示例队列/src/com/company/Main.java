package com.company;

import java.util.LinkedList;
import java.util.Queue;

class TackQueue{
    Queue<String> queue=new LinkedList<>();
    public synchronized void AddTask(String s){
        queue.add(s);
        notifyAll();
    }
    public synchronized String GetTask(){
        while(queue.isEmpty()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.remove();
    }
}
public class Main {

    public static void main(String[] args) {
        TackQueue tq=new TackQueue();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("获得任务:"+tq.GetTask());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                tq.AddTask("任务一");
            }
        }).start();
    }
}
