/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3P2_12041292;

import java.util.ArrayList;

/**
 *
 * @author Ruben Dario Arias
 */
public class Supervisor {

    private String nombre;
    private String apellido;
    private double salario;
    private String nacionalidad;
    ArrayList<Cajeros> caja = new ArrayList();
    private int salarioPromedio;
    private int meta;
    private String usuario;
    private int codigo;

    public Supervisor() {
    }

    public Supervisor(String nombre, String apellido, double salario, String nacionalidad, int salarioPromedio, int meta, String usuario, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.salarioPromedio = salarioPromedio;
        this.meta = meta;
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

    public ArrayList<Cajeros> getClientes() {
        return caja;
    }

    public void setClientes(ArrayList<Cajeros> clientes) {
        this.caja = clientes;
    }

    public int getSalarioPromedio() {
        return salarioPromedio;
    }

    public void setSalarioPromedio(int salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
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
        return "Supervisor{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", clientes=" + caja + ", salarioPromedio=" + salarioPromedio + ", meta=" + meta + '}';
    }

}
