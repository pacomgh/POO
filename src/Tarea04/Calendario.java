/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import cstio.*;

public class Calendario {
    int cuenta;
    //damos el formato para las fechas que se ingresaran
    String patron = "dd/MM/yyyy";
    SimpleDateFormat formato = new SimpleDateFormat(patron);
    //Trae la fecha actual
    Date fechaActual = Calendar.getInstance().getTime();
    //creamos arreglo de apuntadores a objetos de la clase Date()
    Calendar fechas[] = new Calendar[1000];
    //añadimos el arreglo de diferencias para las fechas
    //Calendar diferencia[];
   //creamos el atributo d c
    Dialog d = new Dialog();
    //Creamos un arreglo de apuntadores a objetos de la clase fecha
    Fecha diferencias[];
    
    public static void main(String[] args) {
        Calendario c = new Calendario();
        // TODO code application logic here
        //System.out.println(c.fechaActual);
        //System.out.println(c.formato.format(c.fechaActual));
        c.datos();
        //c.algo();
        //for (int i = 0; i < 2; i++)
            //System.out.println(c.diferencia[i].getTime());            
        
        //System.out.println(c.validar("01/12/2012"));
        
    }
    
    public boolean validar(String n){
        int dia, mes, año;
        String a[] = n.split("/");
        //System.out.println(a[0]+" "+a[1]+" "+a[2]);
        dia=Integer.parseInt(a[0]);
        mes=Integer.parseInt(a[1]);
        año=Integer.parseInt(a[2]);
        //comprueba que el rango de meses sea de 1 a 12
        if(mes>0 && mes<=12){
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
                    if(dia<0 || dia>28)
                        return false;
                    else return true;
                }
            }
            else{
                //validar si es mes par excepto el mes 8 que tiene 31 dias
                if(mes != 8 && mes%2==0)
                    //validar el rango de dias de 1 a 31
                    if(dia<0 || dia>30)
                        return false;
                    else return true;
                else{
                    //para validar meses impares y el mes 8 de 31 dias
                    if (mes==8 || mes%2!=0)
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
        String fecha[], v="algo", conti="";
        for (int i = 0; i < 2; i++) {
            do{
                if(v.equalsIgnoreCase("continuar"))
                    break;                
                v = d.readString("Ingresa la fecha en formato dd/mm/aaaa \n"
                   + " o 'continuar'");                 
                //Asigna la fecha acutal a la variable de lectura v
                if (v.equalsIgnoreCase("continuar")){
                    conti=v;
                    v=(String)formato.format(fechaActual);
                    //System.out.println("entro al if");
                }
                //System.out.println("fehcas ingresada por el usuario"+v);                
            }while(!validar(v));
            
            System.out.println(v);
            if (v.equalsIgnoreCase(formato.format(fechaActual))){
                //System.out.println("fechas "+v);
                //asigna la fecha actual a la variable v
                //v=(String)formato.format(fechaActual);
                //creamos el arreglo con la cantidad de veces que tenemos /
                fecha = v.split("/");
                //parseamos a enteros los valores del arreglo
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                año = Integer.parseInt(fecha[2]);
                //Inicializamos el arreglo con una instancia de calendar en la
                //posicion i del arreglo                
                fechas[i] = Calendar.getInstance();
                //introducimos el año
                fechas[i].set(Calendar.YEAR, año);
                //introducimos el mes
                fechas[i].set(Calendar.MONTH, mes-1);
                //introducimos el dia
                fechas[i].set(Calendar.DAY_OF_MONTH, dia);
                //System.out.println(dia+", "+mes+", "+año);
                //format.format(fechaActual);
                //fechas[i]= new Date(año,mes,dia);
                //System.out.println(v);
            }else{
                System.out.println(" "+v);
                fecha = v.split("/"); 
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                año = Integer.parseInt(fecha[2]);
                fechas[i] = Calendar.getInstance();
                fechas[i].set(Calendar.YEAR, año);
                fechas[i].set(Calendar.MONTH, mes-1);
                fechas[i].set(Calendar.DAY_OF_MONTH, dia);
                //System.out.println(dia+", "+mes+", "+año);
            }  
            cuenta++;
            if (conti.equalsIgnoreCase("continuar"))
                break;
        }    
    }  
    
    public void showB(){
        //inicializamos el arreglo para guardar las diferencias
        diferencias=new Fecha[cuenta];
        int dia1, mes1, año1, dia2, mes2, año2, auxDia;
        String partes1[], partes2[];
                
        for(int j=0; j<cuenta;j++){
            partes1 = new String[2];
            dia1 = fechas[j].get(Calendar.DATE);
            mes1 = fechas[j].get(Calendar.MONTH);
            año1 = fechas[j].get(Calendar.YEAR);
            
            partes2 = new String[2];
            dia2 = fechas[j+1].get(Calendar.DATE);
            mes2 = fechas[j+1].get(Calendar.MONTH);
            año2 = fechas[j+1].get(Calendar.YEAR);
            
            diferencias[j] = new Fecha();
            diferencias[j].dia=(dia1-dia2);
            diferencias[j].mes=(mes1-mes2);
            diferencias[j].año=(año1-año2);
        }        
    }
    
    public void algo(){
        int dia1, mes1, año1, dia2, mes2, año2, auxDia, auxMes, auxAño;
        //le damos la longitud al arreglo
        diferencias = new Fecha[cuenta];
        boolean band;
        
        for (int n = 0; n < cuenta; n++) {
            band=false;
            auxDia=0; auxMes=0; auxAño=0;
            //inicializamos el arreglo de objetos en cada posicion con el pojo
            //de fecha
            diferencias[n]=new Fecha();
            //Asignamos dia, mes y año a cada variable de la posicion corresp.
            dia1=fechas[n].get(Calendar.DATE);
            mes1=fechas[n].get(Calendar.MONTH);
            System.out.println("mes"+fechas[n].get(Calendar.MONTH));
            año1=fechas[n].get(Calendar.YEAR);
            
            dia2=fechas[n+1].get(Calendar.DATE);
            mes2=fechas[n+1].get(Calendar.MONTH);
            año2=fechas[n+1].get(Calendar.YEAR); 
            //Le damos el valor a año y mes segun la diferencia entre cada uno
            auxAño=(año1-año2);
            auxMes=(mes1-mes2);
            
            //estas desiciones son para ver la diferencia entre los dias de los 
            //meses ingresado.
            if(mes1==2){
                //para el caso de que sea año bisiesto
                if ((año1 % 4 == 0) && ((año1 % 100 != 0) || (año1 % 400 == 0))){
                    //si es año bisiesto se juega con el 29
                    auxDia+=((dia1-29)+dia2);
                }
                else
                    //si no es año bisiesto se hace con 28 dias
                    auxDia+=((dia1-28)+dia2);                              
            }
            //en estas desiciones restaremos los dias del mes actual segun sea
            //y le sumaremos los del siguiente mes(asignado en las fechas dadas)
            //y lo sumaremos para obtener los dias totales
            else if(mes1 != 8 && mes1%2==0)//Para el caso de mes par
                auxDia+=((dia1-30)+dia2);
            else if (mes1==8 || mes1%2!=0)//para el caso de mes impar
                auxDia+=((dia1-31)+dia2);  
            //para estas desiciones si la diferencia de meses es menor 1 sumaremos
            //los dias correspondientes a los dias que ya tenemos
            if(auxMes<0){
                //si los meses son negativos los convertimos a positivos
                //para poder hacer las operaciones mas facil
                auxMes*=-1;
                //diferencias[n].setMes(diferencias[n].getMes()*-1);
                //esta bandera indica que hora la desta de los meses ahora es
                //positivo, en casi de que inicialmente fueran negativos
                band=true;
            }
            if(auxMes>1){
                //Iteramos hasta que i sea menor que los meses de diferencia
                //se inicia en dos ya que si solo es un mes ya se obtuvieron
                //los dias en el primer for, y de ser mayor a dos ahora si se 
                //sumarian los dias de cada mes
                for (int i = 2; i <=  auxMes; i++){
                    //si es mes par se le suman 30 dias
                    if(auxMes%2==0)
                        auxDia+=30;                    
                    //si es un mes par se agregan 30 dias
                    else if(auxMes%3==0)                        
                        auxDia+=31;
                    //si los meses son mayores a 11 se le suma un dia mas por el
                    //mes 8 que tiene 31 dias                    
                    if(auxMes>11)
                        auxDia+=1;
                }            
            }
            if (auxAño>1) {
                diferencias[n].setDia(auxAño*365);
            }                            
            diferencias[n].setMes((auxDia/30));
            diferencias[n].setDia(auxDia%30);
            diferencias[n].setAño(diferencias[n].getMes()/12);
            diferencias[n].setMes(diferencias[n].getMes()%12);
            System.out.println("La diferencia entre "+fechas[n].getTime()+" y \n"
                + fechas[n+1].getTime()+" es: "+diferencias[n].getDia()+" dias, \n"
                + diferencias[n].getMes()+" meses, "+diferencias[n].getAño()+" años");
        }           
    }
}