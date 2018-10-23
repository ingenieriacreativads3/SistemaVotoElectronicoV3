package sistemavotoelectronicov3;
import Vista2.*;
import sistemavotoelectronicov3.*;
import javafx.application.*;
import javafx.stage.*;
import sistemavotoelectronicov3.Controlador.*;
import sistemavotoelectronicov3.Vista.*;
import sistemavotoelectronicov3.Modelo.*;

/**
 *
 * @author Tomás Contreras
 */
public class SistemaVotoElectronicoV3 extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        ControladorInterfaz.comenzar();

    }
    
    
    public static void asd(){
        System.exit(0);
    }
    
}
