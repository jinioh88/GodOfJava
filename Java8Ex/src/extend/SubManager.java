package extend;

public class SubManager extends Manager {
    @Override
    public SubManager worksFor() {
        System.out.println("sub");
        Thread thread = new Thread(super::worksFor);
        thread.start();
        return this;
    }

    public static void main(String[] args) {
        Manager subManager = new SubManager();
        subManager.worksFor();
    }
}
