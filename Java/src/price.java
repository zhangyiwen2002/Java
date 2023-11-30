public class price {
  private int p = 80;

  public price(int p) {
    this.p = p;
  }

  void show() {
    System.out.println(p);
  }

  public static void main(String[] args) {
    price pr = new price(100);
    pr.show();
  }
}
