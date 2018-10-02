public class Singleton {
    private static Singleton INSTANCE;

    public static Singleton getINSTANCE() {
        if(INSTANCE==null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }

    public void singletoneMethod() {

    }
}
