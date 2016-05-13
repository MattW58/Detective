/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open  the template in the editor.
 */
package detective;

import detective.model.Location;
import detective.model.Player;

/**
 *
 * @author Matt
 */
public class Detective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location locationOne = new Location();
        
      
        locationOne.setVisited(1);
        locationOne.setAmmountRemaining(24);
        locationOne.setRow(3);
        locationOne.setColumn(4);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
    }
    
}
