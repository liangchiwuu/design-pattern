package creational.builder;

class Car {
    private final int wheels;
    private final Color color;
    private final Brand brand;

    private Car(Builder builder) {
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.brand = builder.brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", brand = " + brand + ", color = " + color + "]";
    }

    /**
     * The builder abstraction.
     */
    static class Builder {
        private final int wheels;
        private Color color;
        private Brand brand;

        public Builder(final int wheels) {
            this.wheels = wheels;
        }

        public Builder setColor(final Color color) {
            this.color = color;
            return this;
        }

        public Builder setBrand(final Brand brand) {
            this.brand = brand;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
