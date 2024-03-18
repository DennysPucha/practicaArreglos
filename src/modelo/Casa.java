/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.List;

/**
 *
 * @author Dennys
 */
public class Casa {
    private Color color;
    private String nombre;
    private Integer cuartos;
    private Boolean estado;
    private String direccion;

    public Casa() {
//        System.out.println("Esta llamando a este");
    }

    public Casa(Color color, String nombre, String direccion) {
        this();
        this.color = color;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    
    public Casa(Color color, String nombre, Integer cuartos, Boolean estado, String direccion) {
        this();
        this.color = color;
        this.nombre = nombre;
        this.cuartos = cuartos;
        this.estado = estado;
        this.direccion = direccion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getCuartos() {
        return cuartos;
    }

    public void setCuartos(Integer cuartos) {
        this.cuartos = cuartos;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" + "color=" + color + ", nombre=" + nombre + ", cuartos=" + cuartos + ", estado=" + estado + ", direccion=" + direccion + '}';
    }

     
  
    
}
