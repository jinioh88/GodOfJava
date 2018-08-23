package c.inheritance;

public class Dog extends Animal {
    public Dog() {
        name = "시바";
        kind = "dog";
        legCount = 4;
        iq = 120;
        hasWing = false;
    }

    @Override
    public void move() {
        System.out.println(legCount+"발로 걷는다 "+kind+ " move...");
    }

    @Override
    public void eatFood() {
        System.out.println("Dog eat...");
    }
}
