/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Tomás Contreras
 */
public class SistemaVotoElectronicoV3 extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{        
        
        try {
            
            Parent root = FXMLLoader.load(getClass().getResource("asd.fxml"));
            Scene scene = new Scene(root);
        
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
            
            
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
        
        
    }

    private void initRootLayout() {
        
        
        
    }

    private void showLoginView() {
        
        
        
    }
    
}
