package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("id","001");
        map.put("name","zhang");
        map.put("age",20);
        map.put("age",19);
        System.out.println(map.size());
        System.out.println(map.get("age"));
        System.out.println(map.remove("age"));
        System.out.println(map.containsKey("age"));
        System.out.println(map.containsValue("zhang"));
        System.out.println("Keyset:"+map.keySet());
        System.out.println("values:"+map.values());
        System.out.println("entryset"+map.entrySet());
        Set keyset=map.keySet();
        Iterator it=keyset.iterator();
        while(it.hasNext()){
           Object key= it.next();
           System.out.println("key="+key+" value="+map.get(key));
        }
    }
}
