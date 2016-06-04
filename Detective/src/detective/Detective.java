/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open  the template in the editor.
 */
package detective;

import detective.model.Game;
import detective.view.StartProgramView;
import detective.model.Player;
        
public class Detective {
    
    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Detective.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Detective.player = player;
    }
    
}
