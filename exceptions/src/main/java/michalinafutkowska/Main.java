package michalinafutkowska;

import michalinafutkowska.exceptions.OutOfRangeException;
import michalinafutkowska.exceptions.StringIsNullException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        FileHandler fileHandler;

        try {
            fileHandler = userInput.createFile();
        } catch (StringIsNullException | OutOfRangeException e){
            System.err.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("You entered wrong data type.");
        }

//        System.out.println("A file was successfully created!");

//        List<Integer> list = List.of(1,2,3,4,5,6);
//        int wybrane = 6;
//        try {
//            list.get(wybrane);
//        } catch (ArrayIndexOutOfBoundsException e){
//            throw new  OutOfRangeException
//        }

    }


}