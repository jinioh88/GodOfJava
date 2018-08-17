public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte)23);
        profilePrint.setMarried(false);
        profilePrint.setname("Sana");

        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.isMarried());
    }
}
