public class Profile {
    int age;
    String name;

    public void setName(String str) {
        this.name = str;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setAge(20);
        profile.setName("Min");

        System.out.println("My name is "+profile.getName());
        System.out.println("My age is "+ profile.getAge());
    }
}
