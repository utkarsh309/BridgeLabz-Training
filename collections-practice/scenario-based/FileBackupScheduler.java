package scenario;

import java.util.PriorityQueue;

//Custom Exception
class InvalidBackupPathException extends Exception {
 public InvalidBackupPathException(String msg) {
     super(msg);
 }
}

//BackupTask class 
class BackupTask implements Comparable<BackupTask> {

 String path;
 int priority;   

 public BackupTask(String path, int priority) throws InvalidBackupPathException {

     if (path == null || path.trim().isEmpty()) {
         throw new InvalidBackupPathException("Invalid backup path!");
     }

     this.path = path;
     this.priority = priority;
 }

 // Sorting based on priority (descending)
 public int compareTo(BackupTask other) {
     return other.priority - this.priority;
 }
}

//Main class
public class FileBackupScheduler {

 public static void main(String[] args) {

     PriorityQueue<BackupTask> queue = new PriorityQueue<>();

     try {
         queue.add(new BackupTask("C:/ImportantFiles", 3)); // high priority
         queue.add(new BackupTask("D:/Movies", 1));         // low priority
         queue.add(new BackupTask("E:/Projects", 2));       // medium priority

         // queue.add(new BackupTask("", 2));  

     } catch (InvalidBackupPathException e) {
         System.out.println(e.getMessage());
     }

     // Execute tasks in priority order
     System.out.println("Executing backup tasks:");

     while (!queue.isEmpty()) {
         BackupTask task = queue.poll();
         System.out.println("Backing up: " + task.path +
                            " (Priority: " + task.priority + ")");
     }
 }
}
