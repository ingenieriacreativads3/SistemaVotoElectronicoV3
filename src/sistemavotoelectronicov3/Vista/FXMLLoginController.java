/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Vista;

import java.net.*;
import java.util.*;
import sistemavotoelectronicov3.Controlador.*;
import sistemavotoelectronicov3.Modelo.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.*;


/**
 *
 * @author Tomás Contreras
 */
public class FXMLLoginController  extends Application implements Initializable{

    @FXML
    private Button jBAceptar;
    @FXML
    private TextField jTBUsuario;
    @FXML
    private TextField jTBPassword;
    @FXML
    private Label jLUsuario;
    @FXML
    private Label jLPassword;
    @FXML
    private Button jBCancelar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        jBCancelar.setText(Valor.JB_CANCELAR);
        jBAceptar.setText(Valor.JB_ACEPTAR);
        jLUsuario.setText(Valor.JL_USUARIO);
        jLPassword.setText(Valor.JL_PASSWORD);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        ControladorInterfaz.stagePrincipal = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @FXML
    private void onMousePressed(MouseEvent event) {
        
        ControladorInterfaz asd = new ControladorInterfaz();
        asd.iniciarSesion(jTBUsuario.getText(), jTBPassword.getText());
        
    }
    
    
    
}
