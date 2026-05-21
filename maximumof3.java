public class maximumof3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } else {
            if (b >= c) {
                System.out.println("Maximum is: " + b);
            } else {
                System.out.println("Maximum is: " + c);
            }
        }
    }
}
