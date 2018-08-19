public class OperatorCompound {
    public void compund() {
        int intVal = 10;
        intVal += 5;
        System.out.println(intVal);

        intVal -= 5;
        System.out.println(intVal);

        intVal *= 5;
        System.out.println(intVal);

        intVal /= 5;
        System.out.println(intVal);

        intVal %= 5;
        System.out.println(intVal);
    }

    public void comparision() {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1==b2);
        System.out.println(b1==b3);
    }

    public static void main(String[] args) {
        OperatorCompound op = new OperatorCompound();
        op.comparision();
    }
}
