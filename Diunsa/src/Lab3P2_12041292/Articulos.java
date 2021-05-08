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
public class Articulos extends Tiendas{
    private int numeroSerie;
    private double precio;
    private String garantia;
    private String color;

    public Articulos() {
        super();
    }

    public Articulos(int numeroSerie, double precio, String garantia, String color, String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        super(identificador, ubicacion, cantidadE, cantidadP, articulo, capacidad);
        this.numeroSerie = numeroSerie;
        this.precio = precio;
        this.garantia = garantia;
        this.color = color;
    }



    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" Articulos{" + "numeroSerie=" + numeroSerie + ", precio=" + precio + ", garantia=" + garantia + ", color=" + color + '}';
    }
    
    
}
