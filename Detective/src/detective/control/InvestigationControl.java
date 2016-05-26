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
public class InvestigationControl {
    
    public int CalcObservationSkill(int observationLevel, int requirement) { 
	if (observationLevel < 0 || requirement < 0) {
            return -1;
        }
        
        if (observationLevel > 20 || requirement > 20) {
		return -1;
               }
        
        double X = (observationLevel + 2 ) * 0.5;
        
	if (X >=  requirement) {
            return 1;
                }
        
        if (X < requirement) {
	    return 0;
            }
        
        return 0;
    }
    
}
