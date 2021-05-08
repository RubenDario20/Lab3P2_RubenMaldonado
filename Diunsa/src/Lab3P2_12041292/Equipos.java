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
public class Equipos extends Articulos{
    
    private int altavoces;
    private int potenciamaxima;
    private int puertos;
    private int discos;
    private int usb;

    public Equipos() {
        super();
    }

    public Equipos(int altavoces, int potenciamaxima, int puertos, int discos, int usb, int numeroSerie, double precio, String garantia, String color, String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        super(numeroSerie, precio, garantia, color, identificador, ubicacion, cantidadE, cantidadP, articulo, capacidad);
        this.altavoces = altavoces;
        this.potenciamaxima = potenciamaxima;
        this.puertos = puertos;
        this.discos = discos;
        this.usb = usb;
    }



    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getPotenciamaxima() {
        return potenciamaxima;
    }

    public void setPotenciamaxima(int potenciamaxima) {
        this.potenciamaxima = potenciamaxima;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        return super.toString()+" Equipos{" + "altavoces=" + altavoces + ", potenciamaxima=" + potenciamaxima + ", puertos=" + puertos + ", discos=" + discos + ", usb=" + usb + '}';
    }
    
    
    
    
}
