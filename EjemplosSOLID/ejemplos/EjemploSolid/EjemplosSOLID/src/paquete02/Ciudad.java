/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Italo
 */
public class Ciudad {
    private String nombre;
    
    public Ciudad(String n) {
        nombre = n;
    }
    
    public void establecerNonmbre(String n) {
        nombre = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
}
