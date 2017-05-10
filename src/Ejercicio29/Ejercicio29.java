/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio29;

import cstio.Dialog;
import cstio.Pizarra;

/**
 *
 * @author Paco Guzmán
 */
public class Ejercicio29 extends Bird{
    int opc;
    private Dialog d = new Dialog();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio29 c = new Ejercicio29();
        
        c.meta();
        c.resultados();
    }  
    
    //1.- meta
    public void meta(){
        d.display("Ejercicio 29: Favor de modelar un algoritmo para desplegar\n"
                + "imagenes en una pizarra de acuerdo al diagrama UML que \n"
                + "comienza con la interface Flyer.java. Si su # es impar usa\n"
                + "pajaros para cada metodo proporcionado por la especificacion\n"
                + "De otro modo use figuras de superman.");
    }
    
    //2.- no hay datos.
    //3.- no hay calculos.
    //4.- resultados   
    public void resultados(){
        //Pizarra p = new Pizarra();
        
        //Bird b = new Bird();
        
        switch(menu()){
            case 1:                
               takeOff();
               p.ofoto("images/takeOff.jpg");
               //p.setVisible(true);
                break;
            case 2:
                land();
                break;
            case 3:
                fly();
                break;
            case 4: 
                buildNest();
                break;
            case 5:
                layEggs();
                break;
            case 6:
                d.display("Gracias por utilizar nuestro software");
                break;
            default:
                d.display("La opcion que intriduciste no es valida");
                break;
        }
    }
    
    public int menu(){
        String v = d.readString("Que imagen de ave deseas ver?\n"
                + "1)Despegar\n"
                + "2)Aterrizar\n"
                + "3)Volando\n"
                + "4)Empollando\n"
                + "5)Construyendo nido\n"
                + "6)Salir");
        opc=Integer.parseInt(v);
                
        return opc;
    }
    
}
