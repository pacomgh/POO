/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio29;
import cstio.*;


public class Bird extends Flyer {
    Pizarra p = new Pizarra();
    //atgregar fotos correspondientes
    @Override
    public void takeOff(){
        p.setVisible(true);
        p.ofoto("images/takeOff.jpg");         
    }
    @Override
    public void land(){
        p.setVisible(true);
        p.ofoto("POO\\src\\Ejercicio29\\images\\land.jpg"); 
    }
    
    public void fly(){
        p.ofoto("images/fly.jpg"); 
    }
    
    public void buildNest(){
        p.ofoto("images/buildNest.jpg"); 
    }
    
    public void layEggs(){
        p.ofoto("images/layEggs.jpg"); 
    }
    
}
