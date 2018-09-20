package sistemavotoelectronicov3.Controlador;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import sistemavotoelectronicov3.Modelo.Estado;
import sistemavotoelectronicov3.Vista.FXMLLoginController;

/**
 *
 * @author claudio
 */
public class GestionarIniciarSesion extends Application{
    
    protected static Estado iniciarSesion(String[] args){
        
        Estado estadoDevolver = Estado.FRACASO;
        
        launch(FXMLLoginController.class, args);
        
        //En esta linea realizar la comprobacion de un lanzamiento con exito.
        if(estadoDevolver.equals(Estado.FRACASO)){
            
            estadoDevolver = Estado.EXITO;
            
        }else{
            
            //...se establecio un valor por defecto
            
        }
        
        return estadoDevolver;
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
    }
    
}
