import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        String[] stringArray = new String[] {"StudyHard","GodOfJava","Book"};
        StringJoinerEx ex = new StringJoinerEx();
        ex.joinStringOnlyComma(stringArray);
    }

    public void joinStringOnlyComma(String[] stringArray) {
        StringJoiner joiner = new StringJoiner(", ","(",")");
        for(String str : stringArray) {
            joiner.add(str);
        }
        System.out.println(joiner);
    }
}
