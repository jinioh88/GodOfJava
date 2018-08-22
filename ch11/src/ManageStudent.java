public class ManageStudent {
    public void checkEquals() {
        Student a = new Student("Sana","Osaka","01000000001","sanazzang@gmail.com");
        Student b = new Student("Sana","Osaka","01000000001","sanazzang@gmail.com");
        if(a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }
}
