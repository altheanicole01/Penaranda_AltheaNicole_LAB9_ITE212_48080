package task2runnabledemo;

public class Task2RunnableDemo {
    static class DownloadTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Downloading file - " + i);
            }
        } 
    }

    public static void main(String[] args) {
        DownloadTask task = new DownloadTask();
        Thread downloadThread = new Thread(task);
        downloadThread.start();
        System.out.println("Download process started.");
    }
}