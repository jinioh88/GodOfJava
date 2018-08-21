public class Student {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this(name);
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name+" "+address+" "+phone+" "+email;
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("OH");
        students[1] = new Student("SANA");
        students[2] = new Student("Hong","Seoul","01000020011","dooli@gildon.com");

        return students;
    }

    public void printStudents(Student[] student) {
        for(int i=0;i<student.length;i++) {
            System.out.println(student[i]);
        }
    }
}
