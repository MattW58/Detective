/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import detective.control.CombatControl;

/**
 *
 * @author 56165320013
 */
public class CombatView extends View{

    public CombatView() {
        super("\nThis will determine whether you can deal damage or not.");
    }

   
    
    @Override
    public boolean doAction(String value) {
        
        this.displayMessage = "\n Your skill level will now be compared with the enemy's";
        String value2 = this.getInput();
        double combatLevel = Double.parseDouble(value2);
        double requirement = Double.parseDouble(value2);
        
        double damage = CombatControl.calcCombatSkill(combatLevel, requirement);
                
        if (damage < 0) {
            System.out.println("\nThe combat skill level was invalid");
            return false;
        }
        else{
            System.out.println("\nYou dealt damage to the enemy!");
                    return true;
        }
    }
    
}
