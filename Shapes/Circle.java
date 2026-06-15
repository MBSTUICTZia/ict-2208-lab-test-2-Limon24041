// Circle class

public class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(String color,
                  boolean filled,
                  double radius) {

        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {

        return "[ Circle ]\n" +
               getInfo() +
               "\nRadius: " + radius +
               String.format(
               "\nArea         : %.2f" +
               "\nCircumference: %.2f",
               getArea(),
               getPerimeter());
    }
}