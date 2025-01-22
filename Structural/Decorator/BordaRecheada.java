/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Decorator;

/**
 *
 * @author Daniel
 */
public class BordaRecheada extends PizzaDecorator{
        
    BordaRecheada(Pizza p){
        super(p);
    }
    
    public int preco(){
        return super.pizzaDecorada.preco() + 10;
    }
}
