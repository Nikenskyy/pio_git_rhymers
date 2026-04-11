package edu.kis.vh.nursery;

/**
 * Klasa zapewnia podstawową funkcjonalność stosu dla wyliczanek.
 */
public class DefaultCountingOutRhymer {

    private static final int STACK_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int LAST_INDEX = STACK_SIZE - 1;

    private final int[] stack = new int[STACK_SIZE];
    private int count = EMPTY;

    /**
     * Zwraca aktualną wartość licznika elementów na stosie.

     */
    public int getTotal() {
        return count;
    }

    /**
     * Dodaje nową wartość na szczyt stosu, jeśli nie jest on pełny.

     */
    public void countIn(int in) {
        if (!isFull())
            stack[++count] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.

     */
    public boolean callCheck() {
        return count == EMPTY;
    }

    /**
     * Sprawdza, czy stos osiągnął maksymalną pojemność.

     */
    public boolean isFull() {
        return count == LAST_INDEX;
    }

    /**
     * Zwraca wartość ze szczytu stosu bez jej usuwania.

     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return stack[count];
    }

    /**
     * Usuwa i zwraca wartość znajdującą się na szczycie stosu.

     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return stack[count--];
    }

}