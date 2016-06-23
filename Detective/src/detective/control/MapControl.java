/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

import detective.model.Map;

/**
 *
 * @author 56165320013
 */
public class MapControl {
    public static Map createMap() throws MapControlException {
        
        Map map = null;
        
        System.out.println("\n createMap() called");
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
}
