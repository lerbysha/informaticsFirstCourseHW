import java.lang.Runnable;

public class Stopwatch implements Runnable{
    private int tick = 0;

    public void run() {
        while (true) {
            this.tick++;

             System.out.println(this.tick);
        }

    }

    public Stopwatch(){
        this.tick = 0;
    }

    public int getTick(){
        return this.tick;
    }

    public void setTick(int tick){
        this.tick = tick;
    }
}
