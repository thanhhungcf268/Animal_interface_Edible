package CircleComparator;

public class Circle {
    private double radius;
    private String color;
    private boolean fill;
    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean fill) {
        this.radius = radius;
        this.color = color;
        this.fill = fill;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
