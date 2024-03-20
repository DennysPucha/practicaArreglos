/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.relaciones;

/**
 *
 * @author Dennys
 */
public class Edificio {
    
    private int id;
    private String direccion;
    private Integer pisos;

    public Edificio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Edificio{" + "id=" + id + ", direccion=" + direccion + ", pisos=" + pisos + '}';
    }
    
    
    
}
