class Shape {
    void area() {
        System.out.println("Display Area:");
    }
}
class Triangle extends Shape {
    void calcArea(int l, int b) {
        double result = 0.5 * l * b;
        System.out.println("Area of triangle: " + result);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        obj.calcArea(23, 46);
    }
}
