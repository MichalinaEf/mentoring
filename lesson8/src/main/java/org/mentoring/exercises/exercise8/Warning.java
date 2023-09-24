package org.mentoring.exercises.exercise8;

public class Warning {

    private static final String warning = "Watch out! Warning here!";

    public String getWarning() {
        return warning;
    }

    public static void execute(){
        System.out.println(warning);
    }
}
