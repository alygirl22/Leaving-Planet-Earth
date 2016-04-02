/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.view;

import java.util.Scanner;

/**
 *
 * @author aly_cheers17
 */
public class BuildRocketView {

    private String promptMessage;

    public BuildRocketView() {

        this.promptMessage = "\nPlease enter your rocket pieces";
        // display the banner when view is created
        this.displayRocketExplanation();
    }
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BuildRocketView.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BuildRocketView.inFile = inFile;
    }
    
    
    private void displayBanner() {

        System.out.println(
                "\n***************************************************"
                + "\n* In order to build your rocket, you will need: *"
                + "\n* 1 - 6 engines,                                *"
                + "\n* 1 - 60 gasoline,                              *"
                + "\n* 1 - 4 wings,                                  *"
                + "\n* 1 - 10 paint,                                 *"
                + "\n* 1 - 50 oil,                                   *"
                + "\n*************************************************"
        );
    }

    public void displayBuildRocketView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get player's rocket pieces
            String RocketPieces = this.getRocketPieces();
            if (RocketPieces.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(RocketPieces);

        } while (!done);

    }

    private String getRocketPieces() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // player's resources to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String RocketPieces) {

        if (RocketPieces.length() < 5 || RocketPieces.length() > 130) {
            System.out.println("\nInvalid Rocket Piece number: "
                    + "Rocket Pieces cannot be below 5 or over 130");
            return false;
        }
        return true;
    }

    private void displayRocketPiecesExplanation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void displayRocketExplanation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
