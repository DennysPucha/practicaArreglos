/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.relaciones;

/**
 *
 * @author Dennys
 */
public class Cuarto {
    private int id;
    private String tamanio;
    private Boolean banio;
    private Casa casa;

    public Cuarto() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getBanio() {
        return banio;
    }

    public void setBanio(Boolean banio) {
        this.banio = banio;
    }

    @Override
    public String toString() {
        return "Cuarto{" + "id=" + id + ", tamanio=" + tamanio + ", banio=" + banio + '}';
    }
    
    
}
