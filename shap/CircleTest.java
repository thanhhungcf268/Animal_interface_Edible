package shap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1, "indigo", false);
        circle.resize(100);
        System.out.println(circle.getRadius());

    }
}
