public class MethodPractice1 {
 
      // Method 1: Changes an element of an array
      static void change(int A[], int index, int value) {
          A[index] = value;
      }
 
      // Method 2: Tries to change a primitive variable
      static void change2(int x, int value) {
          x = value;    // changes local copy ONLY
      }
 
      public static void main(String[] args) {
 
          // --- Demo 1: Passing an Array (Object) ---
          int A[] = {2, 4, 6, 8, 10};
 
          change(A, 2, 20);   // Change index 2 from 6 to 20
 
          System.out.println("Array after change():");
          for (int i = 0; i < A.length; i++) {
              System.out.println(A[i]);
          }
 
          // --- Demo 2: Passing a Primitive ---
          int x = 10;
 
          change2(x, 20);   // Tries to change x to 20
 
          System.out.println("Value of primitive: " + x);
      }
  }
