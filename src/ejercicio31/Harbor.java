/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio31;

/**
 *
 * @author Paco Guzmán
 */
public class Harbor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Harbor bostonHarbor = new Harbor();
        RiverBarge barge = new RiverBarge();
        SeaPlane sPlane = new SeaPlane();
        
        bostonHarbor.givePermissionToDock(barge);
        bostonHarbor.GivePersmissionToDock(sPlane);
    }
    
    private void givePermissionToDock(Sailor s){
        s.dock();    
    }
    
}
