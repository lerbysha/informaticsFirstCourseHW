import java.lang.Runnable;
import java.util.Scanner;

public class ConsoleUserInteractor implements Runnable {
    private Scanner scin;
    private Stopwatch stWatch;

    public ConsoleUserInteractor(Stopwatch stWatch) {
        this.scin = new Scanner(System.in);
        this.stWatch = stWatch;
    }

    public void run() {
        while (true) {
            String in = scin.next();

            if (in.equals("tick")) {
                System.out.println(stWatch.getTick());
            }
        }
    }
}