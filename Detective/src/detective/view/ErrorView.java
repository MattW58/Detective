/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.view;

import detective.Detective;
import java.io.PrintWriter;

/**
 *
 * @author 56165320013
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Detective.getOutFile();
    private static final PrintWriter logFile = Detective.getLogFile();
    
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                        "\n -ERROR-" + errorMessage);
        logFile.println(className + " - " + errorMessage);
        
        
        
        
    }
}
