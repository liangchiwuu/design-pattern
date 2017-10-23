package anti.constantinterface;

/**
 * A demonstration of constant interface anti-pattern.
 */
public class App {

    public static void main(String[] args) {

        Circle circle = new Circle(2);
        double area = circle.getArea();

        System.out.println(area);

    }

}
