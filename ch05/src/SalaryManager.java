public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        double salary = manager.getMonthlySalary(2000);
        System.out.println("==========================");
        System.out.println(salary);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12.0;
        double sum = 0;

        sum += calculatoeTax(monthlySalary);
        sum += calculatenationalPension(monthlySalary);
        sum += calculateealthInsurance(monthlySalary);

        monthlySalary -= sum;
        return monthlySalary;
    }

    public double calculateealthInsurance(double monthSalary) {
        double sal = monthSalary *= 0.135;
        System.out.println(sal);
        return sal;
    }

    public double calculatoeTax(double monthlySalary) {
        monthlySalary *= 0.125;
        System.out.println(monthlySalary);
        return monthlySalary;
    }

    public double calculatenationalPension(double monthlySalary) {
        monthlySalary *= 0.081;
        System.out.println(monthlySalary);
        return monthlySalary;
    }

}
