public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory factory;

    private TaskContainerFactory(){}


    public static TaskContainerFactory getInstance(){
        if(factory == null)
            factory = new TaskContainerFactory();
        return factory;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        if(strategy == Strategy.FIFO)
            return new QueueContainer();
        else
            return new StackContainer();
    }
}
