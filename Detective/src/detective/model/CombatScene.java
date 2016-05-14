/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.model;

/**
 *
 * @author 56165320013
 */
public class CombatScene extends Scene{
    
            private int characterHealth;
            private int enemyHealth;

    public CombatScene() {
    }

    public int getCharacterHealth() {
        return characterHealth;
    }

    public void setCharacterHealth(int characterHealth) {
        this.characterHealth = characterHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.characterHealth;
        hash = 71 * hash + this.enemyHealth;
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
        final CombatScene other = (CombatScene) obj;
        if (this.characterHealth != other.characterHealth) {
            return false;
        }
        if (this.enemyHealth != other.enemyHealth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CombatScene{" + "characterHealth=" + characterHealth + ", enemyHealth=" + enemyHealth + '}';
    }
            
            
            
}
