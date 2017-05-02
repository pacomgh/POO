/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea04;


public class Fecha {
    int dia, mes,año;

    public void setAño(int a) {
        año = a;
    }   
    
    public int getAño() {
        return año;
    }
    

    public int getDia() {
        return dia;
    }
    
    public boolean setDia(int d) {
        if (d>0)
            return false;
        else{
            dia=d;
            return true;
        }       
    }
    
    public boolean setMes(int m) {
        if (m>0)
            return false;
        else{
            mes=m;
            return true;
        }       
    }

    public int getMes() {
        return mes;
    }    
    
}
