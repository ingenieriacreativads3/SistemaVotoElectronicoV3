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
public class Imagen {
    
    private final int id;
    private Nombre nombre;
            
    protected final static Imagen OBJETO_INVALIDO = new Imagen();

    private static Set<Imagen> listaObjetos = new HashSet<>();
    
    /**
     *Devuelve el nombre de la imagen
     * @return
     */
    public Nombre getNombre() {

        Nombre nombreDevolver = Nombre.OBJETO_INVALIDO;

        //Si el nombre requerido no nulo
        if(this.nombre != null){

            nombreDevolver = this.nombre;

        }else{

            //...se establecio un nombre por defecto

        }

        return nombreDevolver;

    }

    private static int getNewId(){

        //Crear un nuevo identificador
        int idActual = listaObjetos.size();

        //Buscar el siguiente identificador
        int siguienteIdentificador = Valor.SIGUIENTE_IDENTIFICADOR;

        //Combinar ambos valores
        idActual = idActual + siguienteIdentificador;

        //Devolver el nuevo identificador
        return idActual;

    }

    //Constructor

    private Imagen() {

        //Asignar un identificador
        this.id = getNewId();

    }

    /**
     *Devuelve un objeto nuevo
     * 
     * @return
     */
    protected static Imagen nuevo(){

        //Crear un objeto a devolver
        Imagen objetoDevolver = Imagen.OBJETO_INVALIDO;

        //Crear un nuevo objeto
        Imagen objetoNuevo = new Imagen();

        //Agregar a la lista de control
        Estado seAgrego = addNewObjeto(objetoNuevo);

        //Si se agrega con exito
        if(seAgrego == Estado.EXITO){

            //Establecer el objeto a devolver
            objetoDevolver = objetoNuevo;

        }else{

            //TODO capturar el error generado por un ingreso erroneo a la lista
            //...se establecio un nombre por defecto

        }

        //Devolver el objeto requerido
        return objetoDevolver;

    }

    //Manejo de lista

    private static Estado addNewObjeto(Object objetoActual){

        //Establecer un nombre por defecto
        Estado estadoDevolver= Estado.FRACASO;

        //Si el objeto recibido es del tipo correcto
        if(objetoActual.getClass() == Imagen.class){

            //Obtener el objeto requerido
            Imagen objetoAgregar = (Imagen)objetoActual;

            //Agregar el nuevo elemento a la lista
            boolean seAgrego;
            seAgrego = listaObjetos.add(objetoAgregar);

            if(seAgrego){

                //...asignar el estado correspondiente
                estadoDevolver = Estado.EXITO;

            }else{

                //...se establecio un nombre por defecto

            }//...fin if


        }else{

            //...se establecio un nombre por defecto

        }//...fin if

        //Devolver el estado correspondiente
        return estadoDevolver;

    }//...fin funcion
    
    @Override
    public boolean equals(Object objetoActual) {

        if(objetoActual == null){return false;}
        if(this.getClass() != objetoActual.getClass()){return false;}

        final Nombre objetoRecibido = (Nombre) objetoActual;

        if(this.hashCode() != objetoRecibido.hashCode()){return false;}

        return true;

    }

    @Override
    public int hashCode() {

        return this.id;

    }
    
    @Override
    public String toString() {
        
        return this.nombre.toString();
        
    }
    
}
