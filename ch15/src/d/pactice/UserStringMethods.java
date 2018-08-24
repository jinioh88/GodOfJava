package d.pactice;

public class UserStringMethods {
    public static void main(String[] args) {
        UserStringMethods userStringMethods = new UserStringMethods();
        String s = "The String class represents char Strings.";
//        userStringMethods.printWords(s);
        userStringMethods.printContainWords(s, "ss");
    }

    public void printWords(String str) {
        String[] temp = str.split(" ");
        for(String s : temp) {
            System.out.println(s);
        }
    }

    public void findString(String str, String findStr) {
        if(!str.contains(findStr))
            System.out.println("해당 문자열 없음");
        System.out.println(str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        String temp = str.toLowerCase();
        if(temp.contains(findStr))
            System.out.println(temp.indexOf(findStr));
    }

    public void countChar(String str, char c) {
        char[] temp = str.toCharArray();
        int count = 0;
        int len = temp.length;
        for(int i=0;i<len;i++) {
            if(temp[i]==c)
                count++;
        }
        System.out.println(count);
    }

    public void printContainWords(String str, String findStr) {
        String[] temp = str.split(" ");
        for(int i=0;i<temp.length;i++) {
            if(temp[i].contains(findStr))
                System.out.println("class contain "+findStr);
        }
    }
}
