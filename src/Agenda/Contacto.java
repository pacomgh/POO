/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;


public class Contacto {
    private String nombre, numero, correo;
    
    
    public boolean setNombre(String n){
        if(n==null || n=="")
            return false;
        else{
            nombre=n;
            return true;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean setNumero(String num){
        if(num==null || num=="")
            return false;
        else{
            numero=num;
            return true;
        }
    }
    
    public String getNumero(){
        return numero;
    }
    
    public boolean setCorreo(String c){
        if(c==null || c=="")
            return false;
        else{
            correo=c;
            return true;
        }
    }
    
    public String getCorreo(){
        return correo;
    }
}
