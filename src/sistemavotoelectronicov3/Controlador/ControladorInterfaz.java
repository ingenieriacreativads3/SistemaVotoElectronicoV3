/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Controlador;

import Vista2.Login;
import javafx.application.*;
import javafx.stage.*;
import sistemavotoelectronicov3.Modelo.*;
import sistemavotoelectronicov3.Modelo.Usuario;
import sistemavotoelectronicov3.Vista.*;

/**
 *
 * @author claudio
 */
public class ControladorInterfaz{
    
    public static Stage stagePrincipal;

    
    public static void comenzar(){
  
        Login login = new Login();
        login.show();
        
    }
        
    public static void comenzar(String[] args){
        
        //Usar este estado para algo
        Estado comenzoConExito = GestionarIniciarSesion.comenzar(args);
        
    }
    
    public void iniciarSesion(String nombreActual, String passActual){
        
        //establcer un valor por defecto
        Estado estadoUsserPass = Estado.ERROR;
        
        //Establecer un valor po defecto
        Usuario usuarioSesionado = ModeloInterfaz.getUsuarioInvalido();
        
        //Verificar si son correctos los datos
        ModeloInterfaz modeloNuevo = new ModeloInterfaz();
        estadoUsserPass = modeloNuevo.verificarUsserPass(nombreActual, passActual);
        
        //Si son correctos
        if(estadoUsserPass == Estado.USSER_PASS_CORRECTOS){
            
            
        }
        //...obtener el usuario a ingresar
        //...establecer una sesion al usuario ingresado
        //...mostrar una nueva pantalla con la informacion correspondiente
        //...sino, mostrar un mensaje de error.
        
        try {
            System.out.println(1);
            FXMLVistaPrincipalController asd = new FXMLVistaPrincipalController();
            asd.start(stagePrincipal);
            System.out.println(2);
        } catch (Exception e) {
            
        }
        
        
    }
    
}
