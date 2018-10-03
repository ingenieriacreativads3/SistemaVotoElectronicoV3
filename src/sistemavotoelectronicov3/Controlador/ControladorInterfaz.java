/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Controlador;

import javafx.application.*;
import javafx.stage.*;
import sistemavotoelectronicov3.Modelo.*;
import sistemavotoelectronicov3.Vista.*;

/**
 *
 * @author claudio
 */
public class ControladorInterfaz{
    
    public static Stage stagePrincipal;
    
    public static void iniciarSesion(String[] args){
    
        //Usar este estado para algo
        Estado comenzoConExito = GestionarIniciarSesion.iniciarSesion(args);
        
    }
    
    public void loginAceptar(){
        
        try {
            
            FXMLVistaPrincipalController asd = new FXMLVistaPrincipalController();
            asd.start(stagePrincipal);
            
        } catch (Exception e) {
            
        }
        
        
    }
    
}
