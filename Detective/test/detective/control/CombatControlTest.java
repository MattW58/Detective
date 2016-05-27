/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 56165320013
 */
public class CombatControlTest {
    
    public CombatControlTest() {
    }

    /**
     * Test of CalcCombatSkill method, of class CombatControl.
     */
    @Test
    public void testCalcCombatSkill1() {
        System.out.println("Test Case 1");
        int combatLevel = 4;
        int requirement = 1;
        CombatControl instance = new CombatControl();
        int expResult = 1;
        int result = instance.CalcCombatSkill(combatLevel, requirement);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcCombatSkill2() {
        System.out.println("Test Case 2");
        int combatLevel = -1;
        int requirement = 1;
        CombatControl instance = new CombatControl();
        int expResult = -1;
        int result = instance.CalcCombatSkill(combatLevel, requirement);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcCombatSkill3() {
        System.out.println("Test Case 3");
        int combatLevel = 4;
        int requirement = -1;
        CombatControl instance = new CombatControl();
        int expResult = -1;
        int result = instance.CalcCombatSkill(combatLevel, requirement);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalcCombatSkill4() {
        System.out.println("Test Case 4");
        int combatLevel = 23;
        int requirement = 3;
        CombatControl instance = new CombatControl();
        int expResult = -1;
        int result = instance.CalcCombatSkill(combatLevel, requirement);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalcCombatSkill5() {
        System.out.println("Test Case 5");
        int combatLevel = 4;
        int requirement = 24;
        CombatControl instance = new CombatControl();
        int expResult = -1;
        int result = instance.CalcCombatSkill(combatLevel, requirement);
        assertEquals(expResult, result);
        
    }
}
