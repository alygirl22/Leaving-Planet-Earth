/*
 * To change this license header  License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaving.planet.earth;

import byui.cit260.LeavingPlanetEarth.LoweBingham.Game;
import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;
import citbyui.cit260.LeavingPlanetEarth.view.StartProgramView;


/**
 *
 * @author aly_cheers17
 */
public class LeavingPlanetEarth {

    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
     
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        LeavingPlanetEarth.currentGame = currentGame;
    }
    public static Player getPlayer() {
        return player;
    }
    public static void setPlayer(Player player){
        LeavingPlanetEarth.player = player;
    }
}
