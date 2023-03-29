public class Car {
    private String a;
    private String b;

    public static int numberOfCars;
    public Car(String a,String b){
        this.a = a;
        this.b = b;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
