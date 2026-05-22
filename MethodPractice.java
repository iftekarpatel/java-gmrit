public class MethodPractice {

    // --- Version 1: Static method (can be called directly from main) ---
    static int maxStatic(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    // --- Version 2: Non-static method (requires an object to call) ---
    int maxNonStatic(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {

        int a = 10, b = 15, result;

        // ── WAY 1: Call static method directly ──────────────────────────
        // No object needed. Works directly because maxStatic is also static.
        result = maxStatic(a, b);
        System.out.println("Way 1 (Static call) - Max is: " + result);

        // ── WAY 2: Create object, then call non-static method ────────────
        // maxNonStatic is not static, so we must create an object first.
        MethodPractice mp = new MethodPractice();
        result = mp.maxNonStatic(a, b);
        System.out.println("Way 2 (Object call) - Max is: " + result);
    }
}