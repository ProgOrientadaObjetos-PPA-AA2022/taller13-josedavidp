/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(2300.5);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(1300.2);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        System.out.println("-------------------------------------------------");

        MetodosTelevisor op = new MetodosTelevisor();
        op.establecerTelevisores(tvs);
        op.televisorMasCaro();
        op.totalPrecioTvs(tvs);
        op.listaMarcasVendidas(tvs);

        System.out.println(op);

    }
}
