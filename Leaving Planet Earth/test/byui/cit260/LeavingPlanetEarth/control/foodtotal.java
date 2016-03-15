/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Curtis
 */
public class FoodControlTest {
    
    public FoodControlTest() {
    }

    /**
     * Test of calcFoodAmount method, of class FoodControl.
     */
    @Test
    public void testCalcFoodAmount() {
        int [] foodTotals = new int [5];
   
        getFoodTotals("Food1", foodTotals);
    }
    
    public void getFoodAmount(String food, int[] foods){
        int totalFood;
        
        for (int i = 0; i < foods.length; i++){
            totalFood = ....
            
            food [i] += totalFood;        
        }
    }
}
