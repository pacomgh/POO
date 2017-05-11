/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio32;

import cstio.*;
import java.io.IOException;

public class Ejercicio32 {
    Dialog d= new Dialog();
    Box b = new Box();

   
    public static void main(String[] args) throws IOException{
        Ejercicio32 a = new Ejercicio32();
        
        Pizarra p = new Pizarra();
        String resp="s";
        
        while(resp.equalsIgnoreCase("s")){
            a.meta();
            a.datos();
            a.resultados();
            resp = a.d.readString("Deseas ingresar otro objeto?");
            if(resp.equalsIgnoreCase("s"))
                System.exit(0);
            System.in.skip(2);
        }
       
    }
    
    //1.- meta
    public void meta(){
        d.display("Codificar un algoritmo que permita almacenar un objeto\n"
                + "cualquiera en una caja y desplegarlo.");
    }
    
    //2.- datos
    public void datos(){
        String v = d.readString("Ingresa tu dato");
        b.setObject(v);
    }
    
    //3.-Operaciones no hay
    //5.- resultados
    public void resultados(){
        d.display(b.toString());
    }
    
}
