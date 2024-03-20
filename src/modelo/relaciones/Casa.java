/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.relaciones;

import controlador.Listas.ListaEnlazada;

/**
 *
 * @author Dennys
 */
public class Casa extends Edificio{
   private int id;
   private String color;
   private String descripcion;
   private ListaEnlazada<Cuarto> cuartos;

    public Casa() {
    }
   
   @Override
    public int getId() {
        return id;
    }

   @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); 
    }

    @Override
    public Integer getPisos() {
        return super.getPisos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPisos(Integer pisos) {
        super.setPisos(pisos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", color=" + color + ", descripcion=" + descripcion + '}' + super.getDireccion()+ super.getPisos();
    }
    
 
   
   
}
