interface InTest{  void testPrintln(); 	void lambda();  }

class Outer implements InTest{

  public void testPrintln(){  System.out.println("One");  	}

  public void lambda(){  System.out.println("Outer"); 	testPrintln();  }

}

public class TestInner {

  static class Inner extends Outer{

    public void testPrintln(){	 System.out.println("Two"); 	}

    public void lambda(){  System.out.println("Inner" ); 	  testPrintln(); }

  }

  public static void main(String[]args)

  {

    InTest tmp =new Outer();    		tmp.lambda();

    tmp=new Inner(); 					tmp.lambda();

    tmp =new Outer(){

      public void testPrintln(){ System.out.println("Three");}

      public void lambda(){

        System.out.println("Annoy" );

        super.testPrintln();

      }

    };

    tmp.lambda();

  }

}