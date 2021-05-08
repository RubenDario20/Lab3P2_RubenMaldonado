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
public class Televisores extends Articulos {
    
    private int tama;
    private boolean smart;
    private String marca;
    private int cantidad;
    private int grosor;

    public Televisores() {
        super();
    }

    public Televisores(int tama, boolean smart, String marca, int cantidad, int grosor, int numeroSerie, double precio, String garantia, String color, String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        super(numeroSerie, precio, garantia, color, identificador, ubicacion, cantidadE, cantidadP, articulo, capacidad);
        this.tama = tama;
        this.smart = smart;
        this.marca = marca;
        this.cantidad = cantidad;
        this.grosor = grosor;
    }




    public int getTama() {
        return tama;
    }

    public void setTama(int tama) {
        this.tama = tama;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return super.toString()+ "Televisores{" + "tama=" + tama + ", smart=" + smart + ", marca=" + marca + ", cantidad=" + cantidad + ", grosor=" + grosor + '}';
    }
    
    
    
}
