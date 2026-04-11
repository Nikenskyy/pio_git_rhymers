package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int LAST_INDEX = STACK_SIZE - 1;


    private final int[] stack = new int[STACK_SIZE];

    private int count = EMPTY;

    public int getTotal() {
        return count;
    }
    public void countIn(int in) {
        if (!isFull())
            stack[++count] = in;
    }

    public boolean callCheck() {
        return count == EMPTY;
    }

    public boolean isFull() {
        return count == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return stack[count];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return stack[count--];
    }

}
