public interface IntSequence {
    public static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
}
