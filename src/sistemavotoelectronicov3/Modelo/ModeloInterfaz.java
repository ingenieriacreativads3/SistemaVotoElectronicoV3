/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Modelo;

import java.util.*;

/**
 *
 * @author claudio
 */
public class ModeloInterfaz {
    
    public Estado verificarUsserPass(String nombreActual, String passActual){
        
        Estado estadoDevolver = Estado.ERROR;
        
        estadoDevolver = Usuario.verificarUsserPass(nombreActual, passActual);
        
        return estadoDevolver;
        
    }
    
    public static Usuario getUsuarioForNombre(String nombreActual){
        
        //Establecer un valor por defecto
        Usuario usuarioDevolver = Usuario.OBJETO_INVALIDO;
        
        //Obtener el valor del parametro para enviar
        Nombre nombreRecibido = Nombre.nuevo(nombreActual);
        
        if(Usuario.existeNombreUsuario(nombreRecibido)){
            
            usuarioDevolver = Usuario.getUsuarioForNombre(nombreRecibido);
            
        }else{
            
            //...se establecio un valor por defecto
            
        }
        
        return usuarioDevolver;
        
    }
    
    public static Usuario getUsuarioInvalido(){
        
        return Usuario.OBJETO_INVALIDO;
        
    }
    
    public static Usuario setSesion(Usuario usuarioRecibido){
        
        Usuario.setSesion(usuarioRecibido);
        
    }
    
}
