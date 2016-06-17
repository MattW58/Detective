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
public class GameMenuView extends View {

    static GameMenuView gameMenuView;
    
    
    private String choice;

    public GameMenuView() {
        super( "\n\n   Game Menu\n\n" +
        "I - Items\n" +
        "N - Notes\n" +
        "D - Damage Output" +        
        "S - Save Game\n" + 
        "Q - Quit Game\n");
    };
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "I":
                this.showItems();
                break;
            case "N":
                this.showNotes();
                break;
            case "D":
                this.showDamage();
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
          
        gameMenuView.display();
    }

    private void showDamage() {
        System.out.println("Show the damage dealt");
    }
}
