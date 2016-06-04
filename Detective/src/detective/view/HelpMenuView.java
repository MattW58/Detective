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
public class HelpMenuView {

    static HelpMenuView helpMenuView;
    
    private String menu;
    private String choice;
     
    public HelpMenuView() {
        this.menu = "\n\n   Help Menu\n\n" + 
        "1 - Goals\n" +
        "2 - Movement\n" + 
        "3 - Investigation\n" + 
        "4 - Combat\n" +
        "Q - Quit\n"  ;
    };

 
    public void displayHelpMenuView() {
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
            case "1":
                this.showGoals();
                break;
            case "2":
                this.showMovement();
                break;
            case "3":
                this.showInvestigation();
                break;
            case "4":
                this.showCombat();
                break;
            default:
                System.out.println("\nYou might want to try again.");
                break;
        }
       return false;    
    }

    private void showGoals() {
    System.out.println("Goals of the game");
    }

    private void showMovement() {
    System.out.println("How to move");
    }

    private void showInvestigation() {
    System.out.println("How to investigate a scene");
    }

    private void showCombat() {
    System.out.println("How to fight");
    }

}
