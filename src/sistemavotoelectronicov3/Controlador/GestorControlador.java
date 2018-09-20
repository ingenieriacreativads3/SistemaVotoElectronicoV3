/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sistemavotoelectronicov3.*;
import sistemavotoelectronicov3.Vista.FXMLLoginController;

/**
 *
 * @author Tomás Contreras
 */
public class GestorControlador extends Application{
    
    public static Stage stagePrincipal = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
    }
    
    public static void comenzar(String []args){
        
        launch(FXMLLoginController.class, args);
        
    }
    
    
    
}
