public class Solution {
    private Queue queue;
    private int size = 0;

    public Solution() {
        this.queue = new Queue();
    }
    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.queue.front == null) {
            this.queue.front = this.queue.rear = temp;
            size++;
        } else {
            this.queue.rear.link = temp;
            this.queue.rear = temp;
            this.queue.rear.link = this.queue.front;
            size++;
        }
    }

    public void deQueue() {
        if (this.queue.front == null) {
            return;
        } else {
            if (this.queue.front == this.queue.rear) {
                this.queue.front = this.queue.rear = null;
                size--;
            } else {
                this.queue.front = this.queue.front.link;
                this.queue.rear.link = this.queue.front;
                size--;
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public void printQueue () {
        if (this.queue.front == null) {
            return;
        }
        Node temp = this.queue.front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != this.queue.front);
        System.out.println();
    }
}
