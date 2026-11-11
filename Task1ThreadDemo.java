package task1threaddemo;

public class Task1ThreadDemo {
    
    static class MessageThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Java Thread is Running - " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        MessageThread thread = new MessageThread();
        thread.start();
        System.out.println("Main method continues.");
    }
}