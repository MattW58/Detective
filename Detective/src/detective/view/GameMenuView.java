/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class GameMenuView {

    static GameMenuView gameMenuView;
    
    private String menu;
    private String choice;

    public GameMenuView() {
        this.menu = "\n\n   Game Menu\n\n" +
        "I - Items\n" +
        "N - Notes\n" + 
        "S - Save Game\n" + 
        "Q - Quit Game\n";
    };

 
    public void displayGameMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
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
            case "I":
                this.showItems();
                break;
            case "N":
                this.showNotes();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\nYou might want to try again.");
                break;
        }
       return false;    
    }

    private void showItems() {
        System.out.println("List of Items");
    }

    private void showNotes() {
        System.out.println("List of notes collected");
    }

    private void saveGame() {
        System.out.println("Saves the game");
    }

    void displayMenu() {
        GameMenuView.gameMenuView = new GameMenuView();
          
        gameMenuView.displayGameMenuView();
    }
}
