package week08;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek, stack is empty.");
        }
        return top.data;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop, stack is empty.");
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        Node current = top;
        System.out.print("Bottom");
        while (current != null) {
            System.out.print(" || " + current.data);
            current = current.next;
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);

        stack.printStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
    }
}
