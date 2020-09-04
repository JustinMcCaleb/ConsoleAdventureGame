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

    //switch case for left or right


    Player hero;
    Villain villain;

    private void gameFlow(){
        System.out.println("You wake up in an unfamiliar room. \n Confused with a pounding head you decide to sit up. \n What do you do next?");





    }




    public static void main(String[] args) {

    }

}
