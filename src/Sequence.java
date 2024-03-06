import java.util.Random;

public class Sequence {
    public static void SumOfSequence(int id, BreakThread breakThread, float step){
        float sum=0;
        int count=0;
        float currentValue=0;
        boolean isStop = false;
        do{
            sum += currentValue;
            count++;
            currentValue += step;
            isStop = breakThread.isCanBreak();
    } while (!isStop);
        System.out.println("Thread "+(id+1)+" sum of "+count+" elements equals "+sum);
    }
}
