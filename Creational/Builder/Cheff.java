/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Creational.Builder;

/**
 *
 * @author Daniel
 */
public class Cheff {
    
    LivroDeReceitas ldr;

    public Cheff(LivroDeReceitas ldr) {
        this.ldr = ldr;
    }

    public Pizza Preparar(){
        System.out.printf("Saindo uma pizza de massa %s, sabor %s!!! Hmnmn...",this.ldr.massa, this.ldr.sabor);
        return ldr.Cozinhar();
    }
        
    
}
