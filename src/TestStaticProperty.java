public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("BMW","20m");
        System.out.println(Car.numberOfCars);
        System.out.println(car);

        Car car1 = new Car("Conllin","30m");
        System.out.println(Car.numberOfCars);
        System.out.println(car1);
    }
}
