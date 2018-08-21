import java.util.Arrays;

public class ManageHeight {
    static int [][] gradeHeights;
    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();
        manager.setData();

        for(int i=0;i<5;i++) {
            System.out.println("Class No.:"+i+1);
            manager.printAverage(i);
        }
    }

    public void setData() {
        gradeHeights = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        for (int data:gradeHeights[classNo]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double ave = 0.0;
        for(int data:gradeHeights[classNo]) {
            ave += data;
        }

        ave = ave/gradeHeights[classNo].length;

        System.out.println(ave);
    }
}
