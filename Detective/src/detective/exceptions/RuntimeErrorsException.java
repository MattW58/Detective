/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.exceptions;

/**
 *
 * @author 56165320013
 */
public class RuntimeErrorsException extends Exception {

    public RuntimeErrorsException() {
    }

    public RuntimeErrorsException(String string) {
        super(string);
    }

    public RuntimeErrorsException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RuntimeErrorsException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RuntimeErrorsException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
