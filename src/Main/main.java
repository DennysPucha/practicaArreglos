/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controlador.CasaController;
import modelo.Casa;
import modelo.Color;

/**
 *
 * @author Dennys
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa s1= new Casa();
        Casa s2= new Casa(Color.Rojo, "nose", 5, Boolean.TRUE,"direccion");
        
        s1.setColor(Color.Rojo);
        
        CasaController cControl = new CasaController(5);
//        System.out.println(cControl);
        
        cControl.insertarCasa(4, s1);
        cControl.insertarCasa(2, s2);
        System.out.println(cControl);
        cControl.eliminarCasa(4);
        System.out.println(cControl);
        Casa aux=cControl.obtenerCasa(4);
        System.out.println(aux);
        
    }
    
}
