package michalinafutkowska.materialy.threads.ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ex3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedMethods summation = new SynchronizedMethods();

        IntStream.range(0, 20)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println("--------------------------------------------");
        IntStream.range(0, 20)
                .forEach(count -> service.submit(summation::calculateSync));

        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("--------------------------------------------");
        IntStream.range(0, 20)
                .forEach(count -> service.submit(summation::calculateSyncInVar));

        service.awaitTermination(2, TimeUnit.SECONDS);

    }
}

class SynchronizedMethods {
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int sum = 0;

    public void calculate() {
        setSum(getSum() + 1);
        System.out.println(getSum());
    }

    public synchronized void calculateSync() {
        setSum(getSum() + 1);
        System.out.println(getSum());
    }

    public void calculateSyncInVar() {
        synchronized (this) {
            setSum(getSum() + 1);
        }
        System.out.println(getSum());
    }

}

