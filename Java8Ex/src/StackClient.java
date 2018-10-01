public class StackClient {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for(int i=1;i<=10;i++) {
            stack.push(i);
        }
        Stack filtered = stack.filter(i -> i%2==0);
        System.out.println(filtered.pop());
        System.out.println(filtered.pop());

        Stack filter2 = stack.filter(i -> true);

        System.out.println(filter2.pop());
        System.out.println(filter2.pop());
        System.out.println(filter2.pop());
    }

}
