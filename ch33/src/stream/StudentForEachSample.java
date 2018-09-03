package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> list = new ArrayList<>();
        list.add(new StudentDTO("사나",22,100,90));
        list.add(new StudentDTO("모모",22,70,60));
        list.add(new StudentDTO("쯔위",20,60,80));
//        sample.printStudentInfo(list);
        sample.filterWithScoreForloop(list, 80) ;
    }

    public void printStudentInfo(List<StudentDTO> students) {
        students.stream().forEach(student-> System.out.println(student.getName()));
        students.stream().map(student->student.getAge()).forEach(age-> System.out.println(age));
        students.stream().forEach(student-> System.out.println(student.getScoreEnglish()));
        students.stream().map(student->student.getScoreMath()).forEach(math-> System.out.println(math));
    }

    public void filterWithScoreForloop(List<StudentDTO> list, int scoreCutLine) {
//        for(StudentDTO student : list) {
//            if(student.getScoreMath()>scoreCutLine)
//                System.out.println(student.getName());
//        }
        list.stream().filter(student->student.getScoreMath()>scoreCutLine)
                                                .forEach(student-> System.out.println(student.getName()));
    }
}
