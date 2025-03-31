public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 1;
        while (true) {
            number++;
            if (isPrimeOptimized(number)) {
                System.out.println("Optimized method found prime: " + number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeOptimized(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
