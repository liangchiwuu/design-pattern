package creational.builder;

/**
 * Demonstration of Builder pattern. This provides a better way to create a object with large number of parameters.
 */
public class App {

    public static void main(String[] args) {

        Car car1 = new Car.Builder(4).setColor(Color.BLUE).setBrand(Brand.BMW).build();
        Car car2 = new Car.Builder(8).setBrand(Brand.TOYOTA).build();

        System.out.println(car1);
        System.out.println(car2);

    }

}
