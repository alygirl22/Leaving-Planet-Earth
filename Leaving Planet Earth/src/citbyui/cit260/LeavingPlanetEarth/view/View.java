package citbyui.cit260.LeavingPlanetEarth.view;

import java.util.Scanner;

// @author aly_cheers17 
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            String value = this.getInput(); // prompt for and get players name
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the view
            }
            done = this.doAction(value); // do whatever action associated with that menuOption       
        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        // while a valid name has not been retrieved
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            break;
        }
        return value; //return the name
    }
}
