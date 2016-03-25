package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.control.GameControl;
import byui.cit260.LeavingPlanetEarth.view.ErrorView;
import leaving.planet.earth.LeavingPlanetEarth;

// aly_cheers17
public class MainMenuView extends View {
    // This view displays the main menu of the game

    public MainMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Main Menu                    |"
                + "\n--------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case
        char menuChar = choice.charAt(0); // get the first character entered

        switch (menuChar) {
            case 'N':       // create and start a new game
                this.startNewGame();
                break;
            case 'G':       // get and start an existing game
                this.startExistingGame();
                break;
            case 'H':       // display the help menu
                this.displayHelpMenu();
                break;
            case 'S':       // save the current game
                this.saveGame();
                break;
            case 'Q':       // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {

        GameControl.createNewGame(LeavingPlanetEarth.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startSavedGame() {
        
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game " 
                                + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(LeavingPlanetEarth.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

}
