public class Run {
    public static void main(String[] args) {
        Stopwatch time = new Stopwatch();
        ConsoleUserInteractor consUser = new ConsoleUserInteractor(time);
        Thread th1 = new Thread(time);
        Thread th2 = new Thread(consUser);

        try {
            th1.sleep(1000);
            th2.sleep(1000);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th2.start();
        th1.start();
    }
}
