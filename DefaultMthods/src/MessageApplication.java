public class MessageApplication {
    private final Object lock = new Object();
    private boolean conditionMet = false;

    public void waitForCondition() throws InterruptedException {
        synchronized (lock) {
            while (!conditionMet) {
                System.out.println(Thread.currentThread().getName() + " is waiting...");
                lock.wait();
            }
            System.out.println(Thread.currentThread().getName() + " has been notified.");
        }
    }

    public void notifyCondition() {
        synchronized (lock) {
            System.out.println("Notifying a waiting thread...");
            conditionMet = true;
            lock.notify();
        }
    }

    public static void main(String[] args) {
    	MessageApplication example = new MessageApplication();

        Thread waitingThread = new Thread(() -> {
            try {
                example.waitForCondition();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "WaitingThread");

        Thread notifyingThread = new Thread(() -> {
            example.notifyCondition();
        }, "NotifyingThread");

        waitingThread.start();
        notifyingThread.start();
    }
}




