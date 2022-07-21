/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author josed
 */
public class MetodosTelevisor {
    private double totalPrecios;
    private ArrayList<Televisor> tele;
    private double televisorCaro;
    private String listaMarcas;

    public void totalPrecioTvs(ArrayList<Televisor> t) {
        for (int i = 0; i < t.size(); i++) {
            totalPrecios = totalPrecios + t.get(i).obtenerPrecio();
        }
    }

    public double televisorMasCaro() {
        double s = 0;
        for (Televisor t : obtenerTelevisor()) {
            if (t.obtenerPrecio() > s) {
                televisorCaro = t.obtenerPrecio();
            }
            s = t.obtenerPrecio();
        }
        return televisorCaro;
    }
    
    public String listaMarcasVendidas(ArrayList<Televisor> t){
        listaMarcas = "";
        for (int i = 0; i < t.size(); i++) {
            listaMarcas = String.format("%s%s\n", listaMarcas, 
                    t.get(i).obtenerMarca());
        }
        return listaMarcas;
    }

    public void establecerTelevisores(ArrayList<Televisor> t) {
        tele = t;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return tele;
    }

    public double obtenerTotalPrecios() {
        return totalPrecios;
    }

    public double obtenertelevisorCaro(){
        return televisorCaro;
    }
    
    public String obtenerlistaMarcas(){
        return listaMarcas;
    }
    
    @Override
    public String toString() {
        String cadena = "Listado De Televisores";

        for (Televisor t : obtenerTelevisor()) {
            cadena = String.format("%s\n\t"
                    + "Marca Del Televisor: %s\n"
                    + "\tPrecio Del Televisor: %.2f\n",
                    cadena,
                    t.obtenerMarca(),
                    t.obtenerPrecio());
        }
        
        cadena = String.format("%s\nListado De Las Marcas Vendidas: \n%s", 
                cadena,
                obtenerlistaMarcas());

        cadena = String.format("%s\n"
                + "Televisor Mas Caro: %.2f\n"
                + "Total De La Venta De Televisores: %.2f\n",
                cadena,
                obtenertelevisorCaro(),
                obtenerTotalPrecios());

        return cadena;
    }
}
