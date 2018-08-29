import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
          "Tico","Sonata","BMW","Benz","BMW"
        };
        System.out.println(sample.getCardKinds(cars));
    }

    public int getCardKinds(String[] cars) {
        if(cars == null) return 0;
        HashSet<String> hashSet = new HashSet<>();
        for(String str : cars)
            hashSet.add(str);

        return hashSet.size();
    }
}
