public class RunApplication {

    static UserInput in = new UserInput();

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        String userString = in.getString();

        System.out.println("You entered: " + userString);
    }

}
