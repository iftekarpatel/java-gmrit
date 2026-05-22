public class method_demo {
 
      static void inc(int x) {
          x++;                        // modifies the LOCAL copy only
          System.out.println("Inside inc(), x = " + x);  // prints 11
      }
 
      public static void main(String[] args) {
          int a = 10;
          inc(a);                     // passes a copy of a (value = 10)
          System.out.println("Outside inc(), a = " + a);      // still prints 10 - UNCHANGED!
          
      }      
    }