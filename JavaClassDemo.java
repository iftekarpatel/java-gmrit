class Circle {  
    public double radius; // property of the circle

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public double circumference() {
        return perimeter();  // circumference is the same as perimeter for a circle
    }
}

public class JavaClassDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5.0;

        System.out.println("Circle with radius: " + c1.radius);
        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Circumference: " + c1.circumference());
    }
}