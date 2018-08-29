package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {


    public static void main(String[] args) {
        RandomNumberMaker service = new RandomNumberMaker();
        for(int i=0;i<10;i++) {
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet = service.getsixNumber();
            System.out.println(hashSet);
        }
    }

    public HashSet<Integer> getsixNumber() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();

        int tempNumber = 0;
        while(tempNumber<6) {
            hashSet.add(random.nextInt(45));
            tempNumber = hashSet.size();
        }
        return hashSet;
    }
}
