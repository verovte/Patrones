/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import impresora.principal;

/**
 *
 * @author juani
 */
public class Controlador implements ActionListener, ItemListener{
    public static void main(String[] args) {
        Impresora imp = new Impresora();
        ImpresoraFachada impF = new ImpresoraFachada();
        String tamaño, tipo;
        boolean color = true;
        
        
    }
    
    principal principal;

    Controlador(principal principal) {
        this.principal = principal;
    }
    
    public void iniciar(){}

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
