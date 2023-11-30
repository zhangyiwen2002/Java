package com.company;

public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(){

    }
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(double a){
        this(a,a,a);
    }
    public boolean IsTriangle(){
        return a + b > c && b + c > a && a + c > b;
    }
    public double getArea(){
        double s=(a+b+c)/2.0;
        if(IsTriangle()){
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }else {
            return -1;
        }
    }
    public String toString(){
        return "a="+a+" "+"b="+b+" "+"c="+c;
    }
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println( t1 );
        System.out.println( "面积="+t1.getArea() );
        Triangle t2 = new Triangle(3,4,5);
        System.out.println( t2 );
        System.out.println( "面积="+t2.getArea() );
        Triangle t3 = new Triangle(3);
        System.out.println( t3 );
        System.out.println( "面积="+t3.getArea() );
    }
}
