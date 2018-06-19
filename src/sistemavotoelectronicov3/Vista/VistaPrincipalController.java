/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Vista;

import sistemavotoelectronicov3.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

/**
 *
 * @author Tomás Contreras
 */
public class VistaPrincipalController  extends Application{

    @FXML
    private Button primerboton;
    @FXML
    private ComboBox<?> primercombobox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("Vista/FXMLVistaPrincipal.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
    
}
