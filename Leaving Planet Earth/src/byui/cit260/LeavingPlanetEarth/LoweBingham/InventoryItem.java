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
 * @author Curtis
 */
public class InventoryItem implements Serializable {

    //class instance variables
    private String inventoryType;
    private double inStock;
    private double requiredAmount;

    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory
                = new InventoryItem[15];

        InventoryItem fruit = new InventoryItem();
        fruit.setDescription("Fruit");
        fruit.setQuantityInStock(0);
        fruit.setRequiredAmount(0);
        inventory[Item.fruit.ordinal()] = fruit;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        InventoryItem drill = new InventoryItem();
        drill.setDescription("Drill");
        drill.setQuantityInStock(0);
        drill.setRequiredAmount(0);
        inventory[Item.drill.ordinal()] = drill;

        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(0);
        inventory[Item.hammer.ordinal()] = hammer;

        InventoryItem shovel = new InventoryItem();
        shovel.setDescription("Shovel");
        shovel.setQuantityInStock(0);
        shovel.setRequiredAmount(0);
        inventory[Item.shovel.ordinal()] = shovel;

        InventoryItem screwdriver = new InventoryItem();
        screwdriver.setDescription("Screwdriver");
        screwdriver.setQuantityInStock(0);
        screwdriver.setRequiredAmount(0);
        inventory[Item.screwdriver.ordinal()] = screwdriver;

        InventoryItem axe = new InventoryItem();
        axe.setDescription("Axe");
        axe.setQuantityInStock(0);
        axe.setRequiredAmount(0);
        inventory[Item.axe.ordinal()] = axe;

        InventoryItem canteen = new InventoryItem();
        canteen.setDescription("Canteen");
        canteen.SetQuantityInStock(0);
        canteen.setRequiredAmount(0);
        inventory[Item.canteen.ordinal()] = canteen;

        InventoryItem tarp = new InventoryItem();
        tarp.setDescription("Tarp");
        tarp.setQuantityInStock(0);
        tarp.setRequiredAmount(0);
        inventory[Item.tarp.ordinal()] = tarp;

        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;

        InventoryItem engine = new InventoryItem();
        engine.setDescription("Engine");
        engine.setQuantity(0);
        engine.setRequiredAmount(1);
        inventory[Item.engine.ordinal()] = engine;

        InventoryItem oil = new InventoryItem();
        oil.setDescription("Oil");
        oil.setQuantity(0);
        oil.setRequiredAmount(1);
        inventory[Item.oil.ordinal()] = oil;

        InventoryItem gasoline = new InventoryItem();
        gasoline.setDescription("Gasoline");
        gasoline.setQuantity(0);
        gasoline.setRequiredAmount(1);
        inventory[Item.gasoline.ordinal()] = gasoline;

        InventoryItem wings = new InventoryItem();
        wings.setDescription("Wings");
        wings.setQuantity(0);
        wings.setRequiredAmount(2);
        inventory[Item.wings.ordinal()] = wings;

        InventoryItem paint = new InventoryItem();
        paint.setDescription("Paint");
        paint.setQuantity(0);
        paint.setRequiredAmount(0);
        inventory[Item.paint.ordinal()] = paint;
        
        InventoryItem vegetables = new InventoryItem();
        vegetables.setDescription("Vegetables");
        vegetables.setQuantityInStock(0);
        vegetables.setRequiredAmount(0);
        inventory[Item.vegetables.ordinal()] = vegetables;
        
        return inventory;
    }

    private void setDescription(String fruit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SetQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Item {
        fruit,
        water,
        drill,
        hammer,
        shovel,
        screwdriver,
        axe,
        canteen,
        tarp,
        rope,
        engine,
        oil,
        gasoline,
        wings,
        paint,
        vegetables;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getInStock() {
        return inStock;
    }

    public void setInStock(double inStock) {
        this.inStock = inStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.inventoryType);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.inStock) ^ (Double.doubleToLongBits(this.inStock) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", inStock=" + inStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inStock) != Double.doubleToLongBits(other.inStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }

}
