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
public class PizzariaDaNona {
    public static void main(String[] args){
        HashMap<String, Integer> ingredientes = new HashMap<>();
        ingredientes.put("Massa", 10);
        ingredientes.put("Mussarela", 20);
        ingredientes.put("Tomate", 5);
        ingredientes.put("Manjericão", 5);
        
        Pizza marguerita = new PizzaDaNona(ingredientes);
        Pizza minhaSuperMarguerita = new ExtraGrande(new BordaRecheada(new MassaIntegral(marguerita)));
        System.out.println("Minha pizza custará: R$"+minhaSuperMarguerita.preco());
        
    } 
}
