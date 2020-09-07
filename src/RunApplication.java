import characters.Player;
import characters.Villain;

import java.util.Random;

public class RunApplication {

    static UserInput in = new UserInput();
    static Random randomNum = new Random();

    //method that gives a number between 1-10 for attack probability
    static int attackProbability(){
        return randomNum.nextInt(10);
    }


    //house pets array
    static String[] housePets = {
            "Dog",
            "Cat",
            "Lizard",
            "Bird",
            "Snake"
    };

    //animals array
    static String[] animals = {
            "Deer",
            "Bear",
            "Racoon",
            "Squirrel",
            "Rabbit",
            "Bigfoot"
    };


    //switch case for left or right
//    static void leftOrRight(String input){
//        switch (input){
//            case "left":
//        }
//    }

    //switch case for 2 options
    static void switchTwo(int input, String option1, String option2){
        switch (input){
            case 1:
                System.out.println(option1);
                break;
            case 2:
                System.out.println(option2);
                break;
        }
    }

    Player hero;
    Villain villain;

    static void gameFlow(){
        System.out.println("You wake up in an unfamiliar room.\nConfused with a pounding head you decide to sit up.\nWhat do you do next?");

        System.out.println("[1] Go back to sleep\n[2]Get out of bed");

        if(in.getInt() == 1){
            System.out.println("Everything fades to black... you never wakeup");
        }else {
            System.out.println("As you stand up you feel a shooting pain from your left ankle and fall to the ground\nYou look down and see a bruised and swollen ankle. ");

        }



    }




    public static void main(String[] args) {
        gameFlow();
    }

}
