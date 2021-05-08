/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3P2_12041292;

import java.util.Date;

/**
 *
 * @author Ruben Dario Arias
 */
public class Cajeros {

    private String nombre;
    private String apellido;
    private double salario;
    private String nacionalidad;
    private int cantidada;
    private String horario;
    private String almuerzo;
    private int empleadosAtentidos;
    private double metaaVender;
    private String usuario;
    private int codigo;

    public Cajeros() {
        super();
    }

    public Cajeros(String nombre, String apellido, double salario, String nacionalidad, int cantidada, String horario, String almuerzo, int empleadosAtentidos, double metaaVender, String usuario, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantidada = cantidada;
        this.horario = horario;
        this.almuerzo = almuerzo;
        this.empleadosAtentidos = empleadosAtentidos;
        this.metaaVender = metaaVender;
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

    public int getCantidada() {
        return cantidada;
    }

    public void setCantidada(int cantidada) {
        this.cantidada = cantidada;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public int getEmpleadosAtentidos() {
        return empleadosAtentidos;
    }

    public void setEmpleadosAtentidos(int empleadosAtentidos) {
        this.empleadosAtentidos = empleadosAtentidos;
    }

    public double getMetaaVender() {
        return metaaVender;
    }

    public void setMetaaVender(double metaaVender) {
        this.metaaVender = metaaVender;
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
        return "Cajeros{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", cantidada=" + cantidada + ", horario=" + horario + ", almuerzo=" + almuerzo + ", empleadosAtentidos=" + empleadosAtentidos + ", metaaVender=" + metaaVender + '}';
    }

}
