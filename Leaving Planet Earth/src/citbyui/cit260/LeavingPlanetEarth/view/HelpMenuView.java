package citbyui.cit260.LeavingPlanetEarth.view;

/**
 * @author aly_cheers17
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Help Menu                     |"
                + "\n--------------------------------"
                + "\nO - Objective of the game"
                + "\nM - How to move in the game"
                + "\nF - How to find pieces of the rocket"
                + "\nR - Return to main menu"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();        // convert to all upper case
        char choice = value.charAt(0);      //convert choice to upper case

        switch (choice) {
            case 'O': // objective of the game
                this.displayObjective();
                break;
            case 'M': // show moves in game
                this.displayMove();
                break;
            case 'B': // display how to build shelter
                this.displayBuildShelter();
                break;
            case 'F': // display how to get food and tools for game
                this.displayHowToFindPieces();
                break;
            case 'R': // display main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void displayObjective() {
        System.out.println("\n\nThe objective of the game is  ... ");
    }

    private void displayMove() {
        System.out.println(" ... how to move directions");
    }

    private void displayBuildShelter() {
        System.out.println("**sdfasdfed ***");
    }

    private void displayHowToFindPieces() {
        System.out.println("*** dsdafsdafled ***");
    }

    private void displayMainMenu() {
        System.out.println("*** displayMainMenu function called ***");
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

}
