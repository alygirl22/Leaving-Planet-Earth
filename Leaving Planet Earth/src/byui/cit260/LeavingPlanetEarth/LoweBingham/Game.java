/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aly_cheers17
 */
public class Game implements Serializable {
    
    private String time;
    private String people;
    
    private Player player;
    private Map map;
    private Food food;
    private Tools tools;
    private Shelter shelter;
    private RocketShip rocketship;
    
    private InventoryItem[] inventory;
    private String[] actors;

    public Game() {
    }

    
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Player getPlayer() {
        return player;
    }

    public Map getMap() {
        return map;
    }

    public Food getFood() {
        return food;
    }

    public Tools getTools() {
        return tools;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public RocketShip getRocketship() {
        return rocketship;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public void setRocketship(RocketShip rocketship) {
        this.rocketship = rocketship;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public String[] getActors() {
        return actors;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.time);
        hash = 83 * hash + Objects.hashCode(this.people);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", people=" + people + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.people, other.people)) {
            return false;
        }
        return true;
    }
    
    
    
}
