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
public class Nombre{
    
    private final int id;
    private String valor;
            
    protected final static Nombre OBJETO_INVALIDO = new Nombre();

    private static Set<Nombre> listaObjetos = new HashSet<>();
    
    public String getValor() {

        String valorDevolver = "Sin valor";

        //Si el valor requerido no nulo
        if(this.valor != null){

            valorDevolver = this.valor;

        }else{

            //...se establecio un valor por defecto

        }

        return valorDevolver;

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

    private Nombre() {

        //Asignar un identificador
        this.id = getNewId();


    }
    
    protected static Nombre nuevo(String palabraRecibida){

        //Crear un objeto a devolver
        Nombre objetoDevolver = Nombre.OBJETO_INVALIDO;

        //Crear un nuevo objeto
        Nombre objetoNuevo = new Nombre();

        //Agregar a la lista de control
        Estado seAgrego = addNewObjeto(objetoNuevo);

        //Si se agrega con exito
        if(seAgrego == Estado.EXITO){
            
            //Asignar el valor recibido por defecto
            Estado seSeteo = objetoDevolver.setValor(palabraRecibida);
            
            if(seAgrego == Estado.EXITO){
                
                //Establecer el objeto a devolver
                objetoDevolver = objetoNuevo;
                
            }else{
                
                //TODO aqui capturar el error producido por no setear el valor
                //recibido como argumento
                
                //...se establecio un valor por defecto
                
            }//...fin

        }else{

            //TODO capturar el error generado por un ingreso erroneo a la lista
            
            //...se establecio un valor por defecto

        }

        //Devolver el objeto requerido
        return objetoDevolver;

    }

    protected static Nombre nuevo(){

        //Crear un objeto a devolver
        Nombre objetoDevolver = Nombre.OBJETO_INVALIDO;

        //Crear un nuevo objeto
        Nombre objetoNuevo = new Nombre();

        //Agregar a la lista de control
        Estado seAgrego = addNewObjeto(objetoNuevo);

        //Si se agrega con exito
        if(seAgrego == Estado.EXITO){

            //Establecer el objeto a devolver
            objetoDevolver = objetoNuevo;

        }else{

            //TODO capturar el error generado por un ingreso erroneo a la lista
            //...se establecio un valor por defecto

        }

        //Devolver el objeto requerido
        return objetoDevolver;

    }
    
    //Set
    
    private Estado setValor(String valorRecibido){
        
        //Establecer un valor por defecto
        Estado estadoDevolver = Estado.ERROR_VALOR_NO_SETEADO;
        
        //Asignar el valor recibido
        this.valor = valorRecibido;
        
        //Verificar que la asignacion se realizo con exito
        if(!this.equals(OBJETO_INVALIDO)){
            
            //...establecer el valor de dato no agregado
            estadoDevolver = Estado.EXITO;
            
        }else{
            
            //...se establecio un valor por defecto
            
        }//..fin
        
        return estadoDevolver;
        
    }

    //Manejo de lista

    private static Estado addNewObjeto(Object objetoActual){

        //Establecer un valor por defecto
        Estado estadoDevolver= Estado.FRACASO;

        //Si el objeto recibido es del tipo correcto
        if(objetoActual.getClass() == Nombre.class){

            //Obtener el objeto requerido
            Nombre objetoAgregar = (Nombre)objetoActual;

            //Agregar el nuevo elemento a la lista
            boolean seAgrego;
            seAgrego = listaObjetos.add(objetoAgregar);

            if(seAgrego){

                //...asignar el estado correspondiente
                estadoDevolver = Estado.EXITO;

            }else{

                //...se establecio un valor por defecto

            }//...fin if


        }else{

            //...se establecio un valor por defecto

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

        return Integer.valueOf(this.valor);

    }
    
    @Override
    public String toString() {
        
        return this.valor.toString();
        
    }
    
}
