public class Main {
  public static boolean isprime(int x) {
    boolean prime = true;
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0) {
        prime = false;
        break;
      }
    }
    return prime;
  }

  public static void main(String[] args) {
    System.out.println("Hello world");
    System.out.println(isprime(9));
  }
}
