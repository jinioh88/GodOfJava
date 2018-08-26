package d.lang.practice;

public class NumberOjbects {
    public long parseLong(String data){
        Long result = Long.valueOf(-1);
        try {
            result = parseLong(data);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(data+" is not a number");
            result = Long.valueOf(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void printOtherBase(long value) {
        String sec = Long.toBinaryString(value);
        System.out.println(sec);
        String hex = Long.toHexString(value);
        System.out.println(hex);
        String oct = Long.toOctalString(value);
        System.out.println(oct);
    }

    public static void main(String[] args) {
        NumberOjbects numberOjbects = new NumberOjbects();
        numberOjbects.printOtherBase(129);
        }
}
