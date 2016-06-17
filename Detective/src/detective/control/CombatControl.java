/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

/**
 *
 * @author 56165320013
 */
public class CombatControl {

    public static double calcCombatSkill(double combatLevel, double requirement) {
        System.out.println("The damage was calculated");
        return 0;
    }
    public int CalcCombatSkill(int combatLevel, int requirement) {
	
        if (combatLevel < 0 || requirement < 0) {
		
                return -1;
        
                }
        
        if (combatLevel > 20 || requirement > 20) {
		return -1;
               }
	
        double damage = (combatLevel * 4) / 2;

	if (damage >= requirement) {
    
		return 1;
                
        }
	
        else 
               return 0;
        
}
}
