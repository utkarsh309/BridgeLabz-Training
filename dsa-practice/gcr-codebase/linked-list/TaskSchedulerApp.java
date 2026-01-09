package linkedList;

// Node Class
class TaskNode {

    // Attributes
    int taskId;
    String taskName;
    int priority;
    String dueDate;

    // Next pointer
    TaskNode next;

    // Constructor
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

// Task Scheduler Class
class TaskScheduler {

    // Head pointer
    TaskNode head;

    // Insert at beginning
    public void insertAtBeginning(int taskId, String taskName,int priority, String dueDate) {

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int taskId, String taskName,int priority, String dueDate) {

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at specific position
    public void insertAtPosition(int taskId, String taskName,int priority, String dueDate, int position) {

        if (position == 1) {
            insertAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete task by ID
    public void deleteByTaskId(int taskId) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == taskId) {

                if (curr == head) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Task deleted");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewAndMoveNext() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(head);
        head = head.next;
    }

    // Search by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority");
        }
    }

    // Display all tasks
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            System.out.println();
            temp = temp.next;
        } while (temp != head);
    }

    // Display single task
    private void displayTask(TaskNode node) {
        System.out.println("Task ID: " + node.taskId);
        System.out.println("Task Name: " + node.taskName);
        System.out.println("Priority: " + node.priority);
        System.out.println("Due Date: " + node.dueDate);
    }
}

// Main Class
public class TaskSchedulerApp {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.insertAtEnd(1, "Coding", 1, "10-02-2026");
        scheduler.insertAtEnd(2, "Testing", 2, "12-02-2026");
        scheduler.insertAtBeginning(3, "Design", 1, "08-02-2026");
        scheduler.insertAtPosition(4, "Documentation", 3, "15-02-2026", 2);

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("Current Task:");
        scheduler.viewAndMoveNext();

        System.out.println("Next Task:");
        scheduler.viewAndMoveNext();

        System.out.println("Search by Priority 1:");
        scheduler.searchByPriority(1);

        scheduler.deleteByTaskId(2);

        System.out.println("Final Task List:");
        scheduler.displayAllTasks();
    }
}
