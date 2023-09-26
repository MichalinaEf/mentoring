package org.mentoring.exercises;

public class Ex6 {

    public static void ex6(){
        System.out.println("Treść:");
        System.out.println("Czy poprawne jest poniższe dziedziczenie? Jak je zrefaktoryzujesz?\n");
        //public abstract class OSComponent {
        //    public abstract void allocate();
        //}
        //
        //public abstract class Process {
        //    public abstract void execute();
        //}
        //
        //public class WindowsProcess extends OSComponent, Process {
        //    @Override
        //    public void allocate() {
        //        // method's body
        //    }
        //
        //    @Override
        //    public void execute() {
        //        // method's body
        //    }
        //}
        //
        //public class LinuxProcess extends OSComponent, Process {
        //    @Override
        //    public void allocate() {
        //        // method's body
        //    }
        //
        //    @Override
        //    public void execute() {
        //        // method's body
        //    }
        //}
        System.out.println("Odpowiedź:");
        System.out.println("Ze względu na to, że w klasach abstrakcyjnych OSComponent oraz Process występują jedynie\n" +
                "metody abstrakcyjne zamiast klas abstrakcyjnych można użyć interfejsów. Wtedy klasy mogą implementować\n" +
                "kilka interfejsów. ");
        //interface OSComponent {
        //    public abstract void allocate();
        //}
        //
        //interface Process {
        //    public abstract void execute();
        //}
        //
        //public class WindowsProcess implements OSComponent, Process {
        //    @Override
        //    public void allocate() {
        //        // method's body
        //    }
        //
        //    @Override
        //    public void execute() {
        //        // method's body
        //    }
        //}
        //
        //public class LinuxProcess implements OSComponent, Process {
        //    @Override
        //    public void allocate() {
        //        // method's body
        //    }
        //
        //    @Override
        //    public void execute() {
        //        // method's body
        //    }
        //}
    }
}
