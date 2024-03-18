/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

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

    public Boolean insertarCasa(Integer posicion, Casa casa) {
        if (posicion > this.casas.length) {
            System.out.println("Tamanio mas alto que el del arreglo");
            return false;
        }
        this.casas[posicion] = casa;
        return true;
    }

    public Boolean eliminarCasa(Integer posicion) {
        if (posicion > this.casas.length) {
            System.out.println("Tamanio mas alto que el del arreglo");
            return false;
        }
        this.casas[posicion]=new Casa();
        return true;
    }

    public Casa obtenerCasa(Integer posicion){ //4
        if (posicion > this.casas.length) {
            System.out.println("Tamanio mas alto que el del arreglo");
            return null;
        }
        return this.casas[posicion];//[null,null,null,null,null]
    }
    
    public Casa[] getCasa() {
        return casas;
    }

    public void setCasa(Casa[] casa) {
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
