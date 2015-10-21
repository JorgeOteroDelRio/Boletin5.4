/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author joterodelrio
 */
public class MateriaPrimaRestaurante {
    private int polbo;
    private int patacas;
    private final int polbo3Persoas = 2;
    private final int patacas3Persoas = 1;
    
    public void engadirPolbo(int kilosPolbo){
        polbo += kilosPolbo;
    }
    
    public void engadirPatacas(int kilosPatacas){
        patacas += kilosPatacas;
    }
    
    public int amosarPolbo(){
        return polbo;
    }
    
    public int amosarPatacas(){
        return patacas;
    }
    
    public int calcularClientes(){
        int comensalesPolbo = 3 * polbo / 2;
        int comensalesPatacas = 3 * patacas / 1;
        if (comensalesPolbo <= comensalesPatacas){
            return comensalesPolbo;
        }
        else{
            return comensalesPatacas;
        }
    }
    
}
