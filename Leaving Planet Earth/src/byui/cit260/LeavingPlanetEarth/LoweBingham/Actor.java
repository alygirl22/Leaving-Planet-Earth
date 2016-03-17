/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Curtis
 */
public enum Actor implements Serializable{
    
    Rocket Scientist George("scientist at nasa."),
    Builder Bob("helps build shelter"),
    
    private final String description;
    private final Point location;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    

    public String getDescription() {
        return description;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", currentLocation=" + currentLocation + '}';
    }
     
}
