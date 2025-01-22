/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Decorator;

import java.util.HashMap;

/**
 *
 * @author Daniel
 */
public class PizzaDaNona implements Pizza {

    HashMap<String, Integer> ingredientes;



    public PizzaDaNona(HashMap<String, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int preco() {
        int valor = 0;
        for (Integer i : ingredientes.values()) {
            valor += i;
        }
        return valor;
    }

}
