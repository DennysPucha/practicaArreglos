/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Utilidades.SaveLoad;
import controlador.CasaController;
import controlador.Listas.ListaEnlazada;
import exceptions.PosicionFueraDeLimites;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Color;
import modelo.relaciones.Casa;
import modelo.relaciones.Cuarto;
import modelo.relaciones.Edificio;


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

//        Casa s1 = new Casa();
//        Casa s2 = new Casa(Color.Rojo, "nose", 5, Boolean.TRUE, "direccion");
//        Casa s3 = new Casa(Color.Rojo, "nose", 5, Boolean.TRUE, "direccion");
//        Casa s4 = new Casa(Color.Rojo, "nose", 5, Boolean.TRUE, "direccion");
//        Casa s5 = new Casa(Color.Rojo, "nose", 5, Boolean.TRUE, "direccion");
//
//        s1.setColor(Color.Rojo);
//        s1.setDireccion("enrique segoviano");
//        CasaController cControl = new CasaController(5);
//        System.out.println(cControl);

//        cControl.insertarEnPosicion(4, s1);
//        cControl.insertarEnPosicion(2, s2);
//        System.out.println(cControl);
//        cControl.eliminarCasa(4);
//        System.out.println(cControl);
//        Casa aux=cControl.obtenerCasa(4);
//        System.out.println(aux);
//        try {
//            cControl.insertar(s5);
//            cControl.insertar(s2);
//            cControl.insertar(s3);
//            cControl.insertar(s4);
//            cControl.insertar(s1);
//            cControl.insertar(s5);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        System.out.println(cControl);
//        Casa aux;
//        try {
//            aux = cControl.obtenerCasa(6);
//        } catch (PosicionFueraDeLimites ex) {
//            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        ListaEnlazada<Casa> listCasa= new ListaEnlazada<>();
//        listCasa.insertar(s5);
//        listCasa.insertar(s4);
//        
  
//          Casa a1= new Casa();
//          a1.setPisos(5);
//          a1.setDireccion("enrique segoviano");
//          a1.setId(5);
////          System.out.println(a1);
//          ListaEnlazada<Integer> listprueba= new ListaEnlazada<>();
//          try {
//            listprueba.insertar(4);
//            listprueba.insertar(6);
//            SaveLoad.guardarEnJson(listprueba, "casaejemplo");
//            ListaEnlazada<Integer> add= SaveLoad.cargarJson(ListaEnlazada.class, "casaejemplo.json");
//            add.imprimir();
////            Casa obtenida = SaveLoad.cargarJson(Casa.class, "casaejemplo.json");
////              System.out.println(obtenida);
//        } catch (Exception e) {
//              System.out.println(e);
//        }
//    }
        Casa newc= new Casa();
        newc.setDireccion("aaa");
        newc.setPisos(5);
        newc.getDireccion();
        newc.getPisos();
        
        System.out.println(newc);
    }
}
