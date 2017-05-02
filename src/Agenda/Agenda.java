
package Agenda;

import cstio.*;
import java.awt.Color;
import java.io.*;


public class Agenda {
    //atributo para mostrar el mensaje de la meta
    private Dialog d = new Dialog();    
    //atributo para llevar el control final de contactos guardados en la agenda
    private int cont=0,opc;
    //arreglo para usar las propiedades de la clase contacto
    private Contacto c[] = new Contacto[1000];
    //para mandar llamar los metodos o atributos de la misma clase
    Agenda a = new Agenda();
    Pizarra p = new Pizarra();  
    
    //1-meta
    public void meta(){
        d.display("Usar el sustantivo agenda, en equipo de dos personas,\n"
                + " para modelar la clase encapsulada con UML,\n"
                + " y proponer un algoritmo que manipule un arreglo\n"
                + " de apuntadores a dichos objetos.");
    }
    
    //2-Datos
    public void datos(){
        String v="";
        
        while(v!="salir"){
            for(int i=0; i<c.length;i++){
                v = d.readString("ingresa el nombre del contacto\n"
                        + "pasa terminar ingresa 'salir'");       
                if(v.equalsIgnoreCase("salir"))
                    break;
                c[i].setNombre(v);
                v = d.readString("Ingresa el numero del contacto\n"
                        + "para terminar ingresa 'salir'");
                if(v.equalsIgnoreCase("salir"))
                    break;
                c[i].setNumero(v);
                v = d.readString("Ingresa el correo de la persona\n"
                        + "para terminar ingresa 'salir'");
                c[i].setCorreo(v);
                cont++;
            }                
        }       
    }
    
    //3-no hay calculos
    //4-resultados
    public void resultados(){
        Pizarra p = new Pizarra();
        p.setVisible(true);
        
        a.menuContactos();
        
        switch(opc){
            case 1:
                a.verContactos();
                break;
            case 2:
                String b = d.readString("Ingresa la posicion del numero del \n"
                        + "contacto a buscar");
                int n = Integer.parseInt(b);
                p.out("Contacto "+(n+1)+"\n"
                    + "Nombre: "+c[n].getNombre()+"\n"
                    + "Numero: "+c[n].getNumero()+"\n"
                    + "Correo: "+ c[n].getCorreo()+"\n");
                break;
            case 3:
                d.display("Gracias por usar nuestro software");
                break;
        }
        
    }
    
    public void verContactos(){
        for(int j=0; j<cont;j++){
            p.out("Contacto "+(j+1)+"\n"
                    + "Nombre: "+c[j].getNombre()+"\n"
                    + "Numero: "+c[j].getNumero()+"\n"
                    + "Correo: "+ c[j].getCorreo()+"\n");                        
        }        
    }
    
    public void menuContactos(){
        String m = d.readString("Deseas:\n"
                + "1)Ver todos los contactos\n"
                + "2)Buscar contacto\n"
                + "3)Salir");
        opc=Integer.parseInt(m);
    }    
}


