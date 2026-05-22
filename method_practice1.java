public class method_practice1 {
    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    // non static method 
    int maxNonStatic(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }


    public static void main(String[] args) {
        int a = 10, b = 15, result;
        // result = max(a, b);
        // System.out.println("Max is: " + result);

        // Creating an object of the class to call the non-static method
        method_practice1 obj = new method_practice1();
        result = obj.maxNonStatic(a, b);
        System.out.println("Max (non-static) is: " + result);
    }
}
