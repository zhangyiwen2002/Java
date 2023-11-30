package com.company;

class Student extends Person{
    private String school;
    public Student(){

    }
    public Student(String name,String school){
        super(name);
        this.school=school;
    }
    public String toString(){
        return "name:"+super.getName()+" "+"school:"+school;
    }
    @Override
    public  boolean equals(Person person){
        if(person instanceof Student){
            Student student=(Student) person;
            return this.school.equals(student.school)&&getName().equals(student.getName());
        }
        return false;
    }
}
public class Main {

    public static void main(String[] args) {
        Person p1 = new Student("小明", "武科大");
        Person p2 = new Student("小明", "武大");
        Person p3 = new Student("小明", "武科大");
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        System.out.println( p1.equals(p2) ); // 输出 false
        System.out.println( p1.equals(p3) ); // 输出 true

    }
}
