package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("000");
        list.add(111);
        list.add(0,"333");
        list.set(1,"666");
        System.out.println(list);
        System.out.println((String) list.get(1));
        System.out.println(list.listIterator(0).next());
        System.out.println(list.subList(1,3));
        ListIterator it=list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        it=list.listIterator(list.size());
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
