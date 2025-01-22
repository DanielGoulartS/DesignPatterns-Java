/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Creational.Builder;

/**
 *
 * @author Daniel
 */
public class LivroDeReceitas {

    String massa = "integral";
    String sabor = "Peperone";
    
    public Pizza Cozinhar(){
        return new Pizza(massa, sabor);
    }

}
