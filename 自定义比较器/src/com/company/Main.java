package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable{
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "x="+x+" y="+y;
    }


    @Override
    public int compareTo(Object o) {
        Point p=(Point) o;
        if(p.x!=x){
            return x-p.x;
        }else{
            return y-p.y;
        }
    }
}
public class Main {


    public static void main(String[] args) {
        List<Point> list=new ArrayList<Point>();
        list.add(new Point(3,2));
        list.add(new Point(1,3));
        list.add(new Point(1,2));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
