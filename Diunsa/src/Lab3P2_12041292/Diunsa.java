package Lab3P2_12041292;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Diunsa {

    public static void main(String[] args) {

        ArrayList articulos = new ArrayList();
        ArrayList personal = new ArrayList();
        ArrayList customers = new ArrayList();

        int resp = 0;

        while (resp != 2) {
            resp = Integer.parseInt(JOptionPane.showInputDialog("----Principal----\n"
                    + "1. Login\n"
                    + "2. Salir"));

            switch (resp) {
                case 1: {
                    //Login
                    String usuario = JOptionPane.showInputDialog("Ingrese usuario").toLowerCase();
                    int code = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
                    if ("admin".equals(usuario) && code == 1234) {
                        //admin
                        JOptionPane.showMessageDialog(null, "Bienvenido Jefe");
                        int posi = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar\n"
                                + "1. Administrar Productos\n"
                                + "2. Ver Empleados\n"
                                + "3. Salir"));
                        switch (posi) {
                            case 1: {
                                //productos
                                int arti = 0;
                                while (arti != 5) {
                                    arti = Integer.parseInt(JOptionPane.showInputDialog("Que producto desearia modificar\n"
                                            + "1. TELEVISORES\n"
                                            + "2. CONSOLAS\n"
                                            + "3. EQUIPOS DE SONIDO\n"
                                            + "4. TEATRO EN CASA\n"
                                            + "5. SALIR"));

                                    switch (arti) {
                                        case 1: {
                                            JOptionPane.showMessageDialog(null, "TELEVISORES");
                                            String iden = JOptionPane.showInputDialog("Identificador de la tienda");
                                            String ubi = JOptionPane.showInputDialog("Ubicacion de la tienda");
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de empleados"));
                                            int cantiP = Integer.parseInt(JOptionPane.showInputDialog("CAntidad de cajas de pago"));
                                            String producto = JOptionPane.showInputDialog("Producto mas a vender");
                                            int artic = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de articulos en la tienda"));
                                            int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de serie del producto a ingresar"));
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precios"));
                                            String garantia = JOptionPane.showInputDialog("Garantia del producto");
                                            String color = JOptionPane.showInputDialog("Color del producto");
                                            int tama = Integer.parseInt(JOptionPane.showInputDialog("El tama de la pantalla"));
                                            String aux = JOptionPane.showInputDialog("Es Smart?");
                                            char x = aux.charAt(0);
                                            boolean smart;
                                            if (x == 's') {
                                                smart = true;
                                            } else {
                                                smart = false;
                                            }
                                            String marca = JOptionPane.showInputDialog("Marca del televisor");
                                            int cantidadd = 0;
                                            while (cantidadd <= artic) {
                                                cantidadd = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de televisores"));
                                            }
                                            int grosor = Integer.parseInt(JOptionPane.showInputDialog("Grosor del televisor"));
                                            articulos.add(new Televisores(tama, smart, marca, cantidadd, grosor, num, precio, garantia, color, iden, ubi, cantidad, cantiP, producto, artic));
                                            break;
                                        }
                                        case 2: {
                                            JOptionPane.showMessageDialog(null, "CONSOLAS");
                                            String iden = JOptionPane.showInputDialog("Identificador de la tienda");
                                            String ubi = JOptionPane.showInputDialog("Ubicacion de la tienda");
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de empleados"));
                                            int cantiP = Integer.parseInt(JOptionPane.showInputDialog("CAntidad de cajas de pago"));
                                            String producto = JOptionPane.showInputDialog("Producto mas a vender");
                                            int artic = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de articulos en la tienda"));
                                            int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de serie del producto a ingresar"));
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precios"));
                                            String garantia = JOptionPane.showInputDialog("Garantia del producto");
                                            String color = JOptionPane.showInputDialog("Color del producto");
                                            String marca = JOptionPane.showInputDialog("Marca de la consola");
                                            int cantidadgb = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de almacenamiento "));
                                            int controles = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de controles"));
                                            int accesorios = Integer.parseInt(JOptionPane.showInputDialog("Numero de accesorios"));
                                            String tarjeta = JOptionPane.showInputDialog("Informacion sobre la tarjeta");
                                            articulos.add(new Consolas(marca, cantidadgb, controles, accesorios, tarjeta, num, precio, garantia, color, iden, ubi, cantidad, cantiP, producto, artic));
                                            break;
                                        }
                                        case 3: {
                                            JOptionPane.showMessageDialog(null, "EQUPOS DE SONIDO");
                                            String iden = JOptionPane.showInputDialog("Identificador de la tienda");
                                            String ubi = JOptionPane.showInputDialog("Ubicacion de la tienda");
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de empleados"));
                                            int cantiP = Integer.parseInt(JOptionPane.showInputDialog("CAntidad de cajas de pago"));
                                            String producto = JOptionPane.showInputDialog("Producto mas a vender");
                                            int artic = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de articulos en la tienda"));
                                            int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de serie del producto a ingresar"));
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precios"));
                                            String garantia = JOptionPane.showInputDialog("Garantia del producto");
                                            String color = JOptionPane.showInputDialog("Color del producto");
                                            int altavoces = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de altavoces"));
                                            int potencia = Integer.parseInt(JOptionPane.showInputDialog("Potencia maxima de potencia"));
                                            int puertos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de puertos que posee"));
                                            int discos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de discos que dispone"));
                                            int usb = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de puertos USB"));
                                            articulos.add(new Equipos(altavoces, potencia, puertos, discos, usb, num, precio, garantia, color, iden, ubi, cantidad, cantiP, producto, artic));
                                            break;
                                        }
                                        case 4: {
                                            JOptionPane.showMessageDialog(null, "TEATRO EN CASA");
                                            String iden = JOptionPane.showInputDialog("Identificador de la tienda");
                                            String ubi = JOptionPane.showInputDialog("Ubicacion de la tienda");
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de empleados"));
                                            int cantiP = Integer.parseInt(JOptionPane.showInputDialog("CAntidad de cajas de pago"));
                                            String producto = JOptionPane.showInputDialog("Producto mas a vender");
                                            int artic = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de articulos en la tienda"));
                                            int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de serie del producto a ingresar"));
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precios"));
                                            String garantia = JOptionPane.showInputDialog("Garantia del producto");
                                            String color = JOptionPane.showInputDialog("Color del producto");
                                            int altavoces = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de altavoces"));
                                            int discos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad discos Blueray"));
                                            String limpieza = JOptionPane.showInputDialog("Info en cuanto a la limpieza");
                                            String lector = JOptionPane.showInputDialog("Infro sobre el disco lector");
                                            articulos.add(new Teatro(altavoces, discos, limpieza, lector, num, precio, garantia, color, iden, ubi, cantidad, cantiP, producto, artic));
                                            break;

                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                //empleados
                                if (!personal.isEmpty()) {
                                    for (Object i : personal) {
                                        JOptionPane.showMessageDialog(null, i);
                                    }
                                    int posic = 0;
                                    while (posic != 2) {
                                        posic = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                                                + "1. Modificar\n"
                                                + "2. Eliminar"));

                                        switch (posic) {
                                            case 1: {
                                                //modificar
                                                int aux = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea Modificar"));
                                                if (aux >= 0 && aux <= personal.size()) {
                                                    if (personal.get(aux) instanceof Cajeros) {
                                                        String nam = JOptionPane.showInputDialog("Ingrese nombre");
                                                        String apellid = JOptionPane.showInputDialog("Ingrese Apellido");
                                                        double salaro = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                                        String nacionalida = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de a;os laborando en Diunsa"));
                                                        String horario = JOptionPane.showInputDialog("Horario de trabajo");
                                                        String almuerzo = JOptionPane.showInputDialog("Horario del almuerzo");
                                                        double met = Double.parseDouble(JOptionPane.showInputDialog("Meta a vender"));
                                                        int can = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes atendidos"));
                                                        ((Cajeros) personal.get(aux)).setNombre(nam);
                                                        ((Cajeros) personal.get(aux)).setApellido(apellid);
                                                        ((Cajeros) personal.get(aux)).setSalario(salaro);
                                                        ((Cajeros) personal.get(aux)).setNacionalidad(nacionalida);
                                                        ((Cajeros) personal.get(aux)).setCantidada(cantidad);
                                                        ((Cajeros) personal.get(aux)).setHorario(horario);
                                                        ((Cajeros) personal.get(aux)).setAlmuerzo(almuerzo);
                                                        ((Cajeros) personal.get(aux)).setMetaaVender(met);
                                                        ((Cajeros) personal.get(aux)).setEmpleadosAtentidos(can);
                                                    } else if (personal.get(aux) instanceof Supervisor) {
                                                        String name = JOptionPane.showInputDialog("Ingrese nombre");
                                                        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                                                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                                        String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                                        int sala = Integer.parseInt(JOptionPane.showInputDialog("Salario Promedio"));
                                                        int meta = Integer.parseInt(JOptionPane.showInputDialog("Meta promedio que desea"));
                                                        ((Supervisor) personal.get(aux)).setNombre(name);
                                                        ((Supervisor) personal.get(aux)).setApellido(apellido);
                                                        ((Supervisor) personal.get(aux)).setSalario(salario);
                                                        ((Supervisor) personal.get(aux)).setNacionalidad(nacionalidad);
                                                        ((Supervisor) personal.get(aux)).setSalarioPromedio(sala);
                                                        ((Supervisor) personal.get(aux)).setMeta(meta);
                                                    } else if (personal.get(aux) instanceof Accesor) {
                                                        String nam = JOptionPane.showInputDialog("Ingrese nombre");
                                                        String apellid = JOptionPane.showInputDialog("Ingrese Apellido");
                                                        double salaro = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                                        String nacionalida = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                                        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes que ha atendido anteriormente"));
                                                        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos que suelen comprar"));
                                                        int credito = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de creditos concedidos"));
                                                        ((Accesor) personal.get(aux)).setNombre(nam);
                                                        ((Accesor) personal.get(aux)).setApellido(apellid);
                                                        ((Accesor) personal.get(aux)).setSalario(salaro);
                                                        ((Accesor) personal.get(aux)).setNacionalidad(nacionalida);
                                                        ((Accesor) personal.get(aux)).setClientes(clientes);
                                                        ((Accesor) personal.get(aux)).setCantidadProductos(Cantidad);
                                                        ((Accesor) personal.get(aux)).setCredios(credito);

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Poscion no valida");
                                                    }
                                                }
                                                break;
                                            }
                                            case 2: {
                                                //eliminar
                                                if (!personal.isEmpty()) {
                                                    int aux = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea eliminar"));
                                                    if (aux >= 0 && aux <= personal.size()) {
                                                        personal.remove(aux);
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Posicion no valida");
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "No cuenta con empleados ahora mismo");
                                                }
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No hay empleados registrados por el momento");
                                }
                                break;
                            }
                        }

                    } else if ("supervisor".equals(usuario)) {
                        String name = JOptionPane.showInputDialog("Ingrese nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                        String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad");
                        int sala = Integer.parseInt(JOptionPane.showInputDialog("Salario Promedio"));
                        int meta = Integer.parseInt(JOptionPane.showInputDialog("Meta promedio que desea"));
                        personal.add(new Supervisor(name, apellido, salario, nacionalidad, sala, meta, usuario, code));
                        int op = 0;
                        while (op != 5) {
                            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                                    + "1. Listar Cajeros y Asesores\n"
                                    + "2. Modificar Asesores o Cajeros\n"
                                    + "3. Eliminar Cajero\n"
                                    + "4. Eliminar Asesor\n"
                                    + "5. Salir"));

                            switch (op) {

                                case 1: {

                                    if (!personal.isEmpty()) {
                                        for (Object t : personal) {
                                            String total = " ";
                                            if (t instanceof Cajeros) {
                                                total += t;
                                                JOptionPane.showMessageDialog(null, personal.indexOf(t));
                                                JOptionPane.showMessageDialog(null, total);
                                            } else if (t instanceof Accesor) {
                                                total += t;
                                                JOptionPane.showMessageDialog(null, personal.indexOf(t));
                                                JOptionPane.showMessageDialog(null, total);
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opcion No Disponible");
                                    }
                                    break;
                                }
                                case 2: {
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea modificar"));
                                    if (personal.get(posic) instanceof Accesor) {
                                        String nam = JOptionPane.showInputDialog("Ingrese nombre");
                                        String apellid = JOptionPane.showInputDialog("Ingrese Apellido");
                                        double salaro = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                        String nacionalida = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes que ha atendido anteriormente"));
                                        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos que suelen comprar"));
                                        int credito = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de creditos concedidos"));
                                        ((Accesor) personal.get(posic)).setNombre(nam);
                                        ((Accesor) personal.get(posic)).setApellido(apellid);
                                        ((Accesor) personal.get(posic)).setSalario(salaro);
                                        ((Accesor) personal.get(posic)).setNacionalidad(nacionalida);
                                        ((Accesor) personal.get(posic)).setClientes(clientes);
                                        ((Accesor) personal.get(posic)).setCantidadProductos(Cantidad);
                                        ((Accesor) personal.get(posic)).setCredios(credito);

                                    } else if (personal.get(posic) instanceof Cajeros) {
                                        String nam = JOptionPane.showInputDialog("Ingrese nombre");
                                        String apellid = JOptionPane.showInputDialog("Ingrese Apellido");
                                        double salaro = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                        String nacionalida = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de a;os laborando en Diunsa"));
                                        String horario = JOptionPane.showInputDialog("Horario de trabajo");
                                        String almuerzo = JOptionPane.showInputDialog("Horario del almuerzo");
                                        double met = Double.parseDouble(JOptionPane.showInputDialog("Meta a vender"));
                                        int can = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes atendidos"));
                                        ((Cajeros) personal.get(posic)).setNombre(nam);
                                        ((Cajeros) personal.get(posic)).setApellido(apellid);
                                        ((Cajeros) personal.get(posic)).setSalario(salaro);
                                        ((Cajeros) personal.get(posic)).setNacionalidad(nacionalida);
                                        ((Cajeros) personal.get(posic)).setCantidada(cantidad);
                                        ((Cajeros) personal.get(posic)).setHorario(horario);
                                        ((Cajeros) personal.get(posic)).setAlmuerzo(almuerzo);
                                        ((Cajeros) personal.get(posic)).setMetaaVender(met);
                                        ((Cajeros) personal.get(posic)).setEmpleadosAtentidos(can);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Posicion NO disponible");
                                    }
                                    break;
                                }
                                case 3: {
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea borrar"));
                                    if (personal.get(posic) instanceof Cajeros) {
                                        personal.remove(posic);
                                        JOptionPane.showMessageDialog(null, "Se ha borrado exitosamente");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Posicion no Disponible");
                                    }
                                    break;
                                }
                                case 4: {
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea borrar"));
                                    if (personal.get(posic) instanceof Accesor) {
                                        personal.remove(posic);
                                        JOptionPane.showMessageDialog(null, "Se ha borrado exitosamente");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Posicion no Disponible");
                                    }
                                    break;
                                }
                            }
                        }
                    } else if ("asesor financiero".equals(usuario)) {
                        String name = JOptionPane.showInputDialog("Ingrese nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                        String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad");
                        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes que ha atendido anteriormente"));
                        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos que suelen comprar"));
                        int credito = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de creditos concedidos"));
                        personal.add(new Accesor(name, apellido, salario, nacionalidad, clientes, Cantidad, credito, usuario, code));
                        int op = 0;
                        while (op != 5) {
                            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                                    + "1. Listar Cajero\n"
                                    + "2. Listar Supervisores\n"
                                    + "3. Ver mi informacion\n"
                                    + "4. Modificar mi informacion\n"
                                    + "5. Salir"));

                            switch (op) {
                                case 1: {
                                    if (!personal.isEmpty()) {
                                        for (Object t : personal) {
                                            String total = " ";
                                            if (t instanceof Cajeros) {
                                                total += t;
                                                JOptionPane.showMessageDialog(null, personal.indexOf(t));
                                                JOptionPane.showMessageDialog(null, total);
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opcion No Disponible");
                                    }
                                    break;
                                }
                                case 2: {
                                    if (!personal.isEmpty()) {
                                        for (Object t : personal) {
                                            String total = " ";
                                            if (t instanceof Supervisor) {
                                                total += t;
                                                JOptionPane.showMessageDialog(null, personal.indexOf(t));
                                                JOptionPane.showMessageDialog(null, total);
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opcion No Disponible");
                                    }
                                    break;
                                }
                                case 3: {
                                    String total = " ";
                                    total += personal.get(personal.size() - 1);
                                    JOptionPane.showMessageDialog(null, total);
                                    break;
                                }
                                case 4: {
                                    String nam = JOptionPane.showInputDialog("Ingrese nombre");
                                    String apellid = JOptionPane.showInputDialog("Ingrese Apellido");
                                    double salaro = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                                    String nacionalida = JOptionPane.showInputDialog("Ingrese nacionalidad");
                                    int cliente = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes que ha atendido anteriormente"));
                                    int Cantida = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos que suelen comprar"));
                                    int credit = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de creditos concedidos"));
                                    ((Accesor) personal.get(personal.size() - 1)).setNombre(nam);
                                    ((Accesor) personal.get(personal.size() - 1)).setApellido(apellid);
                                    ((Accesor) personal.get(personal.size() - 1)).setSalario(salaro);
                                    ((Accesor) personal.get(personal.size() - 1)).setNacionalidad(nacionalida);
                                    ((Accesor) personal.get(personal.size() - 1)).setClientes(cliente);
                                    ((Accesor) personal.get(personal.size() - 1)).setCantidadProductos(Cantida);
                                    ((Accesor) personal.get(personal.size() - 1)).setCredios(credit);
                                    break;
                                }
                            }
                        }

                    } else if ("cajero".equals(usuario)) {
                        String name = JOptionPane.showInputDialog("Ingrese nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                        String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de a;os laborando en Diunsa"));
                        String horario = JOptionPane.showInputDialog("Horario de trabajo");
                        String almuerzo = JOptionPane.showInputDialog("Horario del almuerzo");
                        double meta = Double.parseDouble(JOptionPane.showInputDialog("Meta a vender"));
                        int can = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes atendidos"));
                        personal.add(new Cajeros(name, apellido, salario, nacionalidad, cantidad, horario, almuerzo, can, meta, usuario, code));
                        int op = 0;
                        while (op != 3) {
                            op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                                    + "1. Ver nuestra informacion\n"
                                    + "2. Ver productos\n"
                                    + "3. Salir"));

                            switch (op) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, personal.get(personal.size() - 1));
                                    break;
                                }
                                case 2: {
                                    if (!articulos.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Articulos Disponibles");
                                        for (Object i : articulos) {
                                            String total = "";
                                            total += i;
                                            JOptionPane.showMessageDialog(null, total);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Actualmente no tiene articulos disponibles");
                                    }
                                    break;
                                }
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente");
                        String name = JOptionPane.showInputDialog("Ingrese nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                        String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Dinero disponible"));
                        String direccion = JOptionPane.showInputDialog("Direccion a Domicilio");
                        customers.add(new Clientes(name, apellido, salario, nacionalidad, cantidad, direccion, usuario, code));
                        int opcion = 0;
                        JOptionPane.showMessageDialog(null, "Bienvenido "+((Clientes)customers.get(customers.size()-1)).getNombre());
                        while (opcion != 3) {

                            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n"
                                    + "1. Ver su informacion\n"
                                    + "2. Eliminar Cuenta\n"
                                    + "3. Comprar Articulo\n"));

                            switch (opcion) {
                                case 1: {
                                    String total = " ";
                                    total += customers.get(customers.size() - 1);
                                    JOptionPane.showMessageDialog(null, total);
                                    break;
                                }
                                case 2: {
                                    customers.remove(customers.size() - 1);
                                    opcion = 3;
                                    break;
                                }
                                case 3: {
                                    if (!articulos.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Articulos Disponibles");
                                        for (Object i : articulos) {
                                            String total = "";
                                            total += i;
                                            JOptionPane.showMessageDialog(null, articulos.indexOf(i));
                                            JOptionPane.showMessageDialog(null, total);
                                        }
                                        int posi = Integer.parseInt(JOptionPane.showInputDialog("Luego de ver los productos y las posiciones donde se ubican\n"
                                                + "Que desea Llevar?"));
                                        if (posi >= 0 && posi <= articulos.size()) {
                                            int x = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea llevar"));
                                            int aux = ((Articulos) articulos.get(posi)).getCapacidad();
                                            int total = aux - x;
                                            int aux2 = ((Clientes) customers.get(customers.size() - 1)).getCantidad();
                                            double aux3 = ((Articulos) articulos.get(posi)).getPrecio();
                                            int conversion = (int) aux3;
                                            int total2 = conversion * x;
                                            if (total >= 0 && aux2 <= total2) {
                                                JOptionPane.showMessageDialog(null, "La compra se ha realizaod exitosamente");
                                                ((Televisores) personal.get(posi)).setCantidad(total);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No contamos con la cantidad que solicita en su compra o no tiene el efectivo suficiente");
                                            }

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Actualmente no tenemos articulos disponibles");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }

            }
        }
    }
}
