package michalinafutkowska.materialy.threads.ex5;

import static java.lang.String.format;
import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.concurrent.CompletableFuture;

public class VolatileExample {

    volatile public static int counter = 0;

    public static void main(String[] args) {

        CompletableFuture.allOf(
                supplyAsync(() -> {
                    while (true) {
                        System.out.println(format("Ustawiam licznik na %s", ++counter));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }),
                supplyAsync(() -> {
                    int localCounter = counter;
                    while (true) {
                        if (localCounter != counter) {
                            System.out.println(format("Licznik zmienił wartość na: %s", localCounter = counter));
                        }
                    }
                })).join();
    }
}

