package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set hashset=new HashSet();
        Set linkedhashset=new LinkedHashSet();
        for (int i = 0; i < 5; i++) {
            int s=(int)(Math.random()*100);
            hashset.add(s);
            linkedhashset.add(s);
        }
        System.out.println("hashset:"+hashset);
        System.out.println("linkedhashset:"+linkedhashset);
        Set treeset=new TreeSet(hashset);
        System.out.println("排序后:"+treeset);
        Iterator it= ((TreeSet<?>) treeset).descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
