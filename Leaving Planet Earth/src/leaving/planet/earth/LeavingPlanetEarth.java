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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            
            // open character stream files for end user input and output
            LeavingPlanetEarth.inFile =
                    new BufferedReader (new InputStreamReader (System.in));
            
            LeavingPlanetEarth.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            LeavingPlanetEarth.logFile = new PrintWriter(filePath);
            
            //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
            
        } catch (Throwable e) {
            
                System.out.println("Exception: " + e.toString() +
                                          "\nCause: " + e.getCause() +
                                          "\nMessage: " + e.getMessage());
                
                e.printStackTrace();;
        }
        
        finally {
            
            try {
               if (LeavingPlanetEarth.inFile != null)
                   LeavingPlanetEarth.inFile.close();
               
               if (LeavingPlanetEarth.outFile != null)
                   LeavingPlanetEarth.outFile.close();
               
               if (LeavingPlanetEarth.logFile != null)
                   LeavingPlanetEarth.logFile.close();
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }
        
        
    }
        
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
        public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LeavingPlanetEarth.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LeavingPlanetEarth.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LeavingPlanetEarth.logFile = logFile;
    }
    
}
