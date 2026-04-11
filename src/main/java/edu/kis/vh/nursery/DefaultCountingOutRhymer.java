package edu.kis.vh.nursery;

/**
  klasa zapewnnia funkcjonalnosc stosu
 */
public class DefaultCountingOutRhymer {

    private static final int STACK_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int LAST_INDEX = STACK_SIZE - 1;


    private final int[] stack = new int[STACK_SIZE];

    private int count = EMPTY;

    public int getTotal() {
        return count;
    }/**
     * Metoda dodaje nową wartość do stosu, jeśli nie jest on pełny.
     * @param in wartość do dodania
     */
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
