package c.inheritance;

public class Cat extends Animal {
    public Cat() {
        name = "키키";
        kind = "cat";
        legCount = 4;
        iq = 90;
        hasWing = false;
    }

    @Override
    public void move() {
        System.out.println(legCount+"발로 걷는다 "+kind+ " move...");
    }

    @Override
    public void eatFood() {
        System.out.println("Cat eat...");
    }
}
