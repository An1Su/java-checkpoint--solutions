package TodoList;

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList(int capacity){
        this.capacity = capacity;
        tasks = new Task[capacity];
        count = 0;
    }

    public void addTask(String description){
        if (count >= capacity || description == null || description.length() > 30) return;
        tasks[count++] = new Task(description);
    }

    public void setStatus(int index, TaskStatus status){
        if (index < 0 || index >= count) return;
        tasks[index].setStatus(status);
    }

    public void setDescription(int index, String newDescription){
        if (index < 0 || index >= count || newDescription == null || newDescription.length() > 30) return;
        tasks[index].setDescription(newDescription);
    }

    public void displayTasks() {
            System.out.print("Tasks:\n");
            for (int i = 0; i < count; i++) {
                String desc = tasks[i].getDescription();
                System.out.printf("%-33s | %s%n", desc, tasks[i].getStatus());
            }
    }
}