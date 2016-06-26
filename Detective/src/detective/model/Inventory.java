/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Matt
 */
public class Inventory implements Serializable{
    
    private String nameOfItem;
    private String itemType;
    private int requiredAmmount;

    public Inventory() {
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getRequiredAmmount() {
        return requiredAmmount;
    }

    public void setRequiredAmmount(int requiredAmmount) {
        this.requiredAmmount = requiredAmmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nameOfItem);
        hash = 53 * hash + Objects.hashCode(this.itemType);
        hash = 53 * hash + this.requiredAmmount;
        return hash;
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
        final Inventory other = (Inventory) obj;
        if (this.requiredAmmount != other.requiredAmmount) {
            return false;
        }
        if (!Objects.equals(this.nameOfItem, other.nameOfItem)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "nameOfItem=" + nameOfItem + ", itemType=" + itemType + ", requiredAmmount=" + requiredAmmount + '}';
    }
    
    public static Inventory[] createInventoryList() {
        
        Inventory[] inventory =
                new Inventory[5];
        
        Inventory pistol = new Inventory();
        pistol.setDescription("Pistol");
        pistol.setQuantityInStock(1);
        pistol.setRequiredAmount(1);
        inventory[InventoryEnum.pistol.ordinal()] = pistol;
        
        Inventory badge = new Inventory();
        badge.setDescription("Badge");
        badge.setQuantityInStock(1);
        badge.setRequiredAmount(1);
        inventory[InventoryEnum.badge.ordinal()] = badge;
        
        Inventory brassKnuckles = new Inventory();
        brassKnuckles.setDescription("Brass Knuckles");
        brassKnuckles.setQuantityInStock(1);
        brassKnuckles.setRequiredAmount(1);
        inventory[InventoryEnum.brassKnuckles.ordinal()] = brassKnuckles;
        
        Inventory evidenceOne = new Inventory();
        evidenceOne.setDescription("Evidence One");
        evidenceOne.setQuantityInStock(0);
        evidenceOne.setRequiredAmount(1);
        inventory[InventoryEnum.evidenceOne.ordinal()] = evidenceOne;
        
        Inventory evidenceTwo = new Inventory();
        evidenceTwo.setDescription("Evidence Two");
        evidenceTwo.setQuantityInStock(0);
        evidenceTwo.setRequiredAmount(1);
        inventory[InventoryEnum.evidenceTwo.ordinal()] = evidenceTwo;
        
        return inventory;
    }

    private void setDescription(String pistol) {
        System.out.println("Shows description of pistol");
    }

    private void setQuantityInStock(int i) {
        System.out.println("Shows Quantity in Stock");
    }

    private void setRequiredAmount(int i) {
        System.out.println("Shows Required Amount");
    }

    public Object getDescription() {
        System.out.println("Shows description");
        return null;
    }

    public Object getRequiredAmount() {
        System.out.println("Shows description");
        return null;
    }

    public Object getQuiantityInStock() {
        System.out.println("Shows description");
        return null;
    }
    public enum InventoryEnum {
    pistol,
    badge,
    brassKnuckles,
    evidenceOne,
    evidenceTwo;
    }
    
}
