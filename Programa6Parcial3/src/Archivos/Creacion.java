/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Plascencia
 */
public class Creacion {

    public static void main(String[] args) {
        //Si el archivo no existe lo crea, si no existe lo abre para agregar
        try {
            String r = "n";
            FileWriter archivo = new FileWriter("datos.txt");
            do {
                archivo.write(JOptionPane.showInputDialog("Escribe un dato") + "\n");
                r = JOptionPane.showInputDialog("Desas escribir otro dato");
            } while (r.equals("s"));
            archivo.close();

        } catch (IOException ex) {
            Logger.getLogger(Creacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
