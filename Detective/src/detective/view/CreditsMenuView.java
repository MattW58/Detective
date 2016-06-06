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
public class CreditsMenuView {
    
    static CreditsMenuView creditsMenuView;
    
    private String menu;
    private String choice;
     
    public CreditsMenuView() {
        this.menu = "\n\n      Credits\n\n" + 
        "      Authors\n\n" +
        "  Brandon Taylor & Matt Williamson\n" + 
        "   from BYUI, CIT 260\n\n" + 
        "      Special Thanks\n\n" +
        "  Brother Kent Jackson\n\n" ;
    };

 
    public void displayCreditsMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
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
           System.out.println("\n Here are the credits, enter E to exit or A for an achievement");
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nChill here as long as you want, we aint gonna stop ya.");
               continue;
           }
           break;
       }
       return value;
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":
                this.achievementGet();
                break;    
            default:
                System.out.println("\nYou might want to try again.");
                break;
        }
       return false;    
    }

    private void achievementGet() {
        System.out.println("ACHIEVEMENT GET!!\nToo bad it doesn't do anything for you.");
    }
}
