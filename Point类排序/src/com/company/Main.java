package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point{
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "x="+x+" "+"y="+y;
    }

}
class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Point p1=(Point) o1;
        Point p2=(Point) o2;
        if(p1.getX()!=p2.getX()){
            return p1.getX()-p2.getY();
        }else{
            return p1.getY()-p2.getY();
        }
    }

}
public class Main {

    public static void main(String[] args) {
        List<Point> list=new ArrayList<Point>();
        list.add(new Point(2,3));
        list.add(new Point(4,3));
        list.add(new Point(1,3));
        System.out.println("排序前:"+list);
        Collections.sort(list,new MyComparator());
        System.out.println("排序后:"+list);
    }
}
