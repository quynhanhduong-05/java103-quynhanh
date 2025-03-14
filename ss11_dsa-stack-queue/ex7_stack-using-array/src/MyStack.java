import java.util.*;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void push (int element) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        boolean status = false;
        if (index == 0) {
            status = true;
        }
        return status;
    }

    public boolean isFull() {
        boolean status = false;
        if (index == size) {
            status = true;
        }
        return status;
    }
}
