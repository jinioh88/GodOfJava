import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<StudentDTO> list = new ArrayList<>();
        list.add(new StudentDTO("사나",22,100));
        list.add(new StudentDTO("쯔위",20,80));
        list.add(new StudentDTO("나연",23,85));

        filterWithScoreForLoop(list,85);
    }

    public static void filterWithScoreForLoop(List<StudentDTO> studentDTOList, int scoreCutLine) {
        studentDTOList.stream().filter(student->student.getScore()>scoreCutLine).forEach(studnet->
                                                                            System.out.println(studnet.getName()));
    }
}
