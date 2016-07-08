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
public class CreditsMenuView extends View {
    
    static CreditsMenuView creditsMenuView;
     
    public CreditsMenuView() {
        super("\n\n      Credits\n\n" + 
        "      Authors\n\n" +
        "  Brandon Taylor & Matt Williamson\n" + 
        "   from BYUI, CIT 260\n\n" + 
        "      Special Thanks\n\n" +
        "  Brother Kent Jackson\n\n" +
        "\n Here are the credits, enter Q to exit or A for an achievement");
    };
    
    private String getMenuOption() {
         
       String value = "";
       boolean valid = false;
       System.out.println(this.displayMessage);
       
       while (!valid) {
           
           value = keyboard.readLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nChill here as long as you want, we aint gonna stop ya.");
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
        System.out.println("\n\nACHIEVEMENT GET!!\nToo bad it doesn't do anything for you.");
    }
}
