class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

public class SimpleSync {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c1.increment();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c1.increment();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        
        System.out.println("Final Count: " + c1.getCount());
    }
}