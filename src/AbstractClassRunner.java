public abstract class AbstractClassRunner implements TaskRunner{
    private TaskRunner runner;

    public AbstractClassRunner(TaskRunner runner) {
        this.runner = runner;
    }

    public TaskRunner getRunner() {
        return runner;
    }

    public void setRunner(TaskRunner runner) {
        this.runner = runner;
    }

    public void executeOneTask(){
        runner.executeOneTask();
    }

    public void executeAll(){
        runner.executeAll();
    }

    public void addTask(Task task){
        runner.addTask(task);
    }

    public boolean hasTask(){
        return runner.hasTask();
    }

}
