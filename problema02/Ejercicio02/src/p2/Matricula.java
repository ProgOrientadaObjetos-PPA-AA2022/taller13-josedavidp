/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author josed
 */
public abstract class Matricula {

    protected double tarifa;

    public abstract void establecerTarifa();

    public double obtenerTarifa() {
        return tarifa;
    }
}
