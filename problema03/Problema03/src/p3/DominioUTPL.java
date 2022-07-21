/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author josed
 */
public class DominioUTPL implements Dominio{

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = "utpl.edu.ec";
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}
