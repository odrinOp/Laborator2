import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {

        if(args.length == 0)
            System.out.println("Argument invalid");
        else {
            Strategy strategy = Strategy.valueOf(args[0]);
            StrategyTaskRunner runner = new StrategyTaskRunner(strategy);
            runner.addTask(new MessageTask("1", "ab", "Hello 1", "Odrin", "Iustin", LocalDateTime.of(2019, 3, 5, 2, 13)));
            runner.addTask(new MessageTask("2", "abc", "Hello 2", "Odrin", "Iustin", LocalDateTime.of(2019, 4, 6, 3, 20)));
            runner.addTask(new MessageTask("3", "abd", "Hello 3", "Odrin", "Iustin", LocalDateTime.of(2019, 5, 15, 4, 23)));
            runner.addTask(new MessageTask("4", "abe", "Hello 4", "Odrin", "Iustin", LocalDateTime.of(2019, 6, 16, 5, 33)));
            runner.addTask(new MessageTask("5", "abf", "Hello 5", "Odrin", "Iustin", LocalDateTime.of(2019, 7, 25, 6, 43)));
            runner.addTask(new MessageTask("6", "abg", "Hello 6", "Odrin", "Iustin", LocalDateTime.of(2019, 10, 26, 7, 53)));


            DelayTaskRunner delayTaskRunner = new DelayTaskRunner(runner);
            PrinterTaskRunner printerTaskRunner = new PrinterTaskRunner(runner);
            printerTaskRunner.executeAll();
        }








    }
}
