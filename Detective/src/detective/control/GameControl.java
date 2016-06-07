/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.control;

import detective.Detective;
import detective.model.Player;

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
    System.out.println("create newa game called");
    }
    
    public static void loadExistingGame(String gameFile) {
        System.out.println("Game File called");
    }
}

