/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("René",39);
        Persona p2 = new Persona("Santiago",20);
        
        System.out.printf("%s\n",p1.obtenerEdad());
        System.out.printf("%s\n",p2.obtenerEdad());
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(p1);
        miLista.add(p2);
        
        double promedio = p1.promedioEdades(miLista);
        System.out.printf("%.2f\n",promedio);
    }
    
}
