/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.utiles;
import controlador.Listas.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Casa;

/**
 *
 * @author Dennys
 */
public class tableCasasListas extends AbstractTableModel {

    private ListaEnlazada<Casa> casalist= new ListaEnlazada<>();

    public ListaEnlazada<Casa> getCasalist() {
        return casalist;
    }

    public void setCasalist(ListaEnlazada<Casa> casalist) {
        this.casalist = casalist;
    }

 
    @Override
    public int getRowCount() {
        return this.casalist.getSize();
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
            Casa e = this.casalist.obtener(rowIndex);
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
