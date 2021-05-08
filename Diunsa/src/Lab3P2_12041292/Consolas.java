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
public class Consolas extends Articulos {

    private String marca;
    private int cantidadGB;
    private int cantidadControles;
    private int numaccesorios;
    private String infotarjeta;

    public Consolas() {
        super();
    }

    public Consolas(String marca, int cantidadGB, int cantidadControles, int numaccesorios, String infotarjeta, int numeroSerie, double precio, String garantia, String color, String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        super(numeroSerie, precio, garantia, color, identificador, ubicacion, cantidadE, cantidadP, articulo, capacidad);
        this.marca = marca;
        this.cantidadGB = cantidadGB;
        this.cantidadControles = cantidadControles;
        this.numaccesorios = numaccesorios;
        this.infotarjeta = infotarjeta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadGB() {
        return cantidadGB;
    }

    public void setCantidadGB(int cantidadGB) {
        this.cantidadGB = cantidadGB;
    }

    public int getCantidadControles() {
        return cantidadControles;
    }

    public void setCantidadControles(int cantidadControles) {
        this.cantidadControles = cantidadControles;
    }

    public int getNumaccesorios() {
        return numaccesorios;
    }

    public void setNumaccesorios(int numaccesorios) {
        this.numaccesorios = numaccesorios;
    }

    public String getInfotarjeta() {
        return infotarjeta;
    }

    public void setInfotarjeta(String infotarjeta) {
        this.infotarjeta = infotarjeta;
    }

    @Override
    public String toString() {
        return super.toString() + " Consolas{" + "marca=" + marca + ", cantidadGB=" + cantidadGB + ", cantidadControles=" + cantidadControles + ", numaccesorios=" + numaccesorios + ", infotarjeta=" + infotarjeta + '}';
    }

}
