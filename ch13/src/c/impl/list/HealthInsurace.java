package c.impl.list;

public enum HealthInsurace {
    LEVEL_ONE(1000,0.01),
    LEVEL_TWO(2000,0.02),
    LEVEL_THREE(3000,0.032),
    LEVEL_FOUR(4000,0.045),
    LEVEL_FIVE(5000,0.056),
    LEVEL_SIX(6000,0.071);
    int maxSalary;
    double ratio;
     HealthInsurace(int maxSalary,double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    private double getRatio() {
        return ratio;
    }

    public static HealthInsurace getHealthInsurance(int salary) {
        HealthInsurace healthInsurace;
        switch (salary/1000){
            case 1 :
                healthInsurace = HealthInsurace.LEVEL_ONE;
                break;
            case 2 :
                healthInsurace = HealthInsurace.LEVEL_TWO;
                break;
            case 3 :
                healthInsurace = HealthInsurace.LEVEL_THREE;
                break;
            case 4 :
                healthInsurace = HealthInsurace.LEVEL_FOUR;
                break;
            case 5 :
                healthInsurace = HealthInsurace.LEVEL_FIVE;
                break;
            case 6 :
                healthInsurace = HealthInsurace.LEVEL_SIX;
                break;
                default:
                    healthInsurace = HealthInsurace.LEVEL_SIX;
                    break;
        }
        return healthInsurace;
    }

    public static void main(String[] args) {
        int salaryArray[] = new int[] {1500,5500,8000};
        HealthInsurace[] insuraces = new HealthInsurace[3];
        insuraces[0] = HealthInsurace.getHealthInsurance(salaryArray[0]);
        insuraces[1] = HealthInsurace.getHealthInsurance(salaryArray[1]);
        insuraces[2] = HealthInsurace.getHealthInsurance(salaryArray[2]);

        for(int loop=0;loop<3;loop++) {
            System.out.println(salaryArray[loop]+"="+insuraces[loop]+", "+insuraces[loop].getRatio());
        }
    }
}
