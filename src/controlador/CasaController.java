/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import exceptions.PosicionFueraDeLimites;
import exceptions.SinPosicionesParaInsertar;
import java.lang.reflect.Field;
import modelo.Casa;

/**
 *
 * @author Dennys
 */
public class CasaController {

    private Casa[] casas;
    
    public CasaController(Integer size) { //5
        this.casas = new Casa[size];
        for (int i = 0; i < size; i++) {//[null,null,null,null,null]
            this.casas[i] = new Casa();
        }
    }

    
    public Boolean insertar(Casa casa) throws SinPosicionesParaInsertar{
        int posicionLibre=-1;
        for (int i = 0; i < this.casas.length; i++) {
            if(this.casas[i].getColor()==null && this.casas[i].getCuartos()==null && this.casas[i].getDireccion()==null && this.casas[i].getNombre()==null){
                posicionLibre=i;
                break;
            }
        }
        if(posicionLibre==-1){
            throw new SinPosicionesParaInsertar();
        }
        this.casas[posicionLibre]=casa;
        return true;
    }
    
    
    public Boolean insertarEnPosicion(Integer posicion, Casa casa) throws PosicionFueraDeLimites{
        if (posicion > this.casas.length) {
            throw new PosicionFueraDeLimites();
        }
        this.casas[posicion] = casa;
        return true;
    }

    
    public Boolean eliminarCasa(Integer posicion) throws PosicionFueraDeLimites{
        if (posicion > this.casas.length) {
            throw  new PosicionFueraDeLimites();
        }
        this.casas[posicion]=new Casa();
        return true;
    }


    public Casa obtenerCasa(Integer posicion) throws PosicionFueraDeLimites{ //4
          if (posicion > this.casas.length){
              throw new PosicionFueraDeLimites();
          } 
          return this.casas[posicion];
    }
    
    
    
    public Casa[] getCasas() {
        return casas;
    }

    public void setCasas(Casa[] casa) {
        this.casas = casa;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < casas.length; i++) {
            aux += "Casa" + i + "color=" + casas[i].getColor() + ", nombre=" + casas[i].getNombre() + ", cuartos=" + casas[i].getCuartos() + ", direccion=" + casas[i].getDireccion() + "\n";
        }
        return aux;
    }

}
