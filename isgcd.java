public class isgcd {
    static int gcd(int m, int n) {
          while (m != n) {
              if (m > n) {
                  m = m - n;
              } else {
                  n = n - m;
              }
          }
          return m;
      }
 
      public static void main(String[] args) {
 
          System.out.println("GCD(25, 15) = " + gcd(25, 15));  // 5
          System.out.println("GCD(35, 56) = " + gcd(35, 56));  // 7
      }

}
