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
public class MatriculaColegio extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t--Matricula Colegio--\n"
                + "\tValor De La Matricula: %.2f\n", tarifa);

        return cadena;

    }
}
