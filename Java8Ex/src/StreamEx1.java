import java.util.ArrayList;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(21);
        list.add(133);

        multiplyWithFor(list);
    }

    private static void multiplyWithFor(List<Integer> integerList) {
        integerList.stream().map(x->x*3).forEach(System.out::println);
    }
}
