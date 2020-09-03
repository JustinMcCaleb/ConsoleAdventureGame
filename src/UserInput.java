import java.util.Scanner;

public class UserInput {

    //properties
    private Scanner scanner;

    //constructor
    public UserInput(){this.scanner = new Scanner(System.in);}

    //methods
    public String getString(){
        return this.scanner.nextLine();
    }

    public int getInt(){
        return this.scanner.nextInt();
    }
}
