package d.collectino.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatics {
    public static void main(String[] args) {
        RandomNumberStatics service = new RandomNumberStatics();
        service.getRandomNumbersStatics();
    }

    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer,Integer> hashtable = new Hashtable<>();

    public void getRandomNumbersStatics() {
        Random random = new Random();
        int number;
        for(int i=0;i<5000;i++) {
            number = random.nextInt(50)+1;
            putCurrentNumber(number);
        }
        printStatiestics();
    }

    public void putCurrentNumber(int tempNumber) {
        if(hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        } else {
            hashtable.put(tempNumber,1);
        }
    }

    public void printStatiestics() {
        Set<Integer> keys = hashtable.keySet();

        for(Integer key : keys) {
            if(key%10-1==0)
                System.out.println();
            System.out.print(key+"="+hashtable.get(key)+"\t");
        }

    }

}
