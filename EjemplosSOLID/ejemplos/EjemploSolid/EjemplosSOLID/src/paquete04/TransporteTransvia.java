/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Italo
 */
public class TransporteTransvia extends Transporte {

    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public void establecerTarifa() {
        tarifa = 20.0 + 0.1;
    }

    public String obtenerCooperativaTaxi() {
        return cooperativaTransvia;
    }

}
