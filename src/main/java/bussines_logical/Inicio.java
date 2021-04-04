/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bussines_logical;

import GUI.*;


public class Inicio {
    
    
    public static void main(String[] args) {
        
        GUISplash VentanSplash = new GUISplash();
        VentanSplash.setVisible(true);
        
         for (int i = 0; i <= 100; i++) {
           
            try {          
                Thread.sleep(20);
                VentanSplash.jPBSplash.setValue(i);
                VentanSplash.jTextoCarga.setText(Integer.toString(i)+"%");
                
            } catch (InterruptedException ex) {
                System.out.println("error en barra de carga");
            }
        }
         
        VentanSplash.dispose();
         
        
        GUITerminos VentanaTerminos = new GUITerminos();
        VentanaTerminos.setVisible(true);
         
        
        
        
    }
    
    
}
