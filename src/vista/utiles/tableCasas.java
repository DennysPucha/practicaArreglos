/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.utiles;

import controlador.CasaController;
import javax.swing.table.AbstractTableModel;
import modelo.Casa;

/**
 *
 * @author Dennys
 */
public class tableCasas extends AbstractTableModel{
    private CasaController cControl;

    public CasaController getcControl() {
        return cControl;
    }

    public void setcControl(CasaController cControl) {
        this.cControl = cControl;
    }

    
    @Override
    public int getRowCount() {
        return cControl.getCasa().length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "NUM";
            case 1: return "NOMBRE";   
            case 2: return "COLOR";
            case 3: return "DIRECCION";
                default: return null;
            }
    }

    
        
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Casa e= cControl.obtenerCasa(rowIndex);
            switch (columnIndex) {
            case 0: return (e != null)? rowIndex+1 : "NO DEFINIDO";
            case 1: return (e != null)? e.getNombre() : "NO DEFINIDO";   
            case 2: return (e != null)? e.getColor() : "NO DEFINIDO";
            case 3: return (e != null)? e.getDireccion(): "NO DEFINIDO";
           default: return null;
    }
    }
    
}
