/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea04;

import java.text.SimpleDateFormat;
import java.util.Date;
import cstio.*;

public class Calendario {
    int cuenta;
    //damos el formato para las fechas que se ingresaran
    String patron = "dd/MM/yyyy";
    SimpleDateFormat formato = new SimpleDateFormat(patron);
    //Trae la fecha actual
    Date fechaActual = new Date();
    //creamos arreglo de apuntadores a objetos de la clase Date()
    Date fechas[] = new Date[1000];
   //creamos el atributo d 
    Dialog d = new Dialog();
    
    public static void main(String[] args) {
        Calendario c = new Calendario();
        // TODO code application logic here
        //System.out.println(c.fechaActual);
        //System.out.println(c.formato.format(c.fechaActual));
        c.datos();
        for (int i = 0; i < 2; i++) {
            System.out.println(c.fechas[i]);            
        }
    }
    
    public boolean validar(String n){
        int dia, mes, año;
        String a[] = n.split("/");
        dia=Integer.parseInt(a[0]);
        mes=Integer.parseInt(a[0]);
        año=Integer.parseInt(a[0]);
        //comprueba que el rango de meses sea de 1 a 12
        if(mes>0 && mes<12){
            //para el caso de que sea febrero validar los dias
            if(mes==2){
                //para el caso de que sea año bisiesto
                if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
                    //validar que este dentro del rango de dias del año bisiesto
                    if(dia<0 || dia>29)
                        return false;                
                    else return true;
                }
                else{
                    //validar que este dentro de los dias de 1 a 28
                    if (dia<0 || dia>28)
                        return false;
                    else return true;
                }
            }
            else{
                //validar si es mes par excepto el mes 8 que tiene 31 dias
                if(mes%2==0 || mes != 8)
                    //validar el rango de dias de 1 a 31
                    if(dia<0 || dia>30)
                        return false;
                    else return true;
                else{
                    //para validar meses impares y el mes 8 de 31 dias
                    if (mes%2!=0 || mes==8)
                        //validar que esten dentro del ango de dias de 1 a 31
                        if(dia<0 || dia>31)
                            return false;
                        else return true;                
                }
            }return false;
        }else return false;
    }
        
    public void datos(){
        //inicializamos cuenta en 0 para uso posterior
        cuenta=0;
        //creamos variables para guardar dia, mes y año
        int dia, mes, año;
        //creamos un arreglo de nombre fecha para obtener dia, mse, año
        String fecha[];
        for (int i = 0; i < 2; i++) {
           String v = d.readString("Ingresa la fecha en formato dd/mm/aaaa\n"
                   + " o continuar");                      
            if (v=="continuar"){
                //asigna la fecha actual a la variable v
                v=(String)formato.format(fechaActual);
                //creamos el arreglo con la cantidad de veces que tenemos /
                fecha = v.split("/");
                //parseamos a enteros los valores del arreglo
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                año = Integer.parseInt(fecha[2]);
                //mandamos como parametros los datos de la fecha en la posicion
                //i del arreglo
                fechas[i]=new Date(año, mes, dia);
                System.out.println(dia+", "+mes+", "+año);
                //format.format(fechaActual);
                //fechas[i]= new Date(año,mes,dia);
            }else{
                fecha = v.split("/"); 
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                año = Integer.parseInt(fecha[2]);
                fechas[i]=new Date(año, mes, dia); 
                System.out.println(dia+", "+mes+", "+año);
            }                      
        }    
    }    
}
