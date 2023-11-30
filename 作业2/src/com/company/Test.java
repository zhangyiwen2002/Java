class A {

    public static String staticGet() {    return "1";	  }

    public String dynamicGet() {    return "2";	  }

}

class B extends A {

    public static String staticGet() {    return "3";	  }

    public String dynamicGet() {    return "4";	  }

}

public class Test {

    public static void main(String[] args) {

        A a = new B();

        System.out.print( a.staticGet() );

        System.out.print( a.dynamicGet() );

    }

}

