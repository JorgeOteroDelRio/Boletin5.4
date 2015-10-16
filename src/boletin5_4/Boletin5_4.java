/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MateriaPrimaRestaurante restaurante = new MateriaPrimaRestaurante();
        int polbos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a cantidade de polbos que hai no almacén:"));
        int patacas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a cantidade de patacas que hai no almacén:"));
        restaurante.engadirPolbo(polbos);
        restaurante.engadirPatacas(patacas);
        JOptionPane.showMessageDialog(null, "A cantidade de clientes que poder comer hoxe no restaurante polbo e patacas son: " + restaurante.calcularClientes());
    }
    
}
