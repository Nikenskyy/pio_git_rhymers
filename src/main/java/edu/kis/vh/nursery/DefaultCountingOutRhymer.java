package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] stack = new int[12];

    public int count = -1;

    public void countIn(int in) {
        if (!isFull())
            stack[++count] = in;
    }

    public boolean callCheck() {
        return count == -1;
    }

    public boolean isFull() {
        return count == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return stack[count];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return stack[count--];
    }

}
