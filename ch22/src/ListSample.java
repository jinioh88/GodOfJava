import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");

        list.removeAll(list2);
        for(String temp : list) {
            System.out.println(temp);
        }
    }

    public void checkArrayList1() {
        ArrayList list1 = new ArrayList();
        list1.add(new Object());
        list1.add("ArrayListSample");
    }
}
