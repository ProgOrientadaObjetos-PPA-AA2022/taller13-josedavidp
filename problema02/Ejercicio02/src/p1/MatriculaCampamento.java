/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t--Matricula Campamento--\n"
                + "\tValor De La Matricula: %.2f\n", tarifa);

        return cadena;

    }
}
