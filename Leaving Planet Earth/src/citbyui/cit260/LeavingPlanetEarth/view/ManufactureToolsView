/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

import java.util.Scanner;

/**
 *
 * @author aly_cheers17
 */
public class ManufactureToolsView {

    private String promptMessage;

    public ManufactureToolsView() {

        this.promptMessage = "\nPlease enter tool";
        // display the banner when view is created
        
    }

    private void displayBanner() {

        System.out.println(
                "\n*****************************************"
                + "\n* Please select which tool you need   *"
                + "\nD - Drill                             *"
                + "\nH - Hammer                            *"
                + "\nS - Shovel                            *"
                + "\nO - Rope                              *"
                + "\nA - Axe                               *"
                + "\nW - Screwdriver                       *"
                + "\nC - Canteen                           *"
                + "\nT - Tarp                              *"
                + "\n***************************************"
        );
    }

    public void ManufactureToolsView() {

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

    public boolean doAction(String value) {
    
    value = value.toUpperCase();   // convert all to upper case
    char choice = value.charAt (0);// convert choice to upper case
    
    switch (choice) {
        case 'D':
            this.displayDrill();
            break;
        case 'H':
            this.displayHammer();
            break;
        case 'S':
            this.displayShovel();
            break;
        case 'O':
            this.displayRope();
            break;
        case 'A':
            this.displayAxe();
            break;
        case 'W':
            this.displayScrewdriver();
            break;
        case 'C':
            this.displayCanteen();
            break;
        case 'T':
            this.displayTarp();
            break;
        case 'R': // return to game
            return true;
        default:
            System.out.println("\n*** Invalide selection *** Try again");
        }
        return false;
    }

    private String getResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayDrill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHammer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayShovel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayRope() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayAxe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayScrewdriver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayCanteen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTarp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
