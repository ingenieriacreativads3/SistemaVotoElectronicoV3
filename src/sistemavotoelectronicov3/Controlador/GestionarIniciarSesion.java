package sistemavotoelectronicov3.Controlador;

import javafx.application.*;
import static javafx.application.Application.*;
import javafx.stage.*;
import static sistemavotoelectronicov3.Controlador.ControladorInterfaz.*;
import sistemavotoelectronicov3.Modelo.*;
import sistemavotoelectronicov3.Vista.*;

/**
 *
 * @author claudio
 */
public class GestionarIniciarSesion extends Application{
    
    protected static Estado iniciarSesion(Stage stagePrincipal, String nombreRecibido, String passRecibido){
        
        //Establcer un valor por defecto
        Estado estadoUserPass = Estado.ERROR;
        
        //Establecer un valor por defecto
        Usuario usuarioSesionado = ModeloInterfaz.getUsuarioInvalido();
        
        //Verificar si son correctos los datos
        ModeloInterfaz modeloNuevo = new ModeloInterfaz();
        estadoUserPass = modeloNuevo.verificarUsserPass(nombreRecibido, passRecibido);
        
        //Si son correctos
        if(estadoUserPass == Estado.USSER_PASS_CORRECTOS){
            
            usuarioSesionado = ModeloInterfaz.getUsuarioForNombre(nombreRecibido);
            usuarioSesionado.
                    
        }
        //...obtener el usuario a ingresar
        //...establecer una sesion al usuario ingresado
        //...mostrar una nueva pantalla con la informacion correspondiente
        //...sino, mostrar un mensaje de error.
        
        try {
            
            FXMLVistaPrincipalController asd = new FXMLVistaPrincipalController();
            asd.start(stagePrincipal);
            
        } catch (Exception e) {
            
        }
        
        return estadoUserPass;
        
    }
    
    protected static Estado comenzar(String[] args){
        
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
