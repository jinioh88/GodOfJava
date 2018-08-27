import java.lang.reflect.WildcardType;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod() {
        WildCardGeneric<Car> wildcard = new WildCardGeneric<>();
        wildcard.setWildcard(new Car("matiz"));
        boundedWildcardMethod(wildcard);
    }

    private void boundedWildcardMethod(WildCardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }

}
