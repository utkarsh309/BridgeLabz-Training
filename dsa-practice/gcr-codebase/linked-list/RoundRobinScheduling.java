package linkedList;

// Node Class
class ProcessNode {

    // Attributes
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    // Next pointer
    ProcessNode next;

    // Constructor
    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

// Round Robin Scheduler Class
class RoundRobinScheduler {

    // Head pointer
    ProcessNode head;

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {

        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove process by ID
    public void removeProcess(int pid) {

        if (head == null)
            return;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.processId == pid) {

                if (curr == head) {
                    ProcessNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Simulate Round Robin Scheduling
    public void schedule(int timeQuantum) {

        if (head == null)
            return;

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = countProcesses();

        ProcessNode current = head;

        System.out.println("Round Robin Scheduling:");

        while (processCount > 0) {

            if (current.remainingTime > 0) {

                int executedTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executedTime;
                time += executedTime;

                System.out.println("Process " + current.processId +
                        " executed for " + executedTime + " units");

                if (current.remainingTime == 0) {
                    int turnaroundTime = time;
                    int waitingTime = turnaroundTime - current.burstTime;

                    totalTurnaroundTime += turnaroundTime;
                    totalWaitingTime += waitingTime;

                    removeProcess(current.processId);
                    processCount--;
                }
            }

            displayProcesses();
            current = current.next;
        }

        System.out.println("Average Waiting Time: " +(double) totalWaitingTime / countInitialProcesses);
        System.out.println("Average Turnaround Time: " +(double) totalTurnaroundTime / countInitialProcesses);
    }

    int countInitialProcesses;

    // Count processes
    public int countProcesses() {

        if (head == null)
            return 0;

        int count = 0;
        ProcessNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        countInitialProcesses = count;
        return count;
    }

    // Display processes
    public void displayProcesses() {

        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print("P" + temp.processId +"(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

// Main Class
public class RoundRobinScheduling {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        int timeQuantum = 3;

        scheduler.schedule(timeQuantum);
    }
}
