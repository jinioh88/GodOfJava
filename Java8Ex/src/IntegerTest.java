public class IntegerTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton.hashCode());
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println(singleton1.hashCode());
    }
}
