package Lab3P2_12041292;

import java.util.ArrayList;

/**
 *
 * @author Ruben Dario Arias
 */
public class Clientes {

    private String nombre;
    private String apellido;
    private double salario;
    private String nacionalidad;
    ArrayList articulos = new ArrayList();
    private int cantidad;
    private String DireccionDomicilio;
    private String usuario;
    private int codigo;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, double salario, String nacionalidad, int cantidad, String DireccionDomicilio, String usuario, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantidad = cantidad;
        this.DireccionDomicilio = DireccionDomicilio;
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

    public ArrayList getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList articulos) {
        this.articulos = articulos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccionDomicilio() {
        return DireccionDomicilio;
    }

    public void setDireccionDomicilio(String DireccionDomicilio) {
        this.DireccionDomicilio = DireccionDomicilio;
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
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", articulos=" + articulos + ", cantidad=" + cantidad + ", DireccionDomicilio=" + DireccionDomicilio + ", usuario=" + usuario + ", codigo=" + codigo + '}';
    }

    
    
}
