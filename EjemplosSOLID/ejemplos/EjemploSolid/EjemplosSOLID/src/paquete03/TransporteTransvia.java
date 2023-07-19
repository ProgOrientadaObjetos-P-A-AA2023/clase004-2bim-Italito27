/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Italo
 */
public class TransporteTransvia {

    private String cooperativaTransvia;
    public double tarifa;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public void establecerTarifa() {
        tarifa = 20.00 + 0.1;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
