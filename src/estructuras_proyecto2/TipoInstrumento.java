/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_proyecto2;

/**
 *
 * @author joser
 */
// Clase tipo instrumento
public class TipoInstrumento {
    //  Get para el ID y la descripción
    public int getID() {
        return ID;
    }
    public void setID(int IDE){
        this.ID = IDE;
    }
    // Get de la descripción
    public String getDescripcion() {
        return descripcion;
    }
    
    // Get Contador, util para saber si está lleno o vacio
    public int getContador(){
        return contador;
    }
    // Regresa el arreglo de instrumentos
    public Instrumento[] getInstrumentos(){
        return instrumentos;
    }
    
    // Variables de la clase
    private int ID;
    private String descripcion;
    private Instrumento[] instrumentos = new Instrumento[100];
    private int contador = 0;
    // Constructor de la clase
    public TipoInstrumento(int IDE, String descripcionE){
        this.ID = IDE;
        this.descripcion = descripcionE;
    }
    
    // Agregar instrumento como una pila
    public void agregarInstrumento(Instrumento nuevoInstrumento){
        if (contador < instrumentos.length){
            instrumentos[contador++] = nuevoInstrumento; // se usa y luego suma
            //contador++;
        }
    }
   // Eliminar instrumento como una pilea
    public void eliminarInstrumento(){
        if (contador > 0){
        //contador--;
        instrumentos[--contador] = null; // Se resta y luego se usa
        }
    }
    
}
