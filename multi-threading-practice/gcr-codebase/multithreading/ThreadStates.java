package multithreading;

import java.time.LocalTime;

//  TaskRunner 
class TaskRunner implements Runnable {

    public void run() {

        // RUNNABLE 
        for (int i = 0; i < 1000000; i++) {
            // doing work
        }

        // TIMED_WAITING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

// Main class
public class ThreadStates {

    public static void main(String[] args) throws InterruptedException {

        Thread task1 = new Thread(new TaskRunner(), "Task-1");
        Thread task2 = new Thread(new TaskRunner(), "Task-2");

        // NEW state
        System.out.println("[Monitor] " + task1.getName()
                + " is in " + task1.getState() + " state at " + LocalTime.now());
        System.out.println("[Monitor] " + task2.getName()
                + " is in " + task2.getState() + " state at " + LocalTime.now());

        task1.start();
        task2.start();

        // Monitor until both threads finish
        while (task1.isAlive() || task2.isAlive()) {

            System.out.println("[Monitor] " + task1.getName()
                    + " is in " + task1.getState() + " state at " + LocalTime.now());
            System.out.println("[Monitor] " + task2.getName()
                    + " is in " + task2.getState() + " state at " + LocalTime.now());

            Thread.sleep(500); // check every 500ms
        }

        // TERMINATED state
        System.out.println("[Monitor] " + task1.getName()
                + " is in " + task1.getState() + " state at " + LocalTime.now());
        System.out.println("[Monitor] " + task2.getName()
                + " is in " + task2.getState() + " state at " + LocalTime.now());

        System.out.println("Summary: Both tasks completed");
    }
}
