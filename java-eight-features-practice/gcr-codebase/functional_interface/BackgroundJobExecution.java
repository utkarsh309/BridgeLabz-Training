package functional_interface;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Background task
        Runnable backgroundTask = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println("Background task finished.");
        };

        // Run task asynchronously
        Thread thread = new Thread(backgroundTask);
        thread.start();

        // Main thread continues
        System.out.println("Main thread is running...");
    }
}