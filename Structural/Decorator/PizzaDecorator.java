/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Decorator;

/**
 *
 * @author Daniel
 */
public abstract class PizzaDecorator implements Pizza {

    Pizza pizzaDecorada;

    PizzaDecorator(Pizza pizza) {
        pizzaDecorada = pizza;
    }
}
