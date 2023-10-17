package michalinafutkowska.materialy.threads.ex7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<String> runnable2 = new Callable() {
            @Override
            public String call() throws Exception {

                Thread.sleep(10000);
                return "helloWorldCallable";
            }
        };




        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(runnable2);
        Future<String> future2 = executorService.submit(runnable2);
        Future<String> future3= executorService.submit(runnable2);
//        Future<String> future2 = executorService.submit(() -> "Hello World2");
// some operations



        String result = future.get();
        System.out.println(future2.get());
        System.out.println(result);

    }
}
