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
 * @author Matt
 */
public class CommuniationControlTest {
    
    public CommuniationControlTest() {
    }

    /**
     * Test of CalcObservationSkill method, of class CommuniationControl.
     */
    @Test
    public void testCalcObservationSkill1() {
        System.out.println("Test Case 1");
        int communicationLevel = 5;
        int requirement = 3;
        CommuniationControl instance = new CommuniationControl();
        int expResult = 1;
        int result = instance.CalcObservationSkill(communicationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
  
        @Test
    public void testCalcObservationSkill2() {
        System.out.println("Test Case 2");
        int communicationLevel = -5;
        int requirement = 3;
        CommuniationControl instance = new CommuniationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(communicationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCalcObservationSkill3() {
        System.out.println("Test Case 3");
        int communicationLevel = 2;
        int requirement = 3;
        CommuniationControl instance = new CommuniationControl();
        int expResult = 0;
        int result = instance.CalcObservationSkill(communicationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCalcObservationSkill4() {
        System.out.println("Test Case 4");
        int communicationLevel = 22;
        int requirement = 3;
        CommuniationControl instance = new CommuniationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(communicationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCalcObservationSkill5() {
        System.out.println("Test Case 5");
        int communicationLevel = 5;
        int requirement = 26;
        CommuniationControl instance = new CommuniationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(communicationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
