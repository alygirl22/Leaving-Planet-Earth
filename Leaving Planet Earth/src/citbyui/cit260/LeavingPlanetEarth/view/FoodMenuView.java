/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.view;

/**
 *
 * @author Curtis
 */
public class FoodMenuView extends View {
    
    public FoodMenuView() {
        super("\n"
                    + "\n------------------------"
                    + "\n| Food Menu                |"
                    + "\n------------------------"
                    + "\nF - Fruit                       "
                    + "\nV - Vegetables              "
                    + "\nW - Water                    "
                    + "\nR - Return to Game         "
                    + "\nT - See total amount of food");  
    }
    
    @Override
    public boolean doAction(String value) {
    
    value = value.toUpperCase();   // convert all to upper case
    char choice = value.charAt (0);// convert choice to upper case
    
    switch (choice) {
        case 'F':
            this.displayFruit();
            break;
        case 'V':
            this.displayVegetable();
            break;
        case 'W':
            this.displayWater();
            break;
        case 'R': // return to game
            return true;
        case 'T': // get total food
            this.getFoodAmount();
        default:
            System.out.println("\n*** Invalide selection *** Try again");
        }
        return false;
    }
    
    private void displayFruit() {
        System.out.println("\n You have 5 fruits");
    }
    private void displayVegetable() {
        System.out.println("\n You have 5 vegetables");
    }
    private void displayWater() {
        System.out.println("\n You have 2 gallons of water");
    }

    private void getFoodAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
