// Rectangle class

public class Rectangle extends Shape {

    private double width;
    private double length;

    // Constructor
    public Rectangle(String color,
                     boolean filled,
                     double width,
                     double length) {

        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {

        return "[ Rectangle ]\n" +
               getInfo() +
               "\nWidth : " + width +
               "\nLength: " + length +
               String.format(
               "\nArea      : %.2f" +
               "\nPerimeter : %.2f",
               getArea(),
               getPerimeter());
    }
}