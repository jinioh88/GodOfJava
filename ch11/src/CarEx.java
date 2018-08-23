public class CarEx {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }


}

class Car {
    private String name;
    private int number;



    @Override
    public String toString() {
        return "name: '" + name  +
                ", number: " + number;
    }
}