/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

import detective.Detective;
import detective.model.Game;
import detective.model.Inventory;
import detective.model.Map;
import detective.model.Player;
import detective.model.Scene;

/**
 *
 * @author Matt
 */
public class GameControl {
    

    public static Player createPlayer(String name) {
       if (name == null) {
           return null;
       }
       
       Player player = new Player();
       player.setName(name);
       
       Detective.setPlayer(player);
       
       return player;
    }

    public static void createNewGame(Player player) {
    Game game = new Game();
    Detective.setCurrentGame(game);
    
    game.setPlayer(player);
    
    Inventory[] inventoryList = GameControl.createInventoryList();
    game.setInventory(inventoryList);
    
    Map map = MapControl.createMap();
    game.setMap(map);
    
    MapControl.moveActorsToStartingLocation(map);
    
    }
    
    public static Inventory[] createInventoryList() {
        System.out.println("Called createInventoryList() in GameControl");
        return null;
    }
    
    public static void loadExistingGame(String gameFile) {
        System.out.println("Game File called");
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

