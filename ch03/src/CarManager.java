public class CarManager {
    public static void main(String[] args) {
        Car dogCar = new Car();
        Car cowCar = new Car();

        System.out.println(cowCar.getCurrentSpeend());
        cowCar.speedUp();
        System.out.println(cowCar.getCurrentSpeend());
    }
}
