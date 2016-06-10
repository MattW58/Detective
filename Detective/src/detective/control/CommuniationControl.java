/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

/**
 *
 * @author Matt
 */
public class CommuniationControl {
    public int CalcCommunicationSkill(int communicationLevel, int requirement) { 
	if (communicationLevel < 0 || requirement < 0) {
            return -1;
        }
        
        if (communicationLevel > 20 || requirement > 20) {
		return -1;
               }
        
        double X = (communicationLevel + 2 ) * 0.5;
        
	if (X >=  requirement) {
            return 1;
                }
        
        if (X < requirement) {
	    return 0;
            }
        
        return 0;
    }
    
    
}
