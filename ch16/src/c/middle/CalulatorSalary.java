package c.middle;

public class CalulatorSalary {
    public static void main(String[] args) {
        CalulatorSalary salary = new CalulatorSalary();
        salary.calculateSalareis();;
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();
        switch(employee.getType()) {
            case 1:
                salary = salary - (long)(salary*0.5);
                break;
            case 2:
                salary = salary + (long)(salary*0.1);
                break;
            case 3:
                salary = salary + (long)(salary*0.2);
                break;
            case 4:
                salary = salary + (long)(salary*0.3);
                break;
            case 5:
                salary = salary*2;
                break;
        }
        return salary;
    }

    public void calculateSalareis() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Oh",1,1000000000);
        employees[1] = new Employee("Kim",2,100000000);
        employees[2] = new Employee("Whang",3,70000000);
        employees[3] = new Employee("Park",4,80000000);
        employees[4] = new Employee("Lee",5,60000000);

        for(int i=0;i<5;i++) {
            System.out.println(employees[i].getName()+" : "+getSalaryIncrease(employees[i]));
        }
    }
}
