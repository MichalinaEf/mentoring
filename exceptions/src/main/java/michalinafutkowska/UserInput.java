package michalinafutkowska;

import michalinafutkowska.exceptions.OutOfRangeException;
import michalinafutkowska.exceptions.StringIsNullException;

import java.util.Scanner;

public class UserInput {

    private Scanner sc = new Scanner(System.in);

    public FileHandler createFile()  {


        System.out.println("Enter a file path");
        String filePath = sc.nextLine();
        if(filePath == null) {
            throw new StringIsNullException("You didn't enter a file path");
        }

        System.out.println("Enter number of Connectors, is in range 0>n>=10 ");
        int noConnectors = sc.nextInt();
        sc.nextLine();
        if (noConnectors < 0 || noConnectors > 10){
            throw new OutOfRangeException("number of Connectors is out of range");
        }
        System.out.println("Enter max file size (number must be in range 1000>=n>=9999");
        int fileSize = sc.nextInt();
        sc.nextLine();
        if (fileSize < 1000 || fileSize > 9999){
            throw new OutOfRangeException("file size is out of range");
        }
        sc.close();

        return new FileHandler(filePath, noConnectors, fileSize);
    }


}
