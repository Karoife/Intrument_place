/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_proyecto2;

import java.util.UUID; // Paquete para generar el código GUID
/**
 *
 * @author joser
 */
public class Instrumento {
    // Metodos Set y Get
    public String getDni() { // Por comodidad devuelvo tipo String
        return dni.toString();
    }
    // No hay un set de dni ya que no se quiere cambiar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    // Por comodad se devuelve como tipo String
    public String getValor() {
        return String.format("%.2f", this.valor);
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    // Declaración de variables
    private UUID dni;
    private String nombre;
    private String condicion;
    private double valor;
    // Constructor de la clase
    public Instrumento(String nombreE, String condicionE, double valorE){
        this.dni = UUID.randomUUID(); // genera un código GUID aleatorio
        this.nombre = nombreE;
        this.condicion = condicionE;
        this.valor = valorE;
    }
    
}
