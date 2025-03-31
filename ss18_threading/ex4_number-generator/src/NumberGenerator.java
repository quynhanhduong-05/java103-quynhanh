public class NumberGenerator implements Runnable {
    private Thread myThread;
    private String name;

    public NumberGenerator(String name, int priority) {
        this.name = name;
        myThread = new Thread(this);
        myThread.setPriority(priority);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.name + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
        System.out.println("My thread finished");
    }
}
