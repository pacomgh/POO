/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio32;
import java.util.ArrayList;

/**
 *
 * @author Paco Guzmán
 */
public class Box {
    private ArrayList e;
    
    public void setObject(String n){        
        e.add(n);       
    }
    
    public ArrayList getE(){
        return e;    
    }
    
    @Override
    public String toString(){
        return "El objeto construido es: "+getE();
    }    
}
