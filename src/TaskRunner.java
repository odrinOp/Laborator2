public interface TaskRunner {
    void executeOneTask();
    void executeAll();
    void addTask(Task task);
    boolean hasTask();
}



