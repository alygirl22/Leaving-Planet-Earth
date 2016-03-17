/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

/**
 *
 * @author aly_cheers17
 */
public class MapControl {
    public static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
}
