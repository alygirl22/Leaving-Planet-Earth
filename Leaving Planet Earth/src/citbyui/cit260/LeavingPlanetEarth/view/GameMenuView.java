/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.control.GameControl;
import leaving.planet.earth.LeavingPlanetEarth;

/**
 *
 * @author aly_cheers17
 */
public class GameMenuView {

    private final String menu;
    void displayMenu() {
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
            } while (!done); 
        }
    

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "V": // View Map
                this.viewMap();
                break;
            case "C": // construct shelter
                this.constructShelter();
                break;
            case "I": // view inventory for food
                this.InventoryItem();
                break;
            case "R": // check progress on rocket ship
                this.rocketProgress();
                break;
            case "M": // move person
                this.movePerson();
                break;
            case "S": // sleep
                this.makeSleep();
                break;
            case "P": // pack rocket ship
                this.packRocket();
                break;
            case "L": // launch rocket ship
                this.launchRocket();
                break;
            case "Q": // quit game
                this.quitGame();
                break;
            case "H": // help menu
                this.helpMenu();
                break;
            case "B": // select tool from tool belt
                this.selectTool();
                break;
            case "G": // Gather supplies
                this.gatherSupplies();
                break;
            case "O": // pick up object
                this.pickObject();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
    private void startNewGame() {

        GameControl.createNewGame(LeavingPlanetEarth.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }
    private void constructShelter() {
        System.out.println("*** constructShelter function called ***");
    }
    private void InventoryItem() {
        System.out.println("*** foodInventory function called ***");
    }
    private void rocketProgress() {
        System.out.println("*** rocketProgress function called ***");
    }   
    private void movePerson() {
        System.out.println("*** movePerson function called ***");
    }
    private void makeSleep() {
        System.out.println("*** makeSleep function called ***");
    }
    private void packRocket() {
        System.out.println("*** packRocket function called ***");
    }
    private void launchRocket() {
        System.out.println("*** launchRocket function called ***");
    }
    private void quitGame() {
        System.out.println("*** quitGame function called ***");
    }
    private void helpMenu() {
        System.out.println("*** helpMenu funciton called ***");
    }
    private void selectTool() {
        System.out.println("*** selectTool function called ***");
    }
    private void gatherSupplies() {
        System.out.println("*** gatherSupplies function called ***");
    }
    private void pickObject() {
        System.out.println("*** pickObject function called ***");
    }
    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }
   public GameMenuView() {
       this.menu = "\n"
                 + "\n--------------------------------"
                 + "\n| Game Menu                    |"
                 + "\n--------------------------------"
                 + "\nV - View Map"
                 + "\nC - Construct Shelter"
                 + "\nI - View Inventory for food"
                 + "\nR - Check progress on rocket ship"
                 + "\nM - Move person"
                 + "\nS - Sleep"
                 + "\nP - Pack rocket ship"
                 + "\nL - Launch Rocket Ship"
                 + "\nQ - Quit Game"
                 + "\nH - Help Menu"
                 + "\nB - View Tool Belt and select Tool"
                 + "\nG - Gather Supplies"
                 + "\nO - Pick up Object"
                 + "\n--------------------------------";
   }
    
}
