/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sistemavotoelectronicov3.Modelo.Valor;

/**
 * FXML Controller class
 *
 * @author claudio
 */
public class FXMLVistaPrincipalController extends Application implements Initializable {

    @FXML
    private Label jLFunciona;
    @FXML
    private Button jBCerrarSesion;
    @FXML
    private Button jBAceptar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        jBAceptar.setText(Valor.JB_ACEPTAR);
        jBCerrarSesion.setText(Valor.JB_CERRAR_SESION);
        jLFunciona.setText(Valor.JL_FUNCIONANDO);
        
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVistaPrincipal.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
