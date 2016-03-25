package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.view.ErrorView;
import java.util.Scanner;

// @author aly_cheers17 
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = LeavingPlanetEarth.getInFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            this.console.println(this.displayMessage);
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

        boolean valid = false;
        String value = null;

        // while a valid name has not been retrieved
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
            // get the value entered from the keyboard
            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) { // blank value entered
                ErrorView.display(this.getClass().getName(),
                                        "You must enter a value.");
                continue;
            }
            break;
        }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(),
                                "Error reading input: " + e.getMessage());
        return null;
}
}
