public class DelayTaskRunner extends AbstractClassRunner {


    public DelayTaskRunner(TaskRunner runner) {
        super(runner);
    }

    @Override
    public void executeOneTask() {

        try {
            super.executeOneTask();
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void executeAll() {
        while (getRunner().hasTask())
            executeOneTask();
    }
}

