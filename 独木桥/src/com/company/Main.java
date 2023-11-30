package com.company;

public class Main {
    static class Human extends Thread{
        int num;
        public Human(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            synchronized (bridge){
                try {
                    Thread.sleep(5000);
                    System.out.println(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }


    public static Object bridge = new Object();
        public static void main(String[] args) {

            for(int i = 1; i<6; i++) {

                Human human = new Human(i);

                human.start();

            }

        }

}
