package d.generic.practice;

public class MaxFinder {
    public void testGetMax() {
        System.out.println(getMax(1,2,3));
        System.out.println(getMin('a','c','d'));
    }

    public <T extends Comparable<T>> T getMax(T...a) {
        T maxT = a[0];
        for(T tempT:a) {
            if(tempT.compareTo(maxT)>0)
                maxT = tempT;
        }
        return maxT;
    }

    public <T extends Comparable<T>> T getMin(T...a) {
        T minT = a[0];
        for(T tempT : a) {
            if(tempT.compareTo(minT)<0)
                minT = tempT;
        }
        return minT;
    }

    public static void main(String[] args) {
        MaxFinder instance = new MaxFinder();
        instance.testGetMax();
    }
}
