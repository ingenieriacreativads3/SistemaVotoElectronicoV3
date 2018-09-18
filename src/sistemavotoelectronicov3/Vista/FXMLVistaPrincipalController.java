/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Vista;

import sistemavotoelectronicov3.Controlador.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.*;


/**
 *
 * @author Tomás Contreras
 */
public class FXMLVistaPrincipalController  extends Application{

    @FXML
    private Button jTBCancelar;
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

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        ControladorInterfaz.stagePrincipal = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVistaPrincipal.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @FXML
    private void onMousePressed(MouseEvent event) {
        
        ControladorInterfaz asd = new ControladorInterfaz();
        asd.iniciarSecion();
        
    }
    
    
    
}
