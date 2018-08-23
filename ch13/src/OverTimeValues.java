public enum OverTimeValues {
    THREE_HOUR(18000),
    FIVE_HOUR(30000);

    private final int amount;
    OverTimeValues(int amount){
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
}
