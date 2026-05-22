public class isprime {
    static boolean isPrime(int number) {
          for (int i = 2; i <= number / 2; i++) {
              if (number % i == 0) {
                  return false;
              }
          }
          return true;
      }
 
      public static void main(String[] args) {
 
          System.out.println(isPrime(19));    // true
          System.out.println(isPrime(91));    // false
 
          // Using if-else for a cleaner message
          int num = 19;
          if (isPrime(num)) {
              System.out.println(num + " is a Prime number");
          } else {
              System.out.println(num + " is NOT a Prime number");
          }
      }

}
