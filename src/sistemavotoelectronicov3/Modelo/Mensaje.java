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
public class Mensaje {
    
    private final int id;
    private Nombre titulo;
    private Nombre descripcion;
    private Imagen icono;
            
    protected final static Mensaje OBJETO_INVALIDO = new Mensaje();

    private static Set<Mensaje> listaObjetos = new HashSet<>();
    
    public Nombre getTitulo() {

        Nombre tituloDevolver = Nombre.OBJETO_INVALIDO;

        //Si el titulo requerido no nulo
        if(this.titulo != null){

            tituloDevolver = this.titulo;

        }else{

            //...se establecio un titulo por defecto

        }

        return tituloDevolver;

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

    private Mensaje() {

        //Asignar un identificador
        this.id = getNewId();


    }

    protected static Mensaje nuevo(){

        //Crear un objeto a devolver
        Mensaje objetoDevolver = Mensaje.OBJETO_INVALIDO;

        //Crear un nuevo objeto
        Mensaje objetoNuevo = new Mensaje();

        //Agregar a la lista de control
        Estado seAgrego = addNewObjeto(objetoNuevo);

        //Si se agrega con exito
        if(seAgrego == Estado.EXITO){

            //Establecer el objeto a devolver
            objetoDevolver = objetoNuevo;

        }else{

            //TODO capturar el error generado por un ingreso erroneo a la lista
            //...se establecio un titulo por defecto

        }

        //Devolver el objeto requerido
        return objetoDevolver;

    }

    //Manejo de lista

    private static Estado addNewObjeto(Object objetoActual){

        //Establecer un titulo por defecto
        Estado estadoDevolver= Estado.FRACASO;

        //Si el objeto recibido es del tipo correcto
        if(objetoActual.getClass() == Mensaje.class){

            //Obtener el objeto requerido
            Mensaje objetoAgregar = (Mensaje)objetoActual;

            //Agregar el nuevo elemento a la lista
            boolean seAgrego;
            seAgrego = listaObjetos.add(objetoAgregar);

            if(seAgrego){

                //...asignar el estado correspondiente
                estadoDevolver = Estado.EXITO;

            }else{

                //...se establecio un titulo por defecto

            }//...fin if


        }else{

            //...se establecio un titulo por defecto

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
        
        return this.titulo.toString();
        
    }
    
}
