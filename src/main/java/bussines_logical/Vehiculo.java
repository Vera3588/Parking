/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines_logical;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehiculo {

    public static Vehiculo[][] vehiculos;
    public static int tamano;
    public static int cantidad = 0;

    static Vehiculo[] ordenarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    private String tipo;
    public Date fecha = new Date();
    public DateFormat hora, fech;

    public Vehiculo() {
    }

    public Vehiculo(String p, String m, String c, String t, DateFormat f, DateFormat h) {
        this(p, m, c, 30000000, t, f, h);
    }

    public Vehiculo(String p, String m, String c, int v, String t, DateFormat f, DateFormat h) {
        placa = p;
        marca = m;
        color = c;
        valorComercial = v;
        tipo = t;
        fech = f;
        hora = h;
        cantidad++;
    }

    public String toString() {
        String info = "\nTipo: " + tipo + "\nPlaca: " + placa + "\nMarca: " + marca + "\nColor: " + color + "\nValor: " + valorComercial + "\nFecha: " + fech.format(fecha) + "\nHora: " + hora.format(fecha);
        return info;
    }
    

    public static String Placa(String placa) {
        String lista = "";

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[0].length; j++) {
                if (vehiculos[i][j] != null && vehiculos[i][j].placa.equals(placa)) {
                    lista += "\nPiso " + (i)
                            + " - Espacio " + (j)
                            + "\n Tipo: " + vehiculos[i][j].tipoVehiculo()
                            + "\n Placa: "
                            + vehiculos[i][j].placa + "\n Marca: "
                            + vehiculos[i][j].marca + "\n Color: "
                            + vehiculos[i][j].color +"\n Fecha: "
                            + vehiculos[i][j].fech.format(vehiculos[i][j].fecha) + "\n Hora: "
                            + vehiculos[i][j].hora.format(vehiculos[i][j].fecha) + "\n";
                }
            }
        }
        if (lista.equals("")) {
            lista = "No se ha ingresado ningun vehículo con placa: " + placa;
        }
        return lista;
    }


    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getValor() {
        return valorComercial;
    }

    public static String toStringVehiculos() {
        String infoVehiculos = "";

        infoVehiculos = "Piso;Espacio;Tipo;Placa;Marca;Color;Fecha;Hora;\n";

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[0].length; j++) {
                if (vehiculos[i][j] != null) {
                    infoVehiculos
                            += (i) + ";"
                            + (j) + ";"
                            + vehiculos[i][j].tipoVehiculo() + ";"
                            + vehiculos[i][j].placa + ";"
                            + vehiculos[i][j].marca + ";"
                            + vehiculos[i][j].color + ";"
                            + vehiculos[i][j].fech.format(vehiculos[i][j].fecha) + ";"
                            + vehiculos[i][j].hora.format(vehiculos[i][j].fecha) + "\n";
                }
            }
        }
        System.out.println(infoVehiculos);
        return infoVehiculos;
    }
    
    
    
    

    public static int precio(int piso, int esp, int precioMoto, int precioCarro) {
        String dr = vehiculos[piso][esp].hora.format(vehiculos[piso][esp].fecha);

        String h = dr.substring(0, dr.indexOf(':'));
        String m = dr.substring(dr.indexOf(':') + 1, dr.lastIndexOf(':'));
        String s = dr.substring(dr.lastIndexOf(':') + 1);

        int hi = Integer.parseInt(h);
        int mi = Integer.parseInt(m);
        int si = Integer.parseInt(s);

        Date f1 = new Date();
        DateFormat horaF = new SimpleDateFormat("HH:mm:ss");
        String hhf = horaF.format(f1);
        String h1 = hhf.substring(0, dr.indexOf(':'));
        String m1 = hhf.substring(dr.indexOf(':') + 1, dr.lastIndexOf(':'));
        String s1 = hhf.substring(dr.lastIndexOf(':') + 1);

        int hf = Integer.parseInt(h1);
        int mf = Integer.parseInt(m1);
        int sf = Integer.parseInt(s1);

        int hh = hf - hi;
        int mm = mf - mi;
        int ss = sf - si;
        int cobrar = 0;
        int total = (hh * 60) + mm;
        if (vehiculos[piso][esp].tipoVehiculo().equals("Moto")) {
            cobrar = (precioMoto / 60) * total;
        } else {
            cobrar = (precioCarro / 60) * total;
        }
        Vehiculo.eliminar(piso, esp);
        return cobrar;
    }

    public static void eliminar(int piso, int esp) {
        vehiculos[piso][esp] = null;
    }

    public static int cantidadVehiculos() {
        return cantidad;
    }

    public abstract String tipoVehiculo();
}
