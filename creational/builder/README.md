# Builder Pattern

The builder pattern is a design pattern for object creation. The intention of the builder pattern is to find a solution to the constructors that require too many parameters. Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization parameter step by step and then returns the resulting constructed object at once.

With builder pattern:

```java
Car car = new Car.Builder(4).setColor(Color.BLUE).setBrand(Brand.BMW).build();
```

Without builder pattern:

```java
Car car = new Car(4, Color.BLUE, Brand.BMW);
```

or

```java
Car car = new Car();
car.wheels = 4;
car.color = Color.BLUE;
car.brand = Brand.BMW;
```
