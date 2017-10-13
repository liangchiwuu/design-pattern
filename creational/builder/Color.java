package creational.builder;

/**
 * Car color enumeration.
 */
public enum Color {

    WHITE, YELLOW, RED, BLUE, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
