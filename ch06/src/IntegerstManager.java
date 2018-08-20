public class IntegerstManager {
    public static void main(String[] args) {
        IntegerstManager manager = new IntegerstManager();
        for(int i=10;i<=365;i+=10) {
            System.out.println(manager.calculateAmount(i,100));
        }
    }

    public double getInterestRate(int day) {
        double ey;
        if(day>=1 && day<=90) {
            ey = 0.05;
        } else if(day>=91 && day<=180) {
            ey = 0.1;
        } else if(day>=181 && day<=364) {
            ey = 0.2;
        } else {
            ey = 0.56;
        }

        return ey;
    }

    public double calculateAmount(int day, long amount) {
        double ey = getInterestRate(day);

        return ((ey*amount) + amount);
    }
}
