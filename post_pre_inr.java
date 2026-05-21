public class post_pre_inr {
    public static void main(String[] args) {
        int a = 10;
        int b = a++; // Post-increment: a is assigned to b, then a is incremented
        int c = ++a; // Pre-increment: a is incremented first, then assigned to c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
}
}
