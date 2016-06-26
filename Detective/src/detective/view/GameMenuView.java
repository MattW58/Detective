/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import detective.Detective;
import detective.model.Game;
import detective.model.Inventory;
import static detective.view.InvestigationAView.investigationAView;
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
        "V - View Map\n" +
        "I - Items\n" +
        "N - Notes\n" +
        "D - Damage Output" +  
        "O - Investigation" + 
        "S - Save Game\n" + 
        "Q - Quit Game\n");
    };
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "V":
                this.displayMap();
                break;
            case "I":
                this.showItems();
                break;
            case "N":
                this.showNotes();
                break;
            case "D":
                this.showDamage();
                break;
            case "O":
                this.investigate();
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
        StringBuilder line;
        
        Game game = Detective.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        System.out.println("\n     List of Inventory Items");
        line = new StringBuilder("                                       ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        for (Inventory item : inventory) {
            line = new StringBuilder("                                       ");
        line.insert(0, item.getDescription());
        line.insert(23, item.getRequiredAmount());
        line.insert(33, item.getQuiantityInStock());
        
        System.out.println(line.toString());
        
        }
        
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

    private void investigate() {
        InvestigationAView.investigationAView = new InvestigationAView();
          
        investigationAView.display();
    }

    private void displayMap() {
        System.out.println("\nDisplays the map");
    }
}
