public class StackContainer implements Container {

    private Task[] tasks;
    private int s;
    private int cap;


    public StackContainer() {
        tasks = new Task[5];
        s=0;
        cap = 5;

    }

    public void ensureCapacity(){
        if(s<cap)
            return;
        Task[] tasks1 = new Task[cap*2];
        for(int i = 0 ;i<s;i++)
            tasks1[i] = tasks[i];

        cap*=2;
        tasks = tasks1;
    }


    @Override
    public Task remove() {
        if(s==0) {
            System.out.println("Nu exista taskuri!");
            return null;
        }

        Task task = tasks[s-1];
        tasks[s-1] = null;
        s--;
        return task;
    }

    @Override
    public void add(Task task) {
        ensureCapacity();

        tasks[s++] = task;
    }

    @Override
    public int size() {
        return s;
    }

    @Override
    public boolean isEmpty() {
        return s==0;
    }
}
