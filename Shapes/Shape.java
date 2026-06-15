// Abstract Shape class

public abstract class Shape {

    protected String color;
    protected boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // Common information
    public String getInfo() {
        return "Color : " + color +
               "\nFilled: " + (filled ? "Yes" : "No");
    }
}