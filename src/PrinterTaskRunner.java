import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrinterTaskRunner extends AbstractClassRunner{


    public PrinterTaskRunner(TaskRunner runner) {
        super(runner);
    }
    @Override
    public void executeOneTask(){
        super.executeOneTask();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dateTime.format(formatter) + " " + "Done");
    }

    @Override
    public void executeAll() {
        while (getRunner().hasTask())
            executeOneTask();
    }


}
