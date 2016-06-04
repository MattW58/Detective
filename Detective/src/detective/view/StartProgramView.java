/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import detective.control.GameControl;
import detective.model.Player;
import static detective.view.MainMenuView.mainMenuView;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class StartProgramView {
 
   private String promptMessage;
   
   public StartProgramView() {
              
      this.displayBanner();
      
      this.promptMessage = "\nSo... what is your name? \n";
    
    }


    private void displayBanner() {
    System.out.println(
"~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=\n" +
"-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=\n" +
" __	 ___	_____ 	 ___	 ___	_____			 ___\n" +
"|  \\	|   	  |	|	|         |	  |	|   |	|\n" +
"|   |	|__   	  |	|__	|	  |	  |	\\   /	|__\n" +
"|   |	|   	  |	|	|	  |	  |	 \\ /	|	\n" +
"|__/	|___	  |	|___	|___	  |	  |	  V	|___\n" +
"\n" +
"~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=\n" +
"-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=~=-=\n" +
"\n" +
"		  And the Case of the Working Title\n" +
"\n\n\n\n" +
"  You are a detective, (suprise!) and you are on the case, you think. \n" +
"You wake up in your flat with no recollection of who you are or what \n" +
"you were doing, you barely even remember your name... "    
    
    );
    
    }

    public void displayStartProgramView() {
        boolean done = false;
        do {
            
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        }
        while (!done);

}

    private boolean doAction(String playersName) {
       if (playersName.length() < 2) {
           
           System.out.println("\nInvalid players name: "
                   + "The name must be greater than one character in length");
           return false;
       }
       Player player =  GameControl.createPlayer(playersName);
       
       if (player == null) {
           System.out.println("\nSom Ting Went Wong");
           return false;
       }
       this.displayNextView(player);
       
       return true;
       
    }

    private String getPlayersName() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       while (!valid) {
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nYou have a name, so don't leave it blank");
               continue;
           }
           break;
       }
       return value;
       
    }

    private void displayNextView(Player player) {
        System.out.println(
            "\nThat's right, your name is " + player.getName() + "!" +
            "\nWell " + player.getName() + ", looks like it's time to figure out whats going on."
            );
        
        MainMenuView.mainMenuView = new MainMenuView();
          
        mainMenuView.displayMainMenuView();
    }
    
}