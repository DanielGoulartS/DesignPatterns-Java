/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Decorator;

/**
 *
 * @author Daniel
 */
public class ExtraGrande extends PizzaDecorator{
        
    ExtraGrande(Pizza p){
        super(p);
    }
    
    public int preco(){
        return (int) (super.pizzaDecorada.preco() * 1.3);
    }
}
