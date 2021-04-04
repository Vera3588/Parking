/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines_logical;

import java.text.DateFormat;

public class Moto extends Vehiculo{
    
       public Moto(String p, String m, String c, String t, DateFormat f, DateFormat h){
        super(p,m,c,t,f,h);
    }

    public Moto(String p, String m, String c, int v, String t, DateFormat f, DateFormat h){
        super(p,m,c,v,t,f,h);
    } 

    @Override
    public String tipoVehiculo(){
        return "Moto";
    }
    
}
