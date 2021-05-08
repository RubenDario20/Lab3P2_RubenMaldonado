/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3P2_12041292;

/**
 *
 * @author Ruben Dario Arias
 */
public class Accesor {

    private String nombre;
    private String apellido;
    private double salario;
    private String nacionalidad;
    private int clientes;
    private int cantidadProductos;
    private int credios;
    private String usuario;
    private int codigo;

    public Accesor() {
    }

    public Accesor(String nombre, String apellido, double salario, String nacionalidad, int clientes, int cantidadProductos, int credios, String usuario, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.clientes = clientes;
        this.cantidadProductos = cantidadProductos;
        this.credios = credios;
        this.usuario = usuario;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getCredios() {
        return credios;
    }

    public void setCredios(int credios) {
        this.credios = credios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Accesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", clientes=" + clientes + ", cantidadProductos=" + cantidadProductos + ", credios=" + credios + '}';
    }

}
