package creational.builder;

/**
 * Car brand enumeration.
 */
public enum Brand {

    TOYOTA, AUDI, BMW, FORD, JEEP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
