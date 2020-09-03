public class RunApplication {

    static UserInput in = new UserInput();

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        String userString = in.getString();
        System.out.println("You entered: " + userString);

        System.out.println("Enter a number: ");
        int userInt = in.getInt();
        System.out.println(userInt);
    }

}
