import java.util.Random;

public class ThreadClass extends Thread{
    int id;
    BreakThread breakThread;
    float step;

    public ThreadClass(int id, BreakThread breakThread, float step) {
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
    }
    @Override
    public void run() {
            Sequence.SumOfSequence(id,breakThread,step);
    }
}
