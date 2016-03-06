package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;
import byui.cit260.LeavingPlanetEarth.control.GameControl;
import java.util.Scanner;

/**
 * @author aly_cheers17
 */
public class StartProgramView implements ViewInterface {

    public StartProgramView() {
    }

    @Override
    public void display() {
        this.displayBanner(); // display the introductory banner message
        String playersName = this.getInput();
        this.doAction(playersName);
    }

    public void displayBanner() {

        System.out.println(
                "\n**********************************************"
                + "\n* Welcome to Leaving Planet Earth.           *"
                + "\n* The year is 2072, and the planet is dying, *"
                + "\n* and you need to leave so that you don't    *"
                + "\n* die with it                                *"
                + "\n*                                            *"
                + "\n* Collect your supplies for the journey,     *"
                + "\n* build your own rocket ship, and travel     *"
                + "\n* to a new planet for a new life. Good luck! *"
                + "\n**********************************************"
        );
    }

    @Override
    public String getInput() {
        boolean valid = false;  // flag variable for accurate input
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) {  // keep asking until a valid player name is entered
            System.out.println("Enter the player's name below: ");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 3) {
                System.out.println("Invalid name");
                continue; // continue with the loop
            }
            break;  // finish the loop - a valid name was entered.
        }
        return playersName;
    }

    public void displayStartProgramView(Player player) {

        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tGood luck on your journey!");
        System.out.println("=============================================");

    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.toUpperCase().equals("Q")) // user wants to quit
        {
            return true; // which exits the game
        }
        Player player = GameControl.createPlayer(playersName);

        // Display a personalized welcome message
        this.displayStartProgramView(player);

        // Display the Main menu.
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;

    }
}
