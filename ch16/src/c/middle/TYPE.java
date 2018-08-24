package c.middle;

public enum TYPE {
    OWNER(1),
    MANAGER(2),
    DESIGNER(3),
    ARCHITECT(4),
    DEVELOPER(5);

    int n;
    private TYPE(int n) {
        this.n = n;
    }

    private int getN() {
        return n;
    }
}
