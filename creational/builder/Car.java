package creational.builder;

class Car {
    private int wheels;
    private Color color;
    private Brand brand;

    private Car() {
    }

    public static Builder newBuilder(final int wheels) {
        return new Builder(wheels);
    }

    public Brand getBrand() {
        return brand;
    }

    private void setBrand(final Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    private void setColor(final Color color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    private void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", brand = " + brand + ", color = " + color + "]";
    }

    /**
     * The builder abstraction.
     */
    static class Builder {
        private Car car;

        public Builder(final int wheels) {
            car = new Car();
            car.setWheels(wheels);
        }

        public Car build() {
            return car;
        }

        public Builder setColor(final Color color) {
            car.setColor(color);
            return this;
        }

        public Builder setBrand(final Brand brand) {
            car.setBrand(brand);
            return this;
        }
    }
}
