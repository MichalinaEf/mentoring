package michalinafutkowska.materialy.threads.ex4;

import static java.lang.String.format;
import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.concurrent.CompletableFuture;

public class NonVolatileExample {

    public static int counter = 0;

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
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    while (true) {
                        if (localCounter != counter) {
                            System.out.println(format("Licznik zmienił wartość na: %s", localCounter = counter));
                        }
                    }
                })).join();
    }
}

