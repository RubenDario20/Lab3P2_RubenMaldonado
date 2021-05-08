/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3P2_12041292;


public class Tiendas {
    private String identificador;
    private String ubicacion;
    private int cantidadE;
    private int cantidadP;
    private String articulo;
    private int capacidad;

    public Tiendas() {
    }

    public Tiendas(String identificador, String ubicacion, int cantidadE, int cantidadP, String articulo, int capacidad) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.cantidadE = cantidadE;
        this.cantidadP = cantidadP;
        this.articulo = articulo;
        this.capacidad = capacidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadE() {
        return cantidadE;
    }

    public void setCantidadE(int cantidadE) {
        this.cantidadE = cantidadE;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "identificador=" + identificador + ", ubicacion=" + ubicacion + ", cantidadE=" + cantidadE + ", cantidadP=" + cantidadP + ", articulo=" + articulo + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
