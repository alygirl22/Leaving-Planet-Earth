/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

import byui.cit260.LeavingPlanetEarth.LoweBingham.InventoryItem;
import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;
import citbyui.cit260.LeavingPlanetEarth.view.GameMenuView;
import leaving.planet.earth.LeavingPlanetEarth;

/**
 *
 * @author aly_cheers17
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        String name;
        
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        LeavingPlanetEarth.setPlayer(player); // save the player
        
        return player;
    }
    public static void createNewGame(Player player) {
    }
    
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath)
                throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        LeavingPlanetEarth.setCurrentGame(game); // save in LeavingPlanetEarth
    }
        
        // create the inventory list and save in the game
       public static InventoryItem[] createinventoryList() {
           System.out.println("*** called createInventoryList() in GameControl ***");
           return null;
       } 
        
        
        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); // save map in game
        
        RocketShip rocketship = new RocketShip(); //create new RocketShip
        game.setRocketShip(rocketship); // save RocketShip in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
        
    }
    private void startNewGame() {

        GameControl.createNewGame(LeavingPlanetEarth.getPlayer());
           System.out.println("***Start New Game Menu***");
    }
}
