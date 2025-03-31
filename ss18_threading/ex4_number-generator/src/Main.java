public class Main {
    public static void main(String[] args) {
        NumberGenerator counter1 = new NumberGenerator("A", Thread.MIN_PRIORITY);
        NumberGenerator counter2 = new NumberGenerator("B", Thread.MAX_PRIORITY);
    }
}