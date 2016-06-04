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
public class InvestigationControlTest {
    
    public InvestigationControlTest() {
    }

    /**
     * Test of CalcObservationSkill method, of class InvestigationControl.
     */
    @Test
    public void testCalcObservationSkill1() {
        System.out.println("Test Case 1");
        int observationLevel = 5;
        int requirement = 3;
        InvestigationControl instance = new InvestigationControl();
        int expResult = 1;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcObservationSkill2() {
        System.out.println("Test Case 2");
        int observationLevel = -1;
        int requirement = 3;
        InvestigationControl instance = new InvestigationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testCalcObservationSkill3() {
        System.out.println("Test Case 3");
        int observationLevel = 5;
        int requirement = -1;
        InvestigationControl instance = new InvestigationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testCalcObservationSkill4() {
        System.out.println("Test Case 4");
        int observationLevel = 23;
        int requirement = 3;
        InvestigationControl instance = new InvestigationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testCalcObservationSkill5() {
        System.out.println("Test Case 5");
        int observationLevel = 5;
        int requirement = 22;
        InvestigationControl instance = new InvestigationControl();
        int expResult = -1;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);  
    }

    /**
     * Test of CalcObservationSkill method, of class InvestigationControl.
     */
    @Test
    public void testCalcObservationSkill() {
        System.out.println("CalcObservationSkill");
        int observationLevel = 0;
        int requirement = 0;
        InvestigationControl instance = new InvestigationControl();
        int expResult = 0;
        int result = instance.CalcObservationSkill(observationLevel, requirement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    }
    
