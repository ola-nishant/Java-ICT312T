public class MyTask implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Doing task: " + i);
                Thread.sleep(1000); // Simulating work by sleeping
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class Interrupt {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyTask());
        myThread.start();
        
        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        myThread.interrupt(); // Interrupting the myThread
    }
}
 {
    
}
