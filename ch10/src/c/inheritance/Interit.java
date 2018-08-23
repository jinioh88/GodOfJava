package c.inheritance;

public class Interit {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.move();;
        cat.move();
        dog.sleep();
    }
}
