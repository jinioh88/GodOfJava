import java.util.Random;

public class IntegerTest {
    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int hight) {
        return (n) -> {
            System.out.println(n);
        };
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton.hashCode());
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println(singleton1.hashCode());
    }
}
