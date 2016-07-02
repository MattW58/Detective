/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

import detective.Detective;
import detective.exceptions.MapControlException;
import detective.model.Map;
import java.awt.Point;
import detective.model.Character;

/**
 *
 * @author 56165320013
 */
public class MapControl  {
    public static Map createMap() {
        
        Map map = null;
        
        System.out.println("\n createMap() called");
        
        return map;
    }
    
    public static void moveActorsToStartingLocation(Map map) {
        
        Character[] characters = Character.values();
        
        for (Character character : characters) {
            String coordinates = character.getCoordinates();
            MapControl.moveActorToLocation(character, coordinates);
            
        }
        
    }
        public static void moveActorsToStartingLocation(Character actor, Point coordinates) throws MapControlException  {
        
        Map map = Detective.getCurrentGame().getMap();
       int newRow = coordinates.x-1;
       int newColumn = coordinates.y-1;
       
       if (newRow < 0 || newRow >= map.getNoOfRows() ||
               newColumn < 0 || newColumn >= map.getNoOfColumns()) {
           throw new MapControlException("Can not move actor to location"
                                        + coordinates.x + ", " + coordinates.y
                                        + " because that location is outside "
                                        + " the bounds of the map.");
           
                   
       }
      
    }

    private static int moveActorToLocation(Character character, Point coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void moveActorToLocation(Character character, String coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

