/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open  the template in the editor.
 */
package detective;

import detective.exceptions.RuntimeErrorsException;
import detective.model.Game;
import detective.view.StartProgramView;
import detective.model.Player;
import detective.view.View;
import java.io.InputStream;
import java.io.PrintStream;
        
public class Detective {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       try {
           
           Detective.inFile = 
                   new BufferedReader(new InputStreamReader(System.in));
           
           Detective.outFile = new PrintWriter(System.out, true);
           
           String filePath = "log.txt";
           Detective.logFile = new PrintWriter(filePath);
           
           
       startProgramView.displayStartProgramView();
       } catch (Throwable te) {
        System.out.println(te.getMessage());
        te.printStackTrace();
        startProgramView.display();
    }
       finally {
           
          
           if (Detective.inFile != null)
               Detective.inFile.close();
           if (Detective.outFile != null)
               Detective.outFile.close();
           if (Detective.logFile != null)
               Detective.logFile.close();
           
       }
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

    public static java.io.PrintWriter getOutFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static java.io.PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static View.BufferedReader getInFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
