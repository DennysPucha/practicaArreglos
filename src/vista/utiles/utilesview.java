/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.utiles;

import javax.swing.JComboBox;
import modelo.Color;

/**
 *
 * @author Dennys
 */
public class utilesview {
    public static JComboBox cargarOptionsCbx(JComboBox combo){
        for (int i = 0; i < Color.values().length; i++) {
            combo.addItem(Color.values()[i]);
        }
        return combo;
    }
}
