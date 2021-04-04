/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines_logical;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;  
import java.util.Scanner;

public class Principal {
    
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pisos: ");
        int pisos = sc.nextInt();
        System.out.println("Ingrese la cantidad de espacios por piso: ");
        int espacio = sc.nextInt();
        System.out.println("Valor por hora de moto");
        int precioMoto = sc.nextInt();
        System.out.println("Valor por hora de Carro");
        int precioCarro = sc.nextInt();

        Vehiculo.vehiculos = new Vehiculo[pisos][espacio];
        Sensor.sensores = new Sensor[pisos][espacio];

        Vehiculo.tamano = pisos*espacio;
        int opc = 1;
        do{
            System.out.println("--Menú--"+"\n\n"+"0  -- Salir"+
                "\n"+"1  -- Imprimir puestos desocupados"+
                "\n"+"2  -- Ingresar vehículo (sin valor)"+
                "\n"+"3  -- Ingresar vehículo"+
                "\n"+"4  -- Información de todos los vehículos"+
                "\n"+"5  -- Historial de vehículos guardados"+
                "\n"+"6  -- Verificar puesto de parqueadero"+
                "\n"+"7  -- Verificar todos los puesto de parqueadero"+
                "\n"+"8  -- Buscar por placa"+
                "\n"+"9  -- Ordenar por valor"+
                "\n"+"10 -- Sacar Vehículo");
            opc = sc.nextInt();
            System.out.println("\n"); 
            switch(opc){
                case 1:
                System.out.println(Sensor.sensorLibre());
                break;
                case 2:
                System.out.println("Ingrese el piso: ");
                int p = sc.nextInt();

                System.out.println("Ingrese el espacio: ");
                int e = sc.nextInt();
                if(Sensor.sensores[p][e]!=null){
                    System.out.println("Espacio ocupado");
                }else{
                    System.out.println("\nIngrese los datos: ");

                    System.out.println("Tipo de Vehiculo(Carro/Moto): ");
                    String tipo = sc.next();

                    System.out.println("Placa: ");
                    String placa = sc.next();

                    System.out.println("Marca: ");
                    String marca = sc.next();  

                    System.out.println("Color: ");
                    String color = sc.next();
                    Date fecha= new Date();
                    DateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
                    DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
                    
                    
                    if(tipo.equalsIgnoreCase("Moto")){
                        Moto.vehiculos[p][e] = new Moto(placa,marca,color,tipo,fechaFormat,horaFormat);
                        System.out.println(Moto.vehiculos[p][e].toString());
                    }else if(tipo.equalsIgnoreCase("Carro")){
                        Carro.vehiculos[p][e] = new Carro(placa,marca,color,tipo, fechaFormat,horaFormat);  
                        System.out.println(Carro.vehiculos[p][e].toString());
                    }else{
                        System.out.println("El tipo de Vehiculo ingresado es incorrecto");    
                    }
                    //Vehiculo.vehiculos[p][e] = new Vehiculo(placa,marca,color);//
                    Sensor.sensores[p][e] = new Sensor(1);  
                }

                break;
                case 3:
                System.out.println("Ingrese el piso: ");
                int p1 = sc.nextInt();

                System.out.println("\nIngrese el espacio: ");
                int e1 = sc.nextInt();
                if(Sensor.sensores[p1][e1]!=null){
                    System.out.println("Espacio ocupado");
                }else{
                    System.out.println("Ingrese los datos: ");

                    System.out.println("Tipo de Vehiculo(Carro/Moto): ");
                    String tipo = sc.next();

                    System.out.println("Placa: ");
                    String placa = sc.next();

                    System.out.println("Marca: ");
                    String marca = sc.next();  

                    System.out.println("Color: ");
                    String color = sc.next();  

                    System.out.println("Valor: ");
                    int valor = sc.nextInt(); 
                    Date fecha= new Date(); 
                    DateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
                    DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
                    if(tipo.equalsIgnoreCase("Moto")){
                        Moto.vehiculos[p1][e1] = new Moto(placa,marca,color,valor,tipo,fechaFormat,horaFormat);
                    }else if(tipo.equalsIgnoreCase("Carro")){
                        Carro.vehiculos[p1][e1] = new Carro(placa,marca,color,valor,tipo,fechaFormat,horaFormat);  
                    }else{
                        System.out.println("El tipo de Vehiculo ingresado es incorrecto");    
                    }
                    //Vehiculo.vehiculos[p1][e1] = new Vehiculo(placa,marca,color,valor);//
                    Sensor.sensores[p1][e1] = new Sensor(1);
                    System.out.println(Vehiculo.vehiculos[p1][e1].toString());
                }
                break;
                case 4:
                System.out.println(Vehiculo.toStringVehiculos());

                break;
                case 5:
                System.out.println("Vehículos: "+Vehiculo.cantidadVehiculos());

                break;
                case 6:
                System.out.println("Ingrese el piso: ");
                int piso = sc.nextInt();

                System.out.println("Ingrese el espacio: ");
                int esp = sc.nextInt();
                if(Sensor.sensores[piso][esp]==null){
                    System.out.println("\nEstado: 0-Libre");
                }else{
                    System.out.println("\nEstado: 1-Ocupado");
                }
                break;
                case 7:
                System.out.println(Sensor.sensoresEstado());
                break;
                default:
                if(opc != 0){
                    System.out.println("Comando incorrecto");
                }else{
                    System.out.println("Saliendo");
                }    
                break;
                case 8:
                System.out.println("Ingrese la placa: ");
                String placa = sc.next();

                System.out.println(Vehiculo.Placa(placa));
                break;
                case 9:
                Vehiculo[] t = Vehiculo.ordenarVehiculos();
                for(int i=0;i<t.length;i++){
                    System.out.println(t[i].toString()+"\n");
                }
                break;
                case 10:
                System.out.println("Ingrese el piso: ");
                piso = sc.nextInt();

                System.out.println("Ingrese el espacio: ");
                esp = sc.nextInt();

                if(Sensor.sensores[piso][esp]==null){
                    System.out.println("Espacio libre");
                }else {
                    Sensor.desocupar(piso, esp);
                    System.out.println("Espacio desocupado "+"\nTotal a pagar: "+Vehiculo.precio(piso, esp, precioMoto, precioCarro));
                }
                break;
            }
            System.out.println("\n");
        }while(opc != 0); 
    } 
    
}
