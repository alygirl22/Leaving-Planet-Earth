/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.exceptions;

/**
 *
 * @author Curtis
 */
public class FoodControlException extends Exception {

    public FoodControlException() {
    }

    public FoodControlException(String message) {
        super(message);
    }

    public FoodControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodControlException(Throwable cause) {
        super(cause);
    }

    public FoodControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
