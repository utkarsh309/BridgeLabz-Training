package annotations.taskannotation;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Utkarsh")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}
