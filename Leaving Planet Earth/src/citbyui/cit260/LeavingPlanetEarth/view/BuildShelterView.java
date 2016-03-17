/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

import java.util.Scanner;

/**
 *
 * @author Curtis
 */
public class BuildShelterView extends View {
    
    private String promptMessage;

    public BuildShelterView() {

        this.promptMessage = "\nPlease enter your resources";
        // display the banner when view is created
        this.displayShelterExplanation();
    }

    private void displayBanner() {

        System.out.println(
                "\n**********************************************"
                + "\n* In order to build your shelter, you will need: *"
                + "\n* 1 - 4 tarps,                                            *"
                + "\n* 1 - 5 hammers,                                       *"
                + "\n* 4 - 10 sticks,                                          *"
                + "\n* 2 - 6 ropes,                                            *"
                + "\n* 1 - 5 axes,                                             *"
                + "\n* 1 - 5 drills.                                             *"
                + "\n**********************************************"
        );
    }

    public void displayBuildShelterView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get player's resources
            String resources = this.getResources();
            if (resources.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(resources);

        } while (!done);

    }

    private String getResources() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = null; // player's resources to be returned
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
    
    @Override
    private boolean doAction(String resources) {

        if (resources.length() < 10 || resources.length() > 36 ) {
            System.out.println("\nInvalid resource number: "
                    + "Resource count cannot be below 10 or over 36");
            return false;
        }

    }

    private void displayShelterExplanation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
