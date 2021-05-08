/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3P2_12041292;

import java.awt.Color;

/**
 *
 * @author Ruben Dario Arias
 */
public class Teatro extends Articulos{
    
    private int altavoces;
    private int discosBlueray;
    private String infolimpieza;
    private String infoLector;

    public Teatro() {
        super();
    }

    public Teatro(int altavoces, int discosBlueray, String infolimpieza, String infoLector, int numeroSerie, double precio, String garantia, String color, String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        super(numeroSerie, precio, garantia, color, identificador, ubicacion, cantidadE, cantidadP, articulo, capacidad);
        this.altavoces = altavoces;
        this.discosBlueray = discosBlueray;
        this.infolimpieza = infolimpieza;
        this.infoLector = infoLector;
    }

    

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getDiscosBlueray() {
        return discosBlueray;
    }

    public void setDiscosBlueray(int discosBlueray) {
        this.discosBlueray = discosBlueray;
    }

    public String getInfolimpieza() {
        return infolimpieza;
    }

    public void setInfolimpieza(String infolimpieza) {
        this.infolimpieza = infolimpieza;
    }

    public String getInfoLector() {
        return infoLector;
    }

    public void setInfoLector(String infoLector) {
        this.infoLector = infoLector;
    }

    @Override
    public String toString() {
        return super.toString()+" Teatro{" + "altavoces=" + altavoces + ", discosBlueray=" + discosBlueray + ", infolimpieza=" + infolimpieza + ", infoLector=" + infoLector + '}';
    }
    
    
    
}
