/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Controlador;

import javafx.application.Application;
import javafx.stage.Stage;
import sistemavotoelectronicov3.Vista.FXMLVistaPrincipal2Controller;

/**
 *
 * @author claudio
 */
public class ControladorInterfaz{
    
    public static Stage stagePrincipal;
    
    public void iniciarSecion(){
        
        try {
            
            FXMLVistaPrincipal2Controller asd = new FXMLVistaPrincipal2Controller();
            asd.start(stagePrincipal);
            
        } catch (Exception e) {
            
        }
        
        
    }
    
}
