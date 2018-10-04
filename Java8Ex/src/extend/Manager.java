package extend;

public class Manager {
    private String name;

    public Manager worksFor() {
        System.out.println("manager!");
        return this;
    }
}
