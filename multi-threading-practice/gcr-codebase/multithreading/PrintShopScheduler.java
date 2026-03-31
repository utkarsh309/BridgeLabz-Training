package multithreading;

//PrintJob 
class PrintJob implements Runnable {

 private String jobName;
 private int pages;

 PrintJob(String jobName, int pages) {
     this.jobName = jobName;
     this.pages = pages;
 }

 @Override
 public void run() {

     String priorityLabel;

     int priority = Thread.currentThread().getPriority();
     if (priority >= 8) {
         priorityLabel = "[High Priority]";
     } else if (priority >= 5) {
         priorityLabel = "[Medium Priority]";
     } else {
         priorityLabel = "[Low Priority]";
     }

     for (int i = 1; i <= pages; i++) {
         System.out.println(priorityLabel + " Printing "
                 + jobName + " - Page " + i + " of " + pages);

         try {
             Thread.sleep(100); // 100ms per page
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

     System.out.println(jobName + " completed\n");
 }
}

//MAIN
public class PrintShopScheduler {

 public static void main(String[] args) throws InterruptedException {

     System.out.println("Starting print jobs...\n");

     long startTime = System.currentTimeMillis();

     Thread job1 = new Thread(new PrintJob("Job1", 10), "Job1");
     Thread job2 = new Thread(new PrintJob("Job2", 5), "Job2");
     Thread job3 = new Thread(new PrintJob("Job3", 15), "Job3");
     Thread job4 = new Thread(new PrintJob("Job4", 8), "Job4");
     Thread job5 = new Thread(new PrintJob("Job5", 12), "Job5");

     // Set priorities
     job1.setPriority(5); // Medium
     job2.setPriority(8); // High
     job3.setPriority(3); // Low
     job4.setPriority(6); // Medium
     job5.setPriority(7); // High

     // Start jobs
     job1.start();
     job2.start();
     job3.start();
     job4.start();
     job5.start();

     // Wait for all jobs
     job1.join();
     job2.join();
     job3.join();
     job4.join();
     job5.join();

     long endTime = System.currentTimeMillis();

     System.out.println("All jobs completed in "
             + (endTime - startTime) + "ms");
 }
}

