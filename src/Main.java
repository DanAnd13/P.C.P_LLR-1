import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Random random = new Random();
        int countThread=5;
        float step=2;
        BreakThread breakThread = new BreakThread();
        for (int i = 0; i < countThread; i++) {
            new ThreadClass(i, breakThread,step).start();
            //step += random.nextFloat(2)+0.2;
        }
        new Thread(breakThread).start();
    }
}