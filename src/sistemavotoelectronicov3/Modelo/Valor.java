/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavotoelectronicov3.Modelo;
import java.util.*;

/**

 @author Tomas
 */
public class Valor{
    
    /**
     * Este identificador, indica cada cuanto se debe iterar por cada
     * indentificador creado.
     */
    protected static final int SIGUIENTE_IDENTIFICADOR = 1;
    public static final String JB_ACEPTAR = "Aceptar";
    public static final String JB_CANCELAR = "Cancelar";
    public static final String JB_CERRAR_SESION = "Cerrar Sesion";
    public static final String JL_USUARIO = "Usuario";
    public static final String JL_PASSWORD = "Password";
    public static final String JL_FUNCIONANDO = "Funcionando";
    public static final boolean GRID_PANE_LINES_VISIBILIDAD = false;
    public static final int ESPACIOS_VERTICALES = 10;
    public static final int ESPACIOS_HORIZONTALES = 10;
    public static final int PADDING = 10;
    public static Date sesion;

    private Valor(){}
    
}
