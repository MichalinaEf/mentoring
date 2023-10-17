package michalinafutkowska.materialy.threads.ex6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("abcd");
        };


        Executor executor = Executors.newFixedThreadPool(8);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);
        executor.execute(runnable2);

    }
}
