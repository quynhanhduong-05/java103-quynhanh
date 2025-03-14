public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(1);
        solution.enQueue(2);
        solution.enQueue(3);

        solution.printQueue();

        solution.deQueue();
        solution.printQueue();

        solution.deQueue();
        solution.printQueue();
    }
}