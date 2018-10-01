import java.util.LinkedList;

public class Stack {
    private final LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public Stack(final LinkedList<Integer> initState) {
        this.stack=initState;
    }

    public void push(final int number) {
        stack.add(0,number);
    }

    public Integer pop() {
        return stack.remove(0);
    }

    public Stack filter(StackPredicate filter) {
        LinkedList<Integer> initSate = new LinkedList<>();
        for(Integer integer : stack) {
            if(filter.isValid(integer)) {
                initSate.add(integer);
            }
        }
        return new Stack(initSate);
    }
}

