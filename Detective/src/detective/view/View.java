/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import java.util.Scanner;

/**
 *
 * @author 56165320013
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {    
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        }
        while (!done);
    }
    
    @Override
    public String getInput() {
       Scanner keyboard = new Scanner(System.in);
       String value = null;
       boolean valid = false;
       
       while (!valid) {
           System.out.println("\n" + this.displayMessage);
           
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

}
