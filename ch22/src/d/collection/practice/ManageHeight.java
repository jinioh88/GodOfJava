package d.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();
        manager.setData();

        for(int i=0;i<5;i++) {
            System.out.println("Class No : "+(i+1));
            manager.printAverage(i);
        }

    }

    public void printAverage(int classNo) {
        double sum = 0.0;
        int len = gradeHeights.get(classNo).size();
        for(int i=0;i<len;i++) {
            sum += gradeHeights.get(classNo).get(i);
        }
        sum /= len;
        System.out.println(sum);
    }

    public void printHeight(int classNo) {
        int len2 = gradeHeights.get(classNo).size();

            for(int j=0;j<len2;j++) {
                System.out.println(gradeHeights.get(classNo).get(j));
            }

    }

    public void setData() {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] temp1 = {170,180,173,175,177};
        list.addAll(Arrays.asList(temp1));
        gradeHeights.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        Integer[] temp2 ={160, 165, 167, 186};
        list2.addAll(Arrays.asList(temp2));
        gradeHeights.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        Integer[] temp3 ={158, 177, 187, 176};
        list3.addAll(Arrays.asList(temp3));
        gradeHeights.add(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        Integer[] temp4 ={173, 182, 181};
        list4.addAll(Arrays.asList(temp4));
        gradeHeights.add(list4);

        ArrayList<Integer> list5 = new ArrayList<>();
        Integer[] temp5 ={170, 180, 165, 177,172};
        list5.addAll(Arrays.asList(temp5));
        gradeHeights.add(list5);
    }
}
