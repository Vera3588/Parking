/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines_logical;


public class Sensor {
    public static Sensor[][] sensores;
    private int estado = 0;
    
    public Sensor(){
    }
    
    public Sensor(int e){
        estado = e;
    }

    public String toString(){
        String est = "";
        if(estado==1){
            est = "Estado: 1-Ocupado"; 
        }else{
            est = "Estado: 0-Libre"; 
        }
        return est;
    }
    
    public static void desocupar(int piso, int esp){
        sensores[piso][esp] = null;
    }
    
    public static String sensorLibre(){
        String est = "";
        for(int i=0; i < sensores.length; i++) {  
            for(int j=0;j<sensores[0].length;j++){
                if(sensores[i][j] == null){
                    est += "Piso: "+i+"\n"+"Espacio: "+j+"\n\n";
                }
            }
        }
        return est;
    }
    
    public static String sensoresEstado(){
        String est = "";
        for(int i=0; i < sensores.length; i++) {  
            for(int j=0;j<sensores[0].length;j++){
                if(Sensor.sensores[i][j]==null){
                    est += "Piso: "+i+"\n"+"Espacio: "
                    +j+"\n Estado: Libre\n";
                }else{
                    est += "Piso: "+i+"\n"+"Espacio: "
                    +j+"\n Estado: Ocupado\n";
                }
                    
            }
        }
        return est;
    }
    
}
