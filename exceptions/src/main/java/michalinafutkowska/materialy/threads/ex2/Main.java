package michalinafutkowska.materialy.threads.ex2;

import java.io.IOException;

public class Main {

    static Integer result;
    public static void main(String[] args) throws InterruptedException {


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {

                try {
                    result = System.in.read();
                    System.out.println(result);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Thread t1 = new Thread(runnable2);

        t1.start();


    }
}
