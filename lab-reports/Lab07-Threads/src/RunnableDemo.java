class MyRunnable implements Runnable {
    private String name;
    MyRunnable(String str) {
        name = str;
    }
    
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " finished");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("Runnable 1");
        MyRunnable r2 = new MyRunnable("Runnable 2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}