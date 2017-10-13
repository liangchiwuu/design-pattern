package creational.builder;

/**
 * Demonstration of Builder pattern.
 */
public class App {

    public static void main(String[] args) {

        Car car1 = Car.newBuilder(4).setColor(Color.BLUE).setBrand(Brand.BMW).build();
        System.out.println(car1);

        // or

        Car car2 = new Car.Builder(8).setBrand(Brand.TOYOTA).build();
        System.out.println(car2);

    }

}
