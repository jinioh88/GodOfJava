import java.util.Arrays;
import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
    }

    public void checkPeek() {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<5;i++) {
            stack.push(i);
        }
        for(int i=0;i<5;i++) {
            System.out.println(stack.pop());
        }
        Integer[] arr = stack.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
