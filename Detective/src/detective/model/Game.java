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
public class Game implements Serializable{
     private int noPeople;
     private double totalTime;
     
     private Inventory[] inventory;
     private Player player;
     private Character character;
     private Map map;
     private Location[] location;
     private CombatScene combatScene;
     private InvestigationScene investigationScene;
     
     public Game() {
       }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] Inventory) {
        this.inventory = Inventory;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public CombatScene getCombatScene() {
        return combatScene;
    }

    public void setCombatScene(CombatScene combatScene) {
        this.combatScene = combatScene;
    }

    public InvestigationScene getInvestigationScene() {
        return investigationScene;
    }

    public void setInvestigationScene(InvestigationScene investigationScene) {
        this.investigationScene = investigationScene;
    }
    
    

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.noPeople;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
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
        final Game other = (Game) obj;
        if (this.noPeople != other.noPeople) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", totalTime=" + totalTime + '}';
    }
     
     
}

