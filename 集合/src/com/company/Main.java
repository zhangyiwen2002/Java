package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("张三", "5000");

        map.put("李四", "5800");

        map.put("王五", "5500");


        List list = new ArrayList();

        Set entryset = map.entrySet();

        Iterator it = entryset.iterator();

        while (it.hasNext()) {

            list.add((Map.Entry) it.next());

        }

        for (int i = 0; i < list.size(); i++) {

            Map.Entry me=(Map.Entry) list.get(i);
            System.out.println(i +1+ "---" +me.getKey()+"---"+me.getValue());
        }


    }}
