package task4prioritydemo;

public class Task4PriorityDemo {
    
    static class PriorityTask extends Thread {
        public PriorityTask(String name) {
            super(name);
        }
    @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println( getName() + " | Priority: " + getPriority() + " | Count: " + i);
            }
        }
    }
    public static void main(String[] args) {
        PriorityTask low = new PriorityTask("LowPriorityThread");
        PriorityTask high = new PriorityTask("HighPriorityThread");

        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        
        low.start();
        high.start();
    }
}