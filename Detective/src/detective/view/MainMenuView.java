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
public class MainMenuView {

    static MainMenuView mainMenuView;
    
    private String menu;
    private String choice;

    public MainMenuView() {
        this.menu = "\n\n   Main Menu\n\n" + 
        "1 - New Game\n" +
        "2 - Load Game\n" + 
        "3 - Save Game\n" + 
        "4 - Quit Game\n" +
        "5 - Credits\n" +
        "H - Help\n"  ;
    };

 
    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.equals("4"))
                return;
            
            done = this.doAction(menuOption);
        }
        while (!done);
    }

    private String getMenuOption() {
         Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       System.out.println(this.menu);
       
       while (!valid) {
           System.out.println("\n Please select a menu option and press enter");
           
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.startNewGame();
                break;
            case "2":
                this.startExistingGame();
                break;
            case "3":
                this.saveGame();
                break;
            case "5":
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
          
        helpMenuView.displayHelpMenuView();
    }

    

    private void displayCreditsMenu() {
        CreditsMenuView.creditsMenuView = new CreditsMenuView();
          
        creditsMenuView.displayCreditsMenuView();
    }

   

    
  

    
    
}
