/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import detective.Detective;
import detective.control.GameControl;
import static detective.view.CreditsMenuView.creditsMenuView;
import static detective.view.HelpMenuView.helpMenuView;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class MainMenuView extends View {

    static MainMenuView mainMenuView;
    

    public MainMenuView() {
    super("\n\n   Main Menu\n\n" + 
        "1 - New Game\n" +
        "2 - Load Game\n" + 
        "3 - Save Game\n" + 
        "4 - Credits\n" +
        "Q - Quit Game\n" +
        "H - Help\n" +
        "\n Please select a menu option and press enter");
    };

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       System.out.println(this.displayMessage);
       
       while (!valid) {
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nGotta make a choice, a stand, right here and now, there's no turning back...\nSorry I was talking to myself, please enter a valid option.");
               continue;
           }
           break;
       }
       return value;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "1":
                this.startNewGame();
                break;
            case "2":
                this.startExistingGame();
                break;
            case "3":
                this.saveGame();
                break;
            case "4":
                this.displayCreditsMenu();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\nYou might want to try again.");
                break;
        }
       return false;    
    }
    

    private void startNewGame() {
        GameControl.createNewGame(Detective.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
    }

    private void startExistingGame() {
      
       System.out.println();
    }

    private void saveGame() {
        System.out.println("option 3");
    }

    private void displayHelpMenu() {
        HelpMenuView.helpMenuView = new HelpMenuView();
          
        helpMenuView.display();
    }

    

    private void displayCreditsMenu() {
        CreditsMenuView.creditsMenuView = new CreditsMenuView();
          
        creditsMenuView.display();
    }

   

    
  

    
    
}
