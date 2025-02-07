/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaapp;

import bibliotecaapp.vista.VistaPrincipal;

/**
 *
 * @author yeisson.villamil
 */
public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejecutar la ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
        
    
    }
    
}
