public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[queueSize];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue!");
        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done! Removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done! Removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
