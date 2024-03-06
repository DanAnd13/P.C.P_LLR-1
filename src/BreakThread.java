public class BreakThread implements Runnable{
    public BreakThread breakThread;
    private boolean canBreak = false;
    @Override
    public void run() {
        try {
            Thread.sleep(50*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    synchronized public boolean isCanBreak() {
        return canBreak;
    }
}
