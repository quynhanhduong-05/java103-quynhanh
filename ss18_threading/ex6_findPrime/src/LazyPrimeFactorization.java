public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 1;
        while (true) {
            number++;
            if (isPrimeLazy(number)) {
                System.out.println("Lazy method found prime: " + number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeLazy(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
