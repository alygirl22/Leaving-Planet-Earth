/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Curtis
 */
public class manufactureShelterControlTest {
    
    public manufactureShelterControlTest() {
    }

    /**
     * Test of calcBuildShelter method, of class manufactureShelterControl.
     */
    @Test
    public void testCalcBuildShelter() {
        
        System.out.println("calcBuildShelter");
        
        /***** Test Case #1 *****/
        System.out.println("/tTest case #1");
        
        // input values for test case 1
        double tarp = 3.0;
        double hammer = 2.0;
        double sticks = 5.0;
        double rope = 3.0;
        double axe = 5.0;
        double drill = 2.0;
        
        double expResult = 20.0; // expected output returned value
        
        // create instance of manufactureShetlerControl class
        manufactureShelterControl instance = new manufactureShelterControl();
        
        // call funtion to run test
        double result = instance.calcBuildShelter(tarp, hammer, sticks, rope, axe, drill);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

    }
    
}
