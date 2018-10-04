public enum Operation {
    Add {
        public int eval(int arg1, int arg2) { return arg1+arg2; }
    },
    SUBSRACT {
        public int eval(int arg1, int arg2) { return arg1-arg2; }
    };

    public abstract int eval(int arg1, int arg2);

    public static void main(String[] args) {
        Operation op = Operation.Add;
        System.out.println(op.eval(1,2));

        op = Operation.valueOf("SUBSRACT");
        System.out.println(op.eval(3,1));
    }
}
