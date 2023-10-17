package michalinafutkowska.materialy.threads.ex1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        New State - not yet been run and the execution process is not yet initiated.
//        Active State
//        Waiting/Blocked State
//        Timed Waiting State
//        Terminated State

        MyThread t1 = new MyThread();



        System.out.println("0" + t1.getState());

        // Invoking Thread using start() method
        t1.start();

        int i = 0;
        while(t1.isAlive()){
            if(i==100000000) {
                System.out.println("3"+ t1.getState());

            }
            i++;

        }

        Integer result = System.in.read();



        System.out.println(t1.getState());


        System.out.println(t1.getState());

    }

}




class MyThread extends Thread {
    // initiated run method for Thread
    @Override
    public void run(){
        System.out.println("1" + this.getState());
        try {
            Thread.sleep(10000);
            System.out.println("2" + this.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}