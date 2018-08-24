public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printDivide(1,2);
        try {
            calc.printDivide(1,0);
        } catch(RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void printDivide(double d1, double d2) {
        double result;
        try {
            if(d2==0)
                throw new RuntimeException("Second value can't be Zero!!");
            result = d1/d2;
            System.out.println(result);
        } catch(RuntimeException e) {
            System.out.println("Second value can't be Zero!!");
        }

    }
}
