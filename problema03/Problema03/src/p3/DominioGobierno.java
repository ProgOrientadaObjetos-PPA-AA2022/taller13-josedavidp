/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author josed
 */
public class DominioGobierno implements Dominio{

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = "gob.ec";
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}
