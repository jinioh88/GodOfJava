public class Car {
    int speed;
    int distance;
    String color;

    public Car() {}
    public void speedUp() {
        this.speed += 5;
    }
    public void breakDown() {
        this.speed -= 10;
    }

    public int getCurrentSpeend() {
        return this.speed;
    }
}
