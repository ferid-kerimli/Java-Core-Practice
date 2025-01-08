package week10;

import java.util.EmptyStackException;

public class StackEnhanced<E> {
    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int top;
    public StackEnhanced() {
        elements = new Object[MAX_SIZE];
        top = -1;
    }

    public void push(E item) throws StackFullException {
        if (top == MAX_SIZE - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = item;
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        @SuppressWarnings("Unchecked")
        E item = (E) elements[top];
        elements[top--] = null;
        return item;
    }

    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        @SuppressWarnings("Unchecked")
        E item = (E) elements[top];
        return item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public int size() {
        return top + 1;
    }

    public static class StackFullException extends Exception {
        public StackFullException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        StackEnhanced<Integer> stack = new StackEnhanced<>();

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack size: " + stack.size());

            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }

            // Attempting to pop from an empty stack will raise an EmptyStackException
            // stack.pop();

            // Attempting to peek from an empty stack will raise an EmptyStackException
            // stack.peek();

            // Attempting to push to a full stack will raise a StackFullException
            // stack.push(40);

        } catch (StackFullException | EmptyStackException e) {
            e.printStackTrace();
        }
    }
}
