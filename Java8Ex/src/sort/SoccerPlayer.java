package sort;

public class SoccerPlayer implements Comparable<SoccerPlayer>{
    private Integer number;
    private String name;
    private String position;
    private int age;

    public SoccerPlayer(Integer number, String name, String position, int age) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(SoccerPlayer o) {
        return number.compareTo(o.number);
    }
}
