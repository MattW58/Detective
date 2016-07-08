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
public class InvestigationAView extends View{
    
    static InvestigationAView investigationAView;
     
    public InvestigationAView() {
        super("You look around your office, and amid the chaos\n" +
              "you notice a NOTEBOOK and your open DOOR to the hallway.\n" +
              "Press q to go back.");
    };
    
    private String getMenuOption() {
         
       String value = "";
       boolean valid = false;
       System.out.println(this.displayMessage);
       
       while (!valid) {
           
           value = keyboard.readLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nTry pressing N for Notebook or D for Door.");
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
            case "N":
                this.collectNotebook();
                break;
            case "D":
                this.exitRoom();
                break;
            default:
                System.out.println("\nTry using just the first letter\n" + 
                "of your selection.");
                break;
        }
       return false;    
    }

    private void collectNotebook() {
        System.out.println("You pick up your notebook, unfortunately, what\n" +
                "notes it had were torn out, but you can use it from now on.");
    }

    private void exitRoom() {
        System.out.println("You get off the floor and stumble towards the\n" +
                "doorway, but you got up to soon and black out again.");
        }

    
}
