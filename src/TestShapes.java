public class TestShapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "Красный", false); // Upcast Circle to Shape
        System.out.println(s1);                   // Circle's toString()
        System.out.println("Площадь: " + s1.getArea());
        System.out.println("Периметр: " + s1.getPerimeter());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println("Радиус: " + c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "Красный", false);  // Upcast Rectangle to Shape
        System.out.println(s3);
        System.out.println("Площадь: " + s3.getArea());
        System.out.println("Периметр: " + s3.getPerimeter());

        Shape s4 = new Square(6.6);              // Upcast Square to Shape
        System.out.println(s4);
        System.out.println("Площадь: " + s4.getArea());
    }
}
