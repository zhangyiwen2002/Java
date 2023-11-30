package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Person implements Comparable{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id="+id+" age="+age+" name="+name;
    }

    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        if(age==p.age){
            return id-p.id;
        }else{
            return age-p.age;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        list.add(new Person(1003,"zhang",18));
        list.add(new Person(1008,"li",21));
        list.add(new Person(1015,"wang",18));
        list.add(new Person(1001,"zhao",10));
        System.out.println(list);
        Collections.sort(list);
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
