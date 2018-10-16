/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Vista;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import sistemavotoelectronicov3.Controlador.*;
import sistemavotoelectronicov3.Modelo.*;

/**
 * FXML Controller class
 *
 * @author claudio
 */
public class FXMLVistaPrincipalController extends Application implements Initializable {
    
    private Set<Candidato> listaCandidatos = new HashSet<>();

    private GridPane jGPPanel;
    @FXML
    private MenuItem jMIIngresarPersona;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        jGPPanel.setGridLinesVisible(Valor.GRID_PANE_LINES_VISIBILIDAD);
        jGPPanel.setVgap(Valor.ESPACIOS_VERTICALES);
        jGPPanel.setHgap(Valor.ESPACIOS_HORIZONTALES);
        
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        System.out.println(3);
        primaryStage = ControladorInterfaz.stagePrincipal;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVistaPrincipal.fxml"));
        Scene scene = new Scene(root);
        System.out.println(4);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println(5);
        
    }
    
    public Estado setListaCandidatos(Set<Candidato> listaActual){
        
        Estado estadoDevolver = Estado.FRACASO;
        boolean seAgregaron = true;
        boolean seAgrego;
        
        for(Candidato candidatoActual : listaActual){
            
            seAgrego = this.listaCandidatos.add(candidatoActual);
            
            if(!seAgrego){
                
                seAgregaron = false;
                
            }else{
                
                //se establecio un valor por defecto
                
            }
            
        }
        
        if(seAgregaron){
            
            estadoDevolver = Estado.EXITO;
            
        }else{

            //..se establecio un valor por defecto
            
        }
        
        return estadoDevolver;
        
    }
    
}
