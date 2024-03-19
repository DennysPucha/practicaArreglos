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
public class tableCasas extends AbstractTableModel {

    private CasaController cControl;

    public CasaController getcControl() {
        return cControl;
    }

    public void setcControl(CasaController cControl) {
        this.cControl = cControl;
    }

    @Override
    public int getRowCount() {
        return cControl.getCasas().length;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "NUM";
            case 1 ->
                "NOMBRE";
            case 2 ->
                "COLOR";
            case 3 ->
                "DIRECCION";
            case 4-> 
                "HABITACIONES";
            default ->
                null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Casa e = cControl.obtenerCasa(rowIndex);
            return switch (columnIndex) {
                case 0 ->(e != null) ? rowIndex + 1 : "NO DEFINIDO";
                case 1 ->(e != null) ? e.getNombre() : "NO DEFINIDO";
                case 2 ->(e != null) ? e.getColor() : "NO DEFINIDO";
                case 3 -> (e != null) ? e.getDireccion() : "NO DEFINIDO";
                case 4 ->(e!=null)? e.getCuartos(): "NO DEFINIDO";
                default ->
                    null;
            };
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
