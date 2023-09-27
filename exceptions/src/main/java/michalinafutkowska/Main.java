package michalinafutkowska;

import michalinafutkowska.exceptions.OutOfRangeException;
import michalinafutkowska.exceptions.StringIsNullException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        FileHandler fileHandler;

        try {
            fileHandler = userInput.createFile();
        } catch (StringIsNullException e){
            System.err.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("You entered wrong data type.");
        } catch (OutOfRangeException e){
            System.err.println(e.getMessage());
        }

//        System.out.println("A file was successfully created!");

    }


}